package com.hbo.mobile.pages;

import com.hbo.mobile.shared.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.NoSuchElementException;

/**
 * Created by azaman on 9/23/14.
 */
public class HomeScreen
{
    private AppiumDriver driver = null;
    private static Logger log = Logger.getLogger(HomeScreen.class.getName());
    public String appType = null;
    public String device = null;

    public Utils utils = null;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.Button[1]")
                            //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.Button[1]
    private WebElement signIn;

    //@iOSFindBy(name = "menu")
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")
    private WebElement menu;
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[1]")
    private WebElement welcome;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]/UIAStaticText[1]")
    private WebElement movies;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]/UIAStaticText[1]")
    private WebElement series;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]/UIAStaticText[1]")
    private WebElement comedy;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[5]/UIAStaticText[1]")
    private WebElement sports;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[6]/UIAStaticText[1]")
    private WebElement documentaries;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[7]")
    private WebElement collections;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[8]")
    private WebElement lateNight;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[10]")
    private WebElement settings;

    @iOSFindBy(name = "Watchlist")
    private WebElement watchlist;

    @iOSFindBy(name = "Choose Another Provider")
    private WebElement chooseAnotherProvider;


    @iOSFindBy(name = "Search")
    private WebElement search;

    @iOSFindBy(name = "Search")
    private WebElement searchIcon;

    @iOSFindBy(name = "Categories")
    private WebElement categories;


    @iOSFindBy(name = "Browse HBO GO")
    private WebElement browseHBOGOIphone;

    @iOSFindBy(name = "BROWSE NOW")
    private WebElement browseHBOGOIpad;

    public HomeScreen(AppiumDriver driver, String appType, String device)
    {
        this.driver = driver;
        this.appType = appType;
        this.device = device;
        utils = new Utils(driver,appType);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickMenu() throws InterruptedException
    {

        utils.waitForElement(menu).click();
        log.info("Menu Icon clicked");
    }

    public HomeScreen clickOnWelcome() throws InterruptedException {
        try
        {
            clickMenu();
            utils.waitForElement(welcome).click();
            log.info("welcome button clicked");
        }
        catch (NoSuchElementException e)
        {
            log.error("welcome button not found");
        }

        return new HomeScreen(driver, appType, device);
    }

    public Movies clickOnMovie() throws InterruptedException {
        try
        {
            clickMenu();
            utils.waitForElement(movies).click();
            log.info("movies button clicked");
        }
        catch (NoSuchElementException e)
        {
            log.error("movies button not found");
        }

        return new Movies(driver, appType, device);
    }

    public Series clickOnSeries() throws InterruptedException {
        try
        {
            clickMenu();
            utils.waitForElement(series).click();
            log.info("series button clicked");
        }
        catch (NoSuchElementException e)
        {
            log.error("series button not found");
        }

        return new Series(driver, appType, device);
    }

    public Comedy clickOnComedy() throws InterruptedException {
        try
        {
            clickMenu();
            utils.waitForElement(comedy).click();
            log.info("comedy button clicked");
        }
        catch (NoSuchElementException e)
        {
            log.error("comedy button not found");
        }

        return new Comedy(driver, appType, device);
    }

    public Sports clickOnSports() throws InterruptedException {
        try
        {
            clickMenu();
            utils.waitForElement(sports).click();
            log.info("sports button clicked");
        }
        catch (NoSuchElementException e)
        {
            log.error("sports button not found");
        }

        return new Sports(driver, appType, device);
    }

    public Collections clickOnCollections() throws InterruptedException {
        try
        {
            clickMenu();
            utils.waitForElement(collections).click();
            log.info("collections button clicked");
        }
        catch (NoSuchElementException e)
        {
            log.error("collections button not found");
        }

        return new Collections(driver, appType, device) {
        };
    }

    public LateNight clickOnLateNight() throws InterruptedException {

        try
        {
            clickMenu();
            utils.waitForElement(lateNight).click();
            log.info("lateNight button clicked");
        }
        catch (NoSuchElementException e)
        {
            log.error("lateNight button not found");
        }

        return new LateNight(driver, appType, device);
    }

    public void clickSignIn() throws InterruptedException
    {
        try
        {
            log.info("Now at Click Sign In existing button");
            Thread.sleep(7000);
            utils.waitForElement(signIn).click();
            log.info("Sign In button clicked");
        }
        catch (NoSuchElementException e)
        {
            log.error("Sign In button not found");
        }

    }





    public void browseHBOGOClick() throws InterruptedException
    {
        if(appType.contains("Android"))
        {
            Thread.sleep(10000);
        }
        else if(device.contains("ipadSimulator"))
        {
            browseHBOGOIpad.click();
            log.info("Browse HBO GO button clicked");
        }
        else if(device.contains("iphoneSimulator"))
        {
            utils.waitForElement(browseHBOGOIphone).click();
            log.info("Browse HBO GO button clicked");
        }
        else if(device.contains("iphone"))
        {
            utils.waitForElement(browseHBOGOIphone).click();
            log.info("Browse HBO GO button clicked");
        }

    }





    public void chooseAnotherProvider() throws InterruptedException
    {
        try
        {
            utils.waitForElement(chooseAnotherProvider).click();
            log.info("Choose Another provider button clicked");
        }
        catch (NoSuchElementException e)
        {
            log.error("Choose Another provider button button not found");
        }

    }

    public void clickCategories() throws InterruptedException
    {
        utils.waitForElement(categories).click();
        log.info("Categories button clicked");
    }

    public void clickSearch() throws Exception
    {
        Thread.sleep(5000);
        utils.waitForElement(search).click();
        Thread.sleep(5000);
        log.info("Search button clicked");
    }


}
