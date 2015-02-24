package com.hbo.mobile.shared;

import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by azaman on 9/24/14.
 */
public class Utils
{
    private AppiumDriver driver = null;
    private static Logger log = Logger.getLogger(Utils.class.getName());
    public String appType = null;
    private static WebDriverWait driverWait;
    int timeoutInSeconds = 30;


    public Utils(AppiumDriver driver)
    {
        this.driver = driver;
    }

    public boolean isElementPresent(WebElement element)
    {
        boolean isElementPresent = false;
        if(element.isDisplayed() || element.isEnabled())
        {
            isElementPresent = true;
        }
        return isElementPresent;
    }

    public WebElement waitForElement(WebElement ele)
    {
        driverWait = new WebDriverWait(driver, timeoutInSeconds);

        return driverWait.until(ExpectedConditions.visibilityOf(ele)) ;

    }

    public WebElement waitForElementLocatedBy(By by)
    {
        driverWait = new WebDriverWait(driver, timeoutInSeconds);

        return driverWait.until(ExpectedConditions.visibilityOfElementLocated(by)) ;

    }





}
