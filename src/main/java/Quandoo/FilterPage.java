package Quandoo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilterPage extends Page {

    public FilterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1")
    WebElement headerText;

    @FindBy(xpath = "//div[@data-qa=\'listing-header\']")
    WebElement listingHeader;

    @FindBy(xpath = "//span[@data-qa=\"search-text\"]")
    WebElement searchText;

    @FindBy(xpath = "//a[@href='/en/place/wartesaal-11828']")
    WebElement wartesaal;

    public boolean listingHeaderDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        return listingHeader.isDisplayed();
    }

    public String getHeaderText() {
        return headerText.getText();
    }

    public String getSearchText() {
        return searchText.getText();
    }

    public RestaurantPage clickOnRestaurant() throws InterruptedException {
        wartesaal.click();
        Thread.sleep(2000);
        return new RestaurantPage(driver);
    }
}
