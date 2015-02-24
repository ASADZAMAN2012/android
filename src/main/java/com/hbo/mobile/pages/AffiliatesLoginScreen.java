package com.hbo.mobile.pages;

import com.hbo.mobile.shared.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by azaman on 9/23/14.
 */
public class AffiliatesLoginScreen
{

    private AppiumDriver driver = null;
    private static Logger log = Logger.getLogger(AffiliatesLoginScreen.class.getName());
    public String appType = null;

    Utils utils = null;

    private static WebDriverWait driverWait;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]")
    private WebElement userNameTextbox;


    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]")
    private WebElement passwordTextbox;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.widget.ListView[1]")
    private WebElement blank;


    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")
    private WebElement loginButton;


    public AffiliatesLoginScreen(AppiumDriver driver, String appType)
    {
        this.driver = driver;
        this.appType = appType;
        utils = new Utils(driver,appType);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }



    //========================== Services from this page =======================================



    public boolean affiliatesLogin(String affiliateName, String userId, String password) throws InterruptedException
    {
        boolean loggedIn = false;

        Thread.sleep(5000);

        try
        {
            // **************** Enter User Name *******************

            if(affiliateName.equalsIgnoreCase("DIRECTV"))
            {
                utils.waitForElement(userNameTextbox).click();
                utils.waitForElement(userNameTextbox).click();
                TimeUnit.SECONDS.sleep(9);
                driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[2]")).sendKeys(userId);
                log.info("User Name typed : '" + userId + "'");
            }
            else if(affiliateName.equalsIgnoreCase("AdvancedCable"))
            {
                utils.waitForElement(userNameTextbox).click();
                utils.waitForElement(userNameTextbox).click();
                TimeUnit.SECONDS.sleep(9);
                driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]")).sendKeys(userId);
                log.info("User Name typed : '" + userId + "'");
            }
            else if(affiliateName.equalsIgnoreCase("Antietam"))
            {
                utils.waitForElement(userNameTextbox).click();
                utils.waitForElement(userNameTextbox).click();
                TimeUnit.SECONDS.sleep(9);
                driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]")).sendKeys(userId);
                log.info("User Name typed : '" + userId + "'");
            }
            else if(affiliateName.equalsIgnoreCase("Armstrong"))
            {
                utils.waitForElement(userNameTextbox).click();
                utils.waitForElement(userNameTextbox).click();
                TimeUnit.SECONDS.sleep(9);
                driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]")).sendKeys(userId);
                log.info("User Name typed : '" + userId + "'");
            }
            else if(affiliateName.equalsIgnoreCase("Astound"))
            {
                utils.waitForElement(userNameTextbox).click();
                utils.waitForElement(userNameTextbox).click();
                TimeUnit.SECONDS.sleep(9);
                driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]")).sendKeys(userId);
                log.info("User Name typed : '" + userId + "'");
            }
            else if(affiliateName.equalsIgnoreCase("AT&T U-verse TV"))
            {
                utils.waitForElement(userNameTextbox).click();
                utils.waitForElement(userNameTextbox).click();
                TimeUnit.SECONDS.sleep(9);
                driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]")).sendKeys(userId);
                log.info("User Name typed : '" + userId + "'");
            }
            else if(affiliateName.equalsIgnoreCase("Atlantic Broadband"))
            {
                utils.waitForElement(userNameTextbox).click();
                utils.waitForElement(userNameTextbox).click();
                TimeUnit.SECONDS.sleep(9);
                driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]")).sendKeys(userId);
                log.info("User Name typed : '" + userId + "'");
            }
            else if(affiliateName.equalsIgnoreCase("ATMC"))
            {
                utils.waitForElement(userNameTextbox).click();
                utils.waitForElement(userNameTextbox).click();
                TimeUnit.SECONDS.sleep(9);
                driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]")).sendKeys(userId);
                log.info("User Name typed : '" + userId + "'");
            }
            else if(affiliateName.equalsIgnoreCase("BendBroadband"))
            {
                utils.waitForElement(userNameTextbox).click();
                utils.waitForElement(userNameTextbox).click();
                TimeUnit.SECONDS.sleep(9);
                driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]")).sendKeys(userId);
                log.info("User Name typed : '" + userId + "'");
            }
            else if(affiliateName.equalsIgnoreCase("Blue Ridge Communications"))
            {
                utils.waitForElement(userNameTextbox).click();
                utils.waitForElement(userNameTextbox).click();
                TimeUnit.SECONDS.sleep(9);
                driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]")).sendKeys(userId);
                log.info("User Name typed : '" + userId + "'");
            }
            else if(affiliateName.equalsIgnoreCase("Bright House Networks"))
            {
                utils.waitForElement(userNameTextbox).click();
                utils.waitForElement(userNameTextbox).click();
                TimeUnit.SECONDS.sleep(9);
                driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]")).sendKeys(userId);
                log.info("User Name typed : '" + userId + "'");
            }
            else {

                TimeUnit.SECONDS.sleep(1);
                utils.waitForElement(userNameTextbox).click();
                utils.waitForElement(userNameTextbox).sendKeys(userId);
                log.info("User Name typed : ' " + userId + " '");
            }

            // **************** Enter Password *******************
            if(affiliateName.equalsIgnoreCase("DIRECTV"))
            {
                TimeUnit.SECONDS.sleep(3);
                driver.findElementByXPath("//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIAScrollView[1]/UIAWebView[1]/UIASecureTextField[1]").sendKeys(password);
            }
            else if(affiliateName.equalsIgnoreCase("TDS"))
            {
                TimeUnit.SECONDS.sleep(2);
                driver.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIASecureTextField[1]").sendKeys(password);
            }
            else if(affiliateName.equalsIgnoreCase("AdvancedCable"))
            {
                TimeUnit.SECONDS.sleep(2);
                driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]").sendKeys(password);
            }
            else if(affiliateName.equalsIgnoreCase("Antietam"))
            {
                TimeUnit.SECONDS.sleep(2);
                driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]").sendKeys(password);
            }
            else {
                TimeUnit.SECONDS.sleep(2);
                blank.click();
                utils.waitForElement(passwordTextbox).click();
                utils.waitForElement(passwordTextbox).sendKeys(password);
                log.info("Password typed : ' " + password + " '");
            }


            // **************** Click Sign In Button *******************

            if(affiliateName.equalsIgnoreCase("Cable ONE"))
            {
                driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[2]")).click();
                log.info("Cable ONE Submit button clicked");
                TimeUnit.SECONDS.sleep(5);
            }
            else if(affiliateName.equalsIgnoreCase("AdvancedCable"))
            {
                driver.findElement(By.xpath("")).click();
                log.info("Charter Submit button clicked");
                TimeUnit.SECONDS.sleep(5);
            }
            else if(affiliateName.equalsIgnoreCase("Antietam"))
            {
                driver.findElement(By.xpath("")).click();
                log.info("Charter Submit button clicked");
                TimeUnit.SECONDS.sleep(5);
            }
            else if(affiliateName.equalsIgnoreCase("Charter"))
            {
                driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[3]")).click();
                log.info("Charter Submit button clicked");
                TimeUnit.SECONDS.sleep(5);
            }
            else if(affiliateName.equalsIgnoreCase("DIRECTV"))
            {
                driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[19]")).click();
                log.info("DIRECTV Submit button clicked");
                TimeUnit.SECONDS.sleep(5);
            }
            else if(affiliateName.equalsIgnoreCase("DIRECTV PUERTO RICO"))
            {
                driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[5]/UIAStaticText[1]")).click();
                log.info("DIRECTV PUERTO RICO Submit button clicked");
                TimeUnit.SECONDS.sleep(5);
            }

            else if(affiliateName.equalsIgnoreCase("Google Fiber"))
            {
                driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAButton[1]")).click();
                log.info("Google Fiber Submit button clicked");
                TimeUnit.SECONDS.sleep(5);
                driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAButton[1]")).click();
                log.info("Google Fiber 'Accept button' clicked");
                TimeUnit.SECONDS.sleep(8);
            }
            else if(affiliateName.equalsIgnoreCase("Optimum"))
            {
                driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAImage[2]")).click();
                log.info("Optimum Submit button clicked");
                TimeUnit.SECONDS.sleep(5);
            }
            else
            {

                utils.waitForElement(loginButton).click();
                log.info("Submit Button clicked");
                TimeUnit.SECONDS.sleep(8);
            }
        }

        catch (WebDriverException webdriverException)
        {
            if(webdriverException.getMessage().contains("Javascript"))
            {
                log.info("An error occured while executing Javascript");

            }


        }

        Thread.sleep(5000);

        try
        {
            if(userNameTextbox.isDisplayed())
            {
                log.error("Login Id or Password incorrect");
                log.debug("User name text box still displayed");

            }

        }
        catch (java.util.NoSuchElementException elementException)
        {
            //log.info("Now at NoSuchElementException");
            log.info("Login Id and Password correct");
            log.debug("Now at No such element exception");
            loggedIn = true;
        }
        catch (WebDriverException webdriverException)
        {
            //log.info("Now at WebDriverException");
            log.info("Login Id and Password correct");
            log.debug("Now at WebDriver exception");
            loggedIn = true;
        }

        return loggedIn;

    }




}
