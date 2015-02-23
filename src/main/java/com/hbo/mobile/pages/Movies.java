package com.hbo.mobile.pages;

import com.hbo.mobile.shared.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mushfiquesalaheen on 2/18/15.
 */
public class Movies
{

    private AppiumDriver driver = null;
    private static Logger log = Logger.getLogger(HomeScreen.class.getName());
    public String appType = null;
    public String device = null;
    public Utils utils = null;

    @iOSFindBy(name = "Featured")
    private WebElement featured;

    @iOSFindBy(name = "All Movies")
    private WebElement allMovies;





    public Movies(AppiumDriver driver, String appType, String device)
    {
        this.driver = driver;
        this.appType = appType;
        this.device = device;
        utils = new Utils(driver,appType);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //MOVIES” when selected must be highlighted in blue:

        //4 tabs must display in the top center section of page:
        //“FEATURED” – enabled and selected by default
    //Asset images and titles must display in list format – portrait mode
    //Asset images and titles must display as carousel – landscape mode

    //“MOVIES A TO Z” to the right of “FEATURED”
    //Asset names must display in alphabetical order (list format) with length, rating and Genre information – portrait mode
    //Asset images and titles must display in grid format – landscape mode

    //“GENRES” must display with down arrow to the right of “MOVIES A to Z”
    //and when tapped on, must display the following sub-categories in drop-down list format in both portrait and landscape mode:

        //“Action”
        //“Comedy”
        //“Drama”
        //“Horror/Sci-Fi”
        //“Suspense”
        //“Romance”
        //“Family”
        //“Latino”

    //User must be able to make a selection by tapping on a sub-category
    //Sub-category name must replace “GENRES” and assets pertaining to selected sub-category must correctly display as described
    //“COLLECTIONS” must display to the right of “GENRES”
    //Collections images and titles must display in grid format.
    //“Welcome to HBOGO” must display as the first collection for signed in and not-signed in users


}
