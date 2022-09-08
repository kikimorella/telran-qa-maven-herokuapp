package Quandoo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//input[@name=\'destination\'])[2]")
    WebElement destinationField;

    @FindBy(xpath = "(//input[@name=\'dining\'])[2]")
    WebElement restaurantField;

    @FindBy(xpath = "(//button[@data-qa=\'search-bar-near-me-icon\'])[2]")
    WebElement nearMeBtn;

    @FindBy(xpath = "//*[@data-qa=\'button-search-find-hero\']")
    WebElement findBtn;

    public FilterPage clickOnFindBtn() throws InterruptedException {
        findBtn.click();
        Thread.sleep(4000);
        return new FilterPage(driver);
    }

    public void fillDestinationField(String where) throws InterruptedException {
        destinationField.sendKeys(where);
        Thread.sleep(4000);
        destinationField.sendKeys(Keys.ENTER);
    }

    public void fillRestaurantField(String what) {
        restaurantField.sendKeys(what);
    }

    public FilterPage clickOnNearMeBtn() throws InterruptedException {
        nearMeBtn.click();
        Thread.sleep(4000);
        return new FilterPage(driver);
    }
}
