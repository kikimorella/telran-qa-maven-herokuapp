package Quandoo;

import org.openqa.selenium.Keys;
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

    public FilterPage clickOnFindBtn() throws InterruptedException {
        findBtn.click();
        Thread.sleep(7000);
        return new FilterPage(driver);
    }

    public void fillDestinationField(String where) throws InterruptedException {
        destinationField.sendKeys(where);
        Thread.sleep(3000);
        destinationField.sendKeys(Keys.ENTER);
    }

    public void fillRestaurantField(String what) {
        restaurantField.sendKeys(what);
    }

    public FilterPage clickOnNearMeBtn() {
        nearMeBtn.click();
        return new FilterPage(driver);
    }
}
