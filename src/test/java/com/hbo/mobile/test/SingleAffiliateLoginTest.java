package com.hbo.mobile.test;

import com.hbo.mobile.pages.AffiliateSelectionScreen;
import com.hbo.mobile.pages.AffiliatesLoginScreen;
import com.hbo.mobile.pages.HomeScreen;
import com.hbo.mobile.shared.Utils;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.IOException;

/**
 * Created by azaman on 11/6/14.
 */
public class SingleAffiliateLoginTest extends BaseTest {
    private static Logger log = Logger.getLogger(SingleAffiliateLoginTest.class.getName());

    HomeScreen homeScreen = null;
    AffiliateSelectionScreen affiliateSelectionScreen = null;
    AffiliatesLoginScreen affiliatesLoginScreen = null;


   //@Test
    public void singleAffiliatesLoginAdvancedCable() throws InterruptedException, IOException {

        homeScreen = new HomeScreen(driver, appType, device);
        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
        Utils utils = new Utils(driver, appType);


        Thread.sleep(8000);
        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
        utils.waitForElement(driver.findElement(By.name("Advanced Cable"))).click();
        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
        driver.findElement(By.name("Email")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("hbotest1@acc.com");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
        driver.findElement(By.name("Password")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("acac#1111");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
        Thread.sleep(5000);


        //homeScreen.clickSignIn();

        //affiliatesLoginScreen.affiliatesLogin("Advanced Cable", "hbotest1@acc.com", "acac#1111");

    }

    //@Test
    public void singleAffiliatesLoginAntietam() throws InterruptedException, IOException {

        homeScreen = new HomeScreen(driver, appType, device);
        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
        Utils utils = new Utils(driver, appType);


        Thread.sleep(9000);
        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
        utils.waitForElement(driver.findElement(By.name("Antietam"))).click();
        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
        driver.findElement(By.name("Email")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("hbotest1@antietam.com");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
        driver.findElement(By.name("Password")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("ant#1111");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
        Thread.sleep(8000);
    }
    @Test
    public void singleAffiliatesLoginArmstrong() throws InterruptedException, IOException {

        homeScreen = new HomeScreen(driver, appType, device);
        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
        Utils utils = new Utils(driver, appType);



        Thread.sleep(9000);
        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
        utils.waitForElement(driver.findElement(By.name("Armstrong"))).click();
        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
        driver.findElement(By.name("Username")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[4]/android.widget.EditText[1]"))).sendKeys("synacortve4");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
        driver.findElement(By.name("Password")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[6]/android.widget.EditText[1]"))).sendKeys("synacor04132012");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[7]")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[7]/android.widget.Button[1]")).click();
        Thread.sleep(9000);
    }
    //@Test    /// dif
    public void singleAffiliatesLoginAstound() throws InterruptedException, IOException {

        homeScreen = new HomeScreen(driver, appType, device);
        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
        Utils utils = new Utils(driver, appType);


        Thread.sleep(9000);
        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
        utils.waitForElement(driver.findElement(By.name("Astound"))).click();
        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
        driver.findElement(By.name("Email")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[6]/android.widget.EditText[1]"))).sendKeys("synacor2");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
        driver.findElement(By.name("Password")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[8]/android.widget.EditText[1]"))).sendKeys("synacor2");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
        Thread.sleep(9000);
    }

    //@Test  //dif
    public void singleAffiliatesLoginAtntTv() throws InterruptedException, IOException {

        homeScreen = new HomeScreen(driver, appType, device);
        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
        Utils utils = new Utils(driver, appType);


        Thread.sleep(9000);
        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
        utils.waitForElement(driver.findElement(By.name("AT&T U-verse TV"))).click();
        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
        driver.findElement(By.name("Email")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("attkearns@att.net");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
        driver.findElement(By.name("Password")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("diane1234");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
        Thread.sleep(9000);
    }
    //@Test /// diff
    public void singleAffiliatesLoginAtlanticBroadband() throws InterruptedException, IOException {

        homeScreen = new HomeScreen(driver, appType, device);
        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
        Utils utils = new Utils(driver, appType);


        Thread.sleep(8000);
        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
        utils.waitForElement(driver.findElement(By.name("Atlantic Broadband"))).click();
        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
        driver.findElement(By.name("Email")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("hbomaxgo@atlanticbb.net");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
        driver.findElement(By.name("Password")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("HboM@x23");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
        Thread.sleep(5000);

    }
    //@Test
    public void singleAffiliatesLoginAtmc() throws InterruptedException, IOException {

        homeScreen = new HomeScreen(driver, appType, device);
        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
        Utils utils = new Utils(driver, appType);


        Thread.sleep(8000);
        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
        utils.waitForElement(driver.findElement(By.name("ATMC"))).click();
        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
        driver.findElement(By.name("Email")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("hbotest1@atmc.com");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
        driver.findElement(By.name("Password")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("atat!1111");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
        Thread.sleep(5000);

    }
    //@Test ///dif
    public void singleAffiliatesLoginBendBroadband() throws InterruptedException, IOException {

        homeScreen = new HomeScreen(driver, appType, device);
        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
        Utils utils = new Utils(driver, appType);


        Thread.sleep(8000);
        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
        utils.waitForElement(driver.findElement(By.name("BendBroadband"))).click();
        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
        driver.findElement(By.name("Email")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("TVE7@bendbroadband.com");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
        driver.findElement(By.name("Password")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("230612");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
        Thread.sleep(5000);

    }
    //@Test //dif
    public void singleAffiliatesLoginBlueRidgeCommunications() throws InterruptedException, IOException {

        homeScreen = new HomeScreen(driver, appType, device);
        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
        Utils utils = new Utils(driver, appType);


        Thread.sleep(8000);
        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
        utils.waitForElement(driver.findElement(By.name("Blue Ridge Communications"))).click();
        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
        driver.findElement(By.name("Email")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("user_331714-01");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
        driver.findElement(By.name("Password")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("pass_331714-01");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
        Thread.sleep(5000);

    }
    //@Test
    public void singleAffiliatesLoginBrightHouseNetworks() throws InterruptedException, IOException {

        homeScreen = new HomeScreen(driver, appType, device);
        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
        Utils utils = new Utils(driver, appType);


        Thread.sleep(8000);
        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
        utils.waitForElement(driver.findElement(By.name("Bright House Networks"))).click();
        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
        driver.findElement(By.name("Email")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("QATestAccount");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
        driver.findElement(By.name("Password")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("TPAtest1");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
        Thread.sleep(8000);

    }
    //@Test
    public void singleAffiliatesLoginBuckeyeCableSystem() throws InterruptedException, IOException {

        homeScreen = new HomeScreen(driver, appType, device);
        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
        Utils utils = new Utils(driver, appType);


        Thread.sleep(8000);
        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
        utils.waitForElement(driver.findElement(By.name("Buckeye CableSystem"))).click();
        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
        driver.findElement(By.name("Email")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("clpahbo1@buckeye-express.com");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
        driver.findElement(By.name("Password")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("clpahbo1pass");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
        Thread.sleep(5000);




    }
    //@Test
    public void singleAffiliatesLoginBurlingtonTelecom() throws InterruptedException, IOException {

        homeScreen = new HomeScreen(driver, appType, device);
        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
        Utils utils = new Utils(driver, appType);


        Thread.sleep(8000);
        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
        utils.waitForElement(driver.findElement(By.name("Burlington Telecom"))).click();
        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
        driver.findElement(By.name("Email")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("burlingtontest06");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
        driver.findElement(By.name("Password")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("synacor!1");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
        Thread.sleep(5000);




    }
    //@Test
    public void singleAffiliatesLoginBVuOptiNet() throws InterruptedException, IOException {

        homeScreen = new HomeScreen(driver, appType, device);
        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
        Utils utils = new Utils(driver, appType);


        Thread.sleep(8000);
        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
        utils.waitForElement(driver.findElement(By.name("BVU OptiNet"))).click();
        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
        driver.findElement(By.name("Email")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("test7@bvu.com");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
        driver.findElement(By.name("Password")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("bvu#7777");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
        Thread.sleep(5000);
    }
    //@Test
    public void singleAffiliatesLoginCableOne() throws InterruptedException, IOException {

        homeScreen = new HomeScreen(driver, appType, device);
        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
        Utils utils = new Utils(driver, appType);


        Thread.sleep(8000);
        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
        utils.waitForElement(driver.findElement(By.name("Cable ONE"))).click();
        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
        driver.findElement(By.name("Email")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("synacorprod2");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
        driver.findElement(By.name("Password")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("test1234");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
        Thread.sleep(5000);
    }
    //@Test
    public void singleAffiliatesLoginCedarFallsUtilities() throws InterruptedException, IOException {

        homeScreen = new HomeScreen(driver, appType, device);
        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
        Utils utils = new Utils(driver, appType);


        Thread.sleep(8000);
        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
        utils.waitForElement(driver.findElement(By.name("Cedar Falls Utilities"))).click();
        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
        driver.findElement(By.name("Email")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("tu410@sssnet.com");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
        driver.findElement(By.name("Password")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("pwd41000");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
        Thread.sleep(5000);
    }
   // @Test
    public void singleAffiliatesLoginCenturyLinkPrism() throws InterruptedException, IOException {

        homeScreen = new HomeScreen(driver, appType, device);
        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
        Utils utils = new Utils(driver, appType);


        Thread.sleep(8000);
        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
        utils.waitForElement(driver.findElement(By.name("CenturyLink Prism"))).click();
        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
        driver.findElement(By.name("Email")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("2393041746@centurylink.net");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
        driver.findElement(By.name("Password")).click();
        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("test1234");
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
        Thread.sleep(5000);
    }

//    @Test
//    public void singleAffiliatesLoginCharter() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Charter"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("hbomaxnohsiprod2");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("P@ssw0rd");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//
//    @Test
//    public void singleAffiliatesLoginCincinnatiBellFioptics() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Cincinnati Bell Fioptics"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("tvhbo@cinbell.com");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("hbowhdu!");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginClearCreekCommunications() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Clear Creek Communications"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("hbotest1@clearcreek.com");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("clrcrk#111");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginComcastXFINITY() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Comcast XFINITY"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("xfinity_tv_test_03");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("PoolLock3");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginComporium() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Comporium"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("tu410@sssnet.com");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("pwd41000");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginConsolidatedCommunications() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Consolidated Communications"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("pdHbo0000451000");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("Password0000451000");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginConwayCorporation() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Conway Corporation"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("tu410@sssnet.com");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("pwd41000");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginCox() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Cox"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("hbo1");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("notch386");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginDIRECTV() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("DIRECTV"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("idp_hbo18@att.net");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("directv1");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//
//    @Test
//    public void singleAffiliatesLoginDIRECTVPUERTORICO() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("DIRECTV PUERTO RICO"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("apbperezburgos1@yahoo.com");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("apb12635");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//
//    @Test
//    public void singleAffiliatesLoginDISH() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("DISH"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("Dish Partner 7");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("dish1234");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginDOCOMOPACIFIC() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("DOCOMO PACIFIC"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("test6@guam.com");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("gugu#6666");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginEastonCableVelocity() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Easton Cable Velocity"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("j.t.thompson");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("iL0v3Th30riol3s");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginEATELVideoLLC() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("EATEL Video, LLC"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("tu410@sssnet.com");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("pwd41000");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginENTOUCH() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("ENTOUCH"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("tu410@sssnet.com");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("pwd41000");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginEPBFiberOptics() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("EPB Fiber Optics"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("epbolympics5");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("Epb_51054!");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//      public void singleAffiliatesLoginFrankfortPlantBoard() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Frankfort Plant Board"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("tu410@sssnet.com");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("pwd41000");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginFrontierCommunications() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Frontier Communications"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("ftrfios6@frontier.com");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("Frontier1");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginGCI() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("GCI"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("TVETestHoH01");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("Test1pass");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginGoogleFiber() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Google Fiber"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("gfibertvehbo1@gfibertest.com");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("gfiberhbo");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginGrandeCommunications() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Grande Communications"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("tve07prim");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("tve07");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginGreenlight() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Greenlight"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("test1@greenlight.com");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("green#1111");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginGTA() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("GTA"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("75962489");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("96915");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginGVTCCommunications() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("GVTC Communications"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("gvtctve1");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("Spurs999");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginHawaiianTelcom() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Hawaiian Telcom"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("Htin29535");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("Synacor18");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginHBC() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("HBC"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("Test2");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("ASjiaLUU");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginHomeTelecom() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Home Telecom"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("oldcandy1");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("tveteam!");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginHomeTownCablePlus() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Home Town Cable Plus"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("cheeseburger2");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("cheese1!");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginHotwireCommunications() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Hotwire Communications"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("SynacorTest1");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("Hotwire01");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginHTCCommunications() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("HTC Communications"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("HBOCinemax1");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("HTCtest0");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginHTCDigitalCable() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("HTC Digital Cable"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("HHuxtable@hbotest");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("HTCHBOMAX");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginJEA() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("JEA"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("hbotest1@jea.com");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("jax!1111");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginLibertyPuertoRico() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Liberty Puerto Rico"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("billing@libertypr.com");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("L!b3rty");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginLongLines() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Long Lines"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("lltest2");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("lltest2!");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginLUSFiber() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("LUS Fiber"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("fibertest_hbomax01");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("Lusfiber09");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginMCTV() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("MCTV"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("tu410@sssnet.com");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("pwd41000");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginMediacom() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Mediacom"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("testbench.mediacom@mchsi.com");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("mediacom10");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginMetroCast() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("MetroCast"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("synacor_tve_9@portal.metrocast.net");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("tvtester09");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginMetronet() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Metronet"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("tu410@sssnet.com");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("pwd41000");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginMIConnection() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("MI-Connection"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("HBOtest1@miconnection.com");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("mimi!1111");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginMidcontinentCommunications() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Midcontinent Communications"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("gotest57@midco.net");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("midco1");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginMIDHUDSON() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("MIDHUDSON"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("tu410@sssnet.com");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("pwd41000");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginMorrisBroadband() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Morris Broadband"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("soggybread2");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("bread!234");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginMTACommunications() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("MTA Communications"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("tu410@sssnet.com");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("pwd41000");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginNexTech() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Nex-Tech"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("sguruprasad");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("SynacorTest!");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginNORWOOD() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("NORWOOD"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("tu410@sssnet.com");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("pwd41000");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginOpenBandMultimedia() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("OpenBand Multimedia"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("coffeecup1");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("tve!23");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginOptimum() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Optimum"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("research84");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("support84");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginRCN() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("RCN"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("test_hbo_nomax1");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("rcnhB0p4S$");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginSELCO() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("SELCO"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("tu410@sssnet.com");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("pwd41000");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginServiceElectricBroadband() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Service Electric Broadband"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("tvntest4");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("TvnTest4");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginServiceElectricCableTV() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Service Electric Cable TV"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("tu410@sssnet.com");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("pwd41000");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginServiceElectricCablevision() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Service Electric Cablevision"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("trincatestse1");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("synacor!1");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginSouthSlopeCoopComm() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("South Slope Coop Comm"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("trincatestse1");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("synacor!1");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginSuddenlink() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Suddenlink"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("hbomax_test_1");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("test01");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginSummitBroadband() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Summit Broadband"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("HBOAdmin2");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("test@will");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginSureWestBroadband() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("SureWest Broadband"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("3synacor");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("!Surewest01");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginTDS() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("TDS"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("Synacor9@tds.net");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("TestP@ss1");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginTimeWarnerCable() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Time Warner Cable"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("tve156");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("1hg1PPiB");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginTRUVISTA() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("TRUVISTA"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("tvcTestH1a");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("testpass111");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginVerizonFiOS() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Verizon FiOS"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("vze114fqn");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("vwq633qr6");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginWaveBroadband() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Wave Broadband"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("synacor3");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("synacor3");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginWOW() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("WOW!"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("EHBO");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("hboe123test");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void singleAffiliatesLoginYadtelTelecom() throws InterruptedException, IOException {
//
//        homeScreen = new HomeScreen(driver, appType, device);
//        affiliateSelectionScreen = new AffiliateSelectionScreen(driver, appType);
//        affiliatesLoginScreen = new AffiliatesLoginScreen(driver, appType);
//        Utils utils = new Utils(driver, appType);
//
//
//        Thread.sleep(8000);
//        utils.waitForElement(driver.findElement(By.name("Sign In (Existing Users)"))).click();
//        utils.waitForElement(driver.findElement(By.name("Select Television Provider"))).click();
//        utils.waitForElement(driver.findElement(By.name("Yadtel Telecom"))).click();
//        //affiliateSelectionScreen.selectAffiliateOnAndroid("Advanced Cable");
//        driver.findElement(By.name("Email")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.EditText[1]"))).sendKeys("HBOCinemax1");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click(); // to click on blank space
//        driver.findElement(By.name("Password")).click();
//        utils.waitForElement(driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.EditText[1]"))).sendKeys("YADKtest0");
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[3]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ListView[1]/android.widget.Button[1]")).click();
//        Thread.sleep(5000);
//    }






















































































}
