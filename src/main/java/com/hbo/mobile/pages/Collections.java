package com.hbo.mobile.pages;

import com.hbo.mobile.shared.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mushfiquesalaheen on 2/19/15.
 */
public class Collections {
    private AppiumDriver driver = null;
    private static Logger log = Logger.getLogger(Comedy.class.getName());
    public String appType = null;
    public String device = null;
    public Utils utils = null;


    public Collections(AppiumDriver driver, String appType, String device)
    {
        this.driver = driver;
        this.appType = appType;
        this.device = device;
        utils = new Utils(driver,appType);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
