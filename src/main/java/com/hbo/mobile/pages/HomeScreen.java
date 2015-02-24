package com.hbo.mobile.pages;

import com.hbo.mobile.shared.Utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.NoSuchElementException;

/**
 * Created by azaman on 9/23/14.
 */
public class HomeScreen
{
    private AppiumDriver driver = null;
    private static Logger log = Logger.getLogger(HomeScreen.class.getName());

    public Utils utils = null;
   
    //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.Button[1]
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.Button[1]")                            
    private WebElement signIn;
    
    
    @AndroidFindBy(xpath = "Sign In (Existing Users)")
    private WebElement signInExistingUser;

    
    public HomeScreen(AppiumDriver driver)
    {
        this.driver = driver;
        utils = new Utils(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickSignInExistingUser()
    {
    	utils.waitForElement(signInExistingUser).click();
    	log.info("Clicked SignIn Existing User button");
    }


}
