package com.hbo.mobile.pages;

import com.hbo.mobile.shared.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mushfiquesalaheen on 2/18/15.
 */
public class Settings
{
    private AppiumDriver driver = null;
    private static Logger log = Logger.getLogger(Settings.class.getName());
    public String appType = null;
    public String device = null;
    public Utils utils = null;

    @AndroidFindBy(name="GO Profile")
    @iOSFindBy(name="GO Profile")
    private WebElement goProfile;

    @AndroidFindBy(name="Video Playback")
    @iOSFindBy(name="Video Playback")
    private WebElement videoPlayback;

    @AndroidFindBy(name="Help")
    @iOSFindBy(name="Help")
    private WebElement help;

    @AndroidFindBy(name="Privacy Policy")
    @iOSFindBy(name="Privacy Policy")
    private WebElement privacyPolicy;

    @AndroidFindBy(name=" Terms of Use")
    @iOSFindBy(name=" Terms of Use")
    private WebElement  termsOfUse;

    @AndroidFindBy(name=" Legal Notices")
    @iOSFindBy(name=" Legal Notices")
    private WebElement legalNotices;

    @AndroidFindBy(name=" Version")
    @iOSFindBy(name=" Version")
    private WebElement  Version;

    @AndroidFindBy(name=" Internal Use")
    @iOSFindBy(name=" Internal Use")
    private WebElement  internalUse ;

    @AndroidFindBy(name=" Environment/Region")
    @iOSFindBy(name=" Environment/Region")
    private WebElement environment ;

    public Settings(AppiumDriver driver, String appType, String device)
    {
        this.driver = driver;
        this.appType = appType;
        this.device = device;
        utils = new Utils(driver,appType);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public void clickOnVideoPlayback() throws InterruptedException {
        if(appType.contains("Android"))
        {
            Thread.sleep(10000);
        }
        else if(device.contains("ipadSimulator"))
        {
            videoPlayback.click(); // driver.findelement(By.name="video").click();
            log.info("video play button clicked");
        }
        else if(device.contains("iphoneSimulator"))
        {
            utils.waitForElement(videoPlayback).click();
            log.info("video play button clicked");
        }
        else if(device.contains("iphone"))
        {
            utils.waitForElement(videoPlayback).click();
            log.info("video play button clicked");
        }

    }
    public void clickOnGoProfile() throws InterruptedException {
        if(appType.contains("Android"))
        {
            Thread.sleep(10000);
        }
        else if(device.contains("ipadSimulator"))
        {
            goProfile.click();
            log.info("video play button clicked");
        }
        else if(device.contains("iphoneSimulator"))
        {
            utils.waitForElement(goProfile).click();
            log.info("video play button clicked");
        }
        else if(device.contains("iphone"))
        {
            utils.waitForElement(goProfile).click();
            log.info("video play button clicked");
        }

    }
    public void clickOnHelp() throws InterruptedException {
        if(appType.contains("Android"))
        {
            Thread.sleep(10000);
        }
        else if(device.contains("ipadSimulator"))
        {
            help.click();
            log.info("video play button clicked");
        }
        else if(device.contains("iphoneSimulator"))
        {
            utils.waitForElement(help).click();
            log.info("video play button clicked");
        }
        else if(device.contains("iphone"))
        {
            utils.waitForElement(help).click();
            log.info("video play button clicked");
        }

    }
    public void clickOnPrivacyPolicy() throws InterruptedException {
        if(appType.contains("Android"))
        {
            Thread.sleep(10000);
        }
        else if(device.contains("ipadSimulator"))
        {
            privacyPolicy.click();
            log.info("video play button clicked");
        }
        else if(device.contains("iphoneSimulator"))
        {
            utils.waitForElement(privacyPolicy).click();
            log.info("video play button clicked");
        }
        else if(device.contains("iphone"))
        {
            utils.waitForElement(privacyPolicy).click();
            log.info("video play button clicked");
        }

    }
    public void clickOnTermsOfUse() throws InterruptedException {
        if(appType.contains("Android"))
        {
            Thread.sleep(10000);
        }
        else if(device.contains("ipadSimulator"))
        {
            termsOfUse.click();
            log.info("video play button clicked");
        }
        else if(device.contains("iphoneSimulator"))
        {
            utils.waitForElement(termsOfUse).click();
            log.info("video play button clicked");
        }
        else if(device.contains("iphone"))
        {
            utils.waitForElement(termsOfUse).click();
            log.info("video play button clicked");
        }

    }
    public void clickOnLegalNotices() throws InterruptedException {
        if(appType.contains("Android"))
        {
            Thread.sleep(10000);
        }
        else if(device.contains("ipadSimulator"))
        {
            legalNotices.click();
            log.info("video play button clicked");
        }
        else if(device.contains("iphoneSimulator"))
        {
            utils.waitForElement(legalNotices).click();
            log.info("video play button clicked");
        }
        else if(device.contains("iphone"))
        {
            utils.waitForElement(legalNotices).click();
            log.info("video play button clicked");
        }

    }

    public void clickOnEnvironment() throws InterruptedException {
        if(appType.contains("Android"))
        {
            Thread.sleep(10000);
        }
        else if(device.contains("ipadSimulator"))
        {
            environment.click();
            log.info("video play button clicked");
        }
        else if(device.contains("iphoneSimulator"))
        {
            utils.waitForElement(environment).click();
            log.info("video play button clicked");
        }
        else if(device.contains("iphone"))
        {
            utils.waitForElement(environment).click();
            log.info("video play button clicked");
        }

    }






}
