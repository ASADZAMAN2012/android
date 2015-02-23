package com.hbo.mobile.pages;

import com.hbo.mobile.shared.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mushfiquesalaheen on 2/18/15.
 */
public class Sports
{
    private AppiumDriver driver = null;
    private static Logger log = Logger.getLogger(HomeScreen.class.getName());
    public String appType = null;
    public String device = null;
    public Utils utils = null;

    public Sports(AppiumDriver driver, String appType, String device)
    {
        this.driver = driver;
        this.appType = appType;
        this.device = device;
        utils = new Utils(driver,appType);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //2 tabs must display in top center section of page below the HBOGO logo

    //“FEATURED”: enabled/selected by default.
    //Asset images and titles must display in list format – portrait mode
    //Asset images and titles must display as carousel – landscape mode

    //“SPORTS A TO Z”
    //Asset names must display in alphabetical order (list format) with length and rating – portrait mode
    //Asset images and titles must display in grid format – landscape mode




}
