package com.hbo.mobile.test;

import com.hbo.mobile.pages.AffiliateSelectionScreen;
import com.hbo.mobile.pages.AffiliatesLoginScreen;
import com.hbo.mobile.pages.HomeScreen;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by azaman on 11/6/14.
 */
public class AffiliateloginTest extends BaseTest
{
    private static Logger log = Logger.getLogger(AffiliateloginTest.class.getName());

    String elementException;
    String webdriverException;

    HomeScreen homeScreen = null;
    AffiliateSelectionScreen affiliateSelectionScreen = null;
    AffiliatesLoginScreen affiliatesLoginScreen = null;


    //@Test
    public void affiliatesLoginAndroid() throws InterruptedException, IOException
    {

        homeScreen = new HomeScreen(driver, appType, device);
        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
        boolean firstTimeAppOpened = true;
        boolean loggedIn = false;
        boolean isPasswordInvalid = false;

        // Open the Excel file
        FileInputStream fis = new FileInputStream("src/test/testdata/iPadAffiliateLogin.xls");
        // Access the required test data sheet
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        HSSFSheet sheet = wb.getSheet("QA");
        // Loop through all rows in the sheet
        // Start at row 1 as row 0 is our header row

        for (int count = 1; count <= sheet.getLastRowNum(); count++)
        {
            HSSFRow row = sheet.getRow(count);
            HSSFCell cell = row.getCell(4, row.RETURN_BLANK_AS_NULL);

            String execute = row.getCell(0).toString();
            String affiliateName = row.getCell(1).toString();
            String userid = row.getCell(2).toString();
            String password = row.getCell(3).toString();

            log.info("Affiliates name : " + affiliateName);
            log.info("Execute : " + execute);

            log.info("Debug point 2");

            if (execute.equalsIgnoreCase("yes"))
            {
                log.info("=========================================================");
                log.info("Login Test Started for  : ' " + affiliateName + " '");
                log.info("=========================================================");

                if(firstTimeAppOpened)
                {
                    homeScreen.clickMenu();
                    homeScreen.clickSignIn();
                    homeScreen.clickSignIn();
                }
                else
                {
                    homeScreen.clickSignIn();
                    homeScreen.clickSignIn();
                    log.info("Debug point before choose");
                    affiliateSelectionScreen.clickChooseProvider();
                    log.info("Debug point after choose");
                }


                affiliateSelectionScreen.selectAffiliate(affiliateName);
                //loggedIn = affiliatesLoginScreen.affiliatesLoginIpad(affiliateName, userid, password);
                log.info("Logged In status : " + loggedIn);

                homeScreen.clickMenu();
                driver.findElementByName("Settings").click();
                log.info("Clicked Settings");

                driver.findElementByName("GO Profile").click();
                log.info("Clicked Go profile");
                driver.findElementByName("Sign Out").click();
                log.info("Clicked Sign Out");
                driver.findElementByName("YES").click();
                log.info("Clicked YES");
                Thread.sleep(5000);
                driver.findElementByName("Done").click();

                firstTimeAppOpened = false;

                log.info("First Time opened now : " + firstTimeAppOpened);


            }
        }
    }


    //@Test
    public void affiliatesLoginPhone() throws InterruptedException, IOException
    {

        homeScreen = new HomeScreen(driver, appType, device);
        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
        boolean firstTimeAppOpened = true;
        boolean loggedIn = false;
        boolean isPasswordInvalid = false;

        // Open the Excel file
        FileInputStream fis = new FileInputStream("src/test/testdata/iPadAffiliateLogin.xls");
        // Access the required test data sheet
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        HSSFSheet sheet = wb.getSheet("QA");
        // Loop through all rows in the sheet
        // Start at row 1 as row 0 is our header row

        for (int count = 1; count <= sheet.getLastRowNum(); count++)
        {
            HSSFRow row = sheet.getRow(count);
            HSSFCell cell = row.getCell(4, row.RETURN_BLANK_AS_NULL);

            String execute = row.getCell(0).toString();
            String affiliateName = row.getCell(1).toString();
            String userid = row.getCell(2).toString();
            String password = row.getCell(3).toString();

            log.info("Affiliates name : " + affiliateName);
            log.info("Execute : " + execute);

            log.info("Debug point 2");

            if (execute.equalsIgnoreCase("yes"))
            {
                log.info("=========================================================");
                log.info("Login Test Started for  : ' " + affiliateName + " '");
                log.info("=========================================================");

                if(firstTimeAppOpened)
                {
                    homeScreen.clickMenu();
                    homeScreen.clickSignIn();
                    homeScreen.clickSignIn();
                }
                else
                {
                    homeScreen.clickSignIn();
                    homeScreen.clickSignIn();
                    log.info("Debug point before choose");
                    affiliateSelectionScreen.clickChooseProvider();
                    log.info("Debug point after choose");
                }


                affiliateSelectionScreen.selectAffiliate(affiliateName);
                loggedIn = affiliatesLoginScreen.affiliatesLogin(affiliateName, userid, password);
                log.info("Logged In status : " + loggedIn);



            }
        }
    }

}
