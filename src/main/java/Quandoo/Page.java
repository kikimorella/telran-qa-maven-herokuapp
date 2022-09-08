package Quandoo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Abstract class representation of a Page in the UI. Page object pattern.
 */
public abstract class Page {

    public static WebDriver driver;

    // constant url

    protected static String BASE_URL = "https://www.quandoo.de/en";

    // Common test data

    public static String CITY_NAME = "Berlin";
    public static String EXPECTED_CITY_HEADER_TEXT = "Restaurants in " + CITY_NAME;
    public static String EXPECTED_CITY_HEADER_TEXT_ONE_OPTION = "Restaurant in " + CITY_NAME;
    public static String CITY_RESTAURANT = "The Hat";
    public static String SPECIAL_CITY_RESTAURANT = "Wartesaal";
    public static String RESTAURANT_NEAR_ME = "Restaurants Near Me";
    public static String TYPE_OF_CUISINE = "Pizza";

    /**
     * Constructor injecting the WebDriver interface
     */
    public Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    static WebElement acceptCookies;

    public void clickAcceptCookiesBtn() {
        acceptCookies.click();
    }
}
