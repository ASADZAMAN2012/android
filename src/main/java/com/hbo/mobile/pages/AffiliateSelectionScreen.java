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
public class AffiliateSelectionScreen 
{

    private AppiumDriver driver = null;
    private static Logger log = Logger.getLogger(AffiliateSelectionScreen.class.getName());

    public Utils utils = null;

    @AndroidFindBy(name = "More")
    private WebElement more;

    @AndroidFindBy(name = "Select Television Provider")
    private WebElement selectYourTelevisionProvider;


    public AffiliateSelectionScreen(AppiumDriver driver)
    {
        this.driver = driver;
        utils = new Utils(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void selectAffiliate(String affiliateName) throws InterruptedException
    {
        utils.waitForElement(selectYourTelevisionProvider).click();
        log.info("Select Your Television Provider clicked");

        driver.findElement(By.name(affiliateName)).click();
        log.info("'" + affiliateName + "'" +" selected");

    }


}
