package Quandoo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page {
    private static WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//input[@name=\'destination\'])[2]")
    static WebElement destinationField;

    @FindBy(xpath = "(//input[@name=\'dining\'])[2]")
    static WebElement restaurantField;

    @FindBy(xpath = "(//button[@data-qa=\'search-bar-near-me-icon\'])[2]")
    static WebElement nearMeBtn;

    @FindBy(xpath = "//*[@data-qa=\"button-search-find-hero\"]")
    static WebElement findBtn;

    public static FilterPage clickOnFindBtn() {
        findBtn.click();
        return new FilterPage(driver);
    }

    public static void fillDestinationField(String where) {
        destinationField.sendKeys(where);
    }

    public static void fillRestaurantField(String what) {
        restaurantField.sendKeys(what);
    }

    public static FilterPage clickOnNearMeBtn() {
        nearMeBtn.click();
        return new FilterPage(driver);
    }
}
