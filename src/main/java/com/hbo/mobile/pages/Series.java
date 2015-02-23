package com.hbo.mobile.pages;

import com.hbo.mobile.shared.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mushfiquesalaheen on 2/18/15.
 */
public class Series
{

    private AppiumDriver driver = null;
    private static Logger log = Logger.getLogger(HomeScreen.class.getName());
    public String appType = null;
    public String device = null;
    public Utils utils = null;

    @iOSFindBy(name = "Featured")
    private WebElement featured;




    public Series(AppiumDriver driver, String appType, String device)
    {
        this.driver = driver;
        this.appType = appType;
        this.device = device;
        utils = new Utils(driver,appType);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //4 tabs must display in top-center section of page:
        //“ALL SERIES” – enabled/selected by default
    //Asset images and titles must display in grid format – landscape mode
    //Asset images and titles must display in list format – portrait mode

    //“FEATURED EPISODES” –
    //Asset images and titles must display in tile format – landscape mode
    //Asset images and titles must display as carousel – portrait mode

    //“LATINO SERIES”:
    //Asset images and titles must display in grid format – portrait and landscape mode

    //“FAMILY SERIES”:
    //Asset images and titles must display in grid format – portrait and landscape mode"



}
