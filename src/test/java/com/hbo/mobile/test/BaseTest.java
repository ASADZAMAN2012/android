package com.hbo.mobile.test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
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
    public String appType = null;
    public String device = null;

    @Before
    public void startMobileApp() throws MalformedURLException
    {
        DOMConfigurator.configure("log4j.xml");
        appType = System.getProperty("app");
        device = System.getProperty("device");
        File app = null;
        File appDir = null;

        if(appType.contains("IOS"))
        {
            appDir = new File("src/test/app");

            DesiredCapabilities capabilities = new DesiredCapabilities();

            if(device.contains("iphoneSimulator"))
            {
                //app = new File(appDir, "HBOGO.zip");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
                app = new File(appDir, "TVTruck2.zip");
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");

            }

            if(device.contains("ipad"))
            {
                //app = new File(appDir, "HBOGO.zip");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
                app = new File(appDir, "TVTruck-ipad.zip");
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPad Air");

            }

            capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
            driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

            //driver = new AppiumDriver(new URL("http://10.182.243.12:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            log.info("IOS APP opened");
        }

        else if(appType.contains("Android"))
        {
            if(device.contains("phone"))
            {
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

        }


    }

    @After
    public void stopMobileApp()
    {
        driver.quit();

        if(appType.contains("IOS"))
        {
            log.info("IOS App closed");
        }
        else if(appType.contains("Android"))
        {
            log.info("Android App closed");
        }
        else if(appType.contains("demo"))
        {
            log.info("demo only");
        }

    }




}


