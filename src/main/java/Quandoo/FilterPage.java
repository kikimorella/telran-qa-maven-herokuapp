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

    @FindBy(xpath = "//div[@data-qa=\'results-count\']")
    WebElement results;

    @FindBy(xpath = "//div[@data-qa=\'listing-header\']/div/div/span")
    WebElement errorText;

    public boolean listingHeaderDisplayed() {
        return listingHeader.isDisplayed();
    }

    public String getHeaderText() {
        return headerText.getText();
    }

    public String getSearchText() {
        return searchText.getText();
    }

    public String getResults() {
        return results.getText();
    }

    public String getErrorText() {
        return errorText.getText();
    }
}
