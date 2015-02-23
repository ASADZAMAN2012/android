package com.hbo.mobile.test;

import com.hbo.mobile.pages.HomeScreen;
import com.hbo.mobile.shared.Utils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by azaman on 1/26/15.
 */
public class NavigationTest extends BaseTest
{
    private static Logger log = Logger.getLogger(NavigationTest.class.getName());

    HomeScreen homeScreen = null;

    Utils utils = null;

    //@Test
    public void menuNavigateTest() throws Exception
    {
        utils = new Utils(driver,appType);

        log.info("=========================================================");
        log.info("Login Test Started for  : ' menuNavigateTest '");
        log.info("=========================================================");

        homeScreen = new HomeScreen(driver, appType, device);
        homeScreen.clickMenu();

        List<WebElement> menuList = driver.findElementsByXPath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell");
        log.info("Menu Size : " + menuList.size());

        for(int i = 1; i<menuList.size(); i++)
        {
            String menuItemText = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell["+i+"]/UIAStaticText[1]")).getText();
            WebElement menuItem = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell["+i+"]"));
            Thread.sleep(4000);
            log.info("Now at Menu : " + "' " + menuItemText + " '");
            utils.waitForElement(menuItem).click();
            log.info("Menu clicked : " + menuItemText);
            homeScreen.clickMenu();
        }


        }
}
