package com.hbo.mobile.test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by asadzaman on 2/20/15.
 */
public class BaseTest
{
    public static AppiumDriver driver;
    private static Logger log = Logger.getLogger(BaseTest.class.getName());
    
    @Before
    public void startMobileApp() throws MalformedURLException
    {
        DOMConfigurator.configure("log4j.xml");
        File app = null;
        File appDir = null;
        appDir = new File("src/test/app");
        app = new File(appDir, "hbogo.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "4d00cd9d46635039");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        log.info("Android APP opened");

    }

    @After
    public void stopMobileApp()
    {
        driver.quit();
        log.info("Android App closed");
        
    }




}


