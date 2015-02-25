package com.hbo.mobile.test;

import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by mushfiquesalaheen on 2/24/15.
 */
public class SignOut extends BaseTest
{


    //@Test
    public void config() throws InterruptedException
    {
        /// clicking the settings button
    driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]")).click();
    Thread.sleep(2000);
        //// sign out button clicked
    driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.Button[1]")).click();
        Thread.sleep(2000);
        /// are you sure u want to sign out??
    driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.Button[2]")).click();
    Thread.sleep(2000);
        //// you have successfully signed out
    driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.Button[1]")).click();
    Thread.sleep(2000);
        ////// sign in button clicked
    driver.findElement(By.name("Sign In")).click();
        ///choose another provider
    driver.findElement(By.name("Choose Another Provider")).click();
        ///select television provider
    driver.findElement(By.name("Select Television Provider")).click();



   }




}
