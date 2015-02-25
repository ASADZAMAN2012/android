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
 
    Utils utils = null;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]")
                            ////android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]
    private WebElement userNameTextbox;


    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]")
    private WebElement passwordTextbox;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.widget.ListView[1]")
    private WebElement blankSpace;


    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")
    private WebElement loginButton;


    public AffiliatesLoginScreen(AppiumDriver driver)
    {
        this.driver = driver;
        utils = new Utils(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }



    //========================== Services from this page =======================================



    public void affiliatesLogin(String affiliateName, String userId, String password) throws InterruptedException
    {

            // **************** Enter User Name *******************
           
        	if(affiliateName.equalsIgnoreCase("Armstrong"))
            {
                utils.waitForElement(driver.findElement(By.name("Username"))).click();
                utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[4]/android.widget.EditText[1]"))).sendKeys(userId);
                log.info("User Name typed : '" + userId + "'");
            }
        	
        	else if(affiliateName.equalsIgnoreCase("Astound"))
            {
                utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[5]/android.widget.EditText[1]"))).click();
                utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[5]/android.widget.EditText[1]"))).sendKeys(userId);
                log.info("User Name typed : '" + userId + "'");
            }
            else if(affiliateName.equalsIgnoreCase("AT&T U-verse TV"))
            {
                utils.waitForElement(driver.findElement(By.name("Username"))).click();
                utils.waitForElement(driver.findElement(By.name("Username"))).sendKeys(userId);
                log.info("User Name typed : '" + userId + "'");
            }
            else if(affiliateName.equalsIgnoreCase("Atlantic Broadband"))
            {
                utils.waitForElement(driver.findElement(By.name("Email Address"))).click();
                utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys(userId);
                log.info("User Name typed : '" + userId + "'");
            }
            else if(affiliateName.equalsIgnoreCase("ATMC"))
            {
                utils.waitForElement(driver.findElement(By.name("Email"))).click();
                utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys(userId);
                log.info("User Name typed : '" + userId + "'");
            }
            else if(affiliateName.equalsIgnoreCase("BendBroadband"))
            {
                utils.waitForElement(driver.findElement(By.name("Email"))).click();
                utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys(userId);
                log.info("User Name typed : '" + userId + "'");
            }
            else if(affiliateName.equalsIgnoreCase("Blue Ridge Communications"))
            {
                utils.waitForElement(driver.findElement(By.name("Username"))).click();
                utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[4]/android.widget.EditText[1]"))).sendKeys(userId);
                log.info("User Name typed : '" + userId + "'");
            }
            else if(affiliateName.equalsIgnoreCase("Buckeye CableSystem"))
            {
                utils.waitForElement(driver.findElement(By.name("Email"))).click();
                utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys(userId);
                log.info("User Name typed : '" + userId + "'");
            }
            else if(affiliateName.equalsIgnoreCase("Burlington Telecom"))
            {
                utils.waitForElement(driver.findElement(By.name("TV"))).click();
                utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.EditText[1]"))).sendKeys(userId);
                log.info("User Name typed : '" + userId + "'");
            }
            else if(affiliateName.equalsIgnoreCase("BVU OptiNet"))
            {
                utils.waitForElement(driver.findElement(By.name("Email"))).click();
                utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys(userId);
                log.info("User Name typed : '" + userId + "'");
            }
            else if(affiliateName.equalsIgnoreCase("Cable ONE"))
            {
                utils.waitForElement(driver.findElement(By.name("Username:"))).click();
                utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.EditText[1]"))).sendKeys(userId);
                log.info("User Name typed : '" + userId + "'");
            }













            else
        	{
                TimeUnit.SECONDS.sleep(1);
                utils.waitForElement(userNameTextbox).click();
                utils.waitForElement(userNameTextbox).sendKeys(userId);
                utils.waitForElement(blankSpace).click();
                log.info("User Name typed : ' " + userId + " '");
            }
        	


            // **************** Enter Password *******************
            
        	if(affiliateName.equalsIgnoreCase("Armstrong"))
            {
                utils.waitForElement(driver.findElement(By.name("Password"))).click();
                utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[6]/android.widget.EditText[1]"))).sendKeys(password);
                log.info("Password typed : '" + userId + "'");
            }
        	
        	else if(affiliateName.equalsIgnoreCase("Astound"))
            {
                utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[7]/android.widget.EditText[1]"))).click();
                utils.waitForElement(driver.findElement(By.xpath("\"//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[7]/android.widget.EditText[1]"))).sendKeys(password);
                log.info("Password typed : '" + userId + "'");
            }
            else if(affiliateName.equalsIgnoreCase("AT&T U-verse TV"))
            {
            utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[5]/android.widget.EditText[1]"))).click();
            utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[5]/android.widget.EditText[1]"))).sendKeys(password);
            log.info("Password typed : '" + userId + "'");
            }
            else if(affiliateName.equalsIgnoreCase("Atlantic Broadband"))
            {
            utils.waitForElement(driver.findElement(By.name("Password"))).click();
            utils.waitForElement(driver.findElement(By.name("Password"))).sendKeys(password);
            log.info("Password typed : '" + userId + "'");
            }
            else if(affiliateName.equalsIgnoreCase("ATMC"))
            {
                utils.waitForElement(driver.findElement(By.name("Password"))).click();
                utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys(password);
                log.info("Password typed : '" + userId + "'");
            }
            else if(affiliateName.equalsIgnoreCase("BendBroadband"))
            {
                utils.waitForElement(driver.findElement(By.name("Password"))).click();
                utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[4]/android.widget.EditText[2]"))).sendKeys(password);
                log.info("Password typed : '" + userId + "'");
            }
            else if(affiliateName.equalsIgnoreCase("Blue Ridge Communications"))
            {
                utils.waitForElement(driver.findElement(By.name("Password"))).click();
                utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[4]/android.widget.EditText[2]"))).sendKeys(password);
                log.info("Password typed : '" + userId + "'");
            }
            else if(affiliateName.equalsIgnoreCase("Buckeye CableSystem"))
            {
                utils.waitForElement(driver.findElement(By.name("Password"))).click();
                utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys(password);
                log.info("Password typed : '" + userId + "'");
            }
            else if(affiliateName.equalsIgnoreCase("Burlington Telecom"))
            {
                utils.waitForElement(driver.findElement(By.name("Password"))).click();
                utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.EditText[2]"))).sendKeys(password);
                log.info("Password typed : '" + userId + "'");
            }
            else if(affiliateName.equalsIgnoreCase("BVU OptiNet"))
            {
                utils.waitForElement(driver.findElement(By.name("Password"))).click();
                utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys(password);
                log.info("Password typed : '" + userId + "'");
            }
            else if(affiliateName.equalsIgnoreCase("Cable ONE"))
            {
                utils.waitForElement(driver.findElement(By.name("Password:"))).click();
                utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.EditText[2]"))).sendKeys(password);
                log.info("Password typed : '" + userId + "'");
            }
            else
        	{
                TimeUnit.SECONDS.sleep(1);
                utils.waitForElement(passwordTextbox).click();
                utils.waitForElement(passwordTextbox).sendKeys(password);
                utils.waitForElement(blankSpace).click();
                log.info("Password typed : '" + userId + "'");
            }

            // **************** Click Sign In Button *******************

        	if(affiliateName.equalsIgnoreCase(""))
            {
                utils.waitForElement(loginButton).click();
                log.info("Login button clicked");
            }
        	
        	else if(affiliateName.equalsIgnoreCase(""))
            {
                utils.waitForElement(loginButton).click();
                log.info("Login button clicked");
            }
        	
        	else 
        	{
        		utils.waitForElement(loginButton).click();
                log.info("Login button clicked");
            }

     }





}
