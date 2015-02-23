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

/**
 * Created by azaman on 9/23/14.
 */
public class AffiliateSelectionScreen {

    private AppiumDriver driver = null;
    private static Logger log = Logger.getLogger(AffiliateSelectionScreen.class.getName());
    public String appType = null;

    public Utils utils = null;

    @AndroidFindBy(name = "More")
    private WebElement more;


   // @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
    //@iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[1]")
    @iOSFindBy(name = "Select Television Provider")
    private WebElement selectYourTelevisionProvider;

    @iOSFindBy(name = "Choose Another Provider")
    private WebElement chooseAnotherProvider;

    @iOSFindBy(name = "Choose Provider")
    private WebElement chooseProvider;


    public AffiliateSelectionScreen(AppiumDriver driver, String appType)
    {
        this.driver = driver;
        this.appType = appType;
        utils = new Utils(driver,appType);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void selectAffiliate(String affiliateName) throws InterruptedException
    {
            Thread.sleep(5000);
            log.info("Now at Select Affiliates");
            //driver.scrollTo(affiliateName).click();
            driver.findElementByName(affiliateName).click();
            log.info("'" + affiliateName + "'" + " selected");


    }
    public void clickChooseProvider()
    {
        utils.waitForElement(chooseProvider).click();
        log.info("ChooseProvider clicked");
    }


    public void selectAffiliateOnAndroid(String affiliateName) throws InterruptedException
    {
        utils.waitForElement(selectYourTelevisionProvider).click();
        log.info("Select Your Television Provider clicked");

        driver.findElement(By.name(affiliateName)).click();
        log.info("'" + affiliateName + "'" +" selected");



    }


}
