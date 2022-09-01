package Quandoo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilterPage extends Page {

    public FilterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1")
    static WebElement headerText;

    @FindBy(xpath = "//div[@data-qa=\'listing-header\']")
    static WebElement listingHeader;

    @FindBy(xpath = "//span[@data-qa=\"search-text\"]")
    static WebElement searchText;

    @FindBy(xpath = "//div[@data-qa=\'results-count\']")
    static WebElement results;

    @FindBy(xpath = "//div[@data-qa=\'listing-header\']/div/div/span")
    static WebElement errorText;

    public static boolean listingHeaderDisplayed() {
        return listingHeader.isDisplayed();
    }

    public static String getHeaderText() {
        return headerText.getText();
    }

    public static String getSearchText() {
        return searchText.getText();
    }

    public static String getResults() {
        return results.getText();
    }

    public static String getErrorText() {
        return errorText.getText();
    }
}
