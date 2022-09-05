package Quandoo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RestaurantPage extends Page {
    private static WebDriver driver;

    public static String RESTAURANT_URL = BASE_URL + "/place/wartesaal-11828";

    public RestaurantPage(WebDriver driver) {
        super(driver);
    }

    // Test data

    public static String TEXT_PHOTOS_OF = "Photos of";
    public static String MENU_TEXT = "Menu from";


    @FindBy(xpath = "//*[@data-qa='sub-nav-tab-tab-photos']")
    static WebElement photosTab;

    @FindBy(xpath = "//*[@data-qa='sub-nav-tab-tab-menu']")
    static WebElement menuTab;

    @FindBy(xpath = "//*[@id='content']/div/div/h2")
    static WebElement menuFromText;

    @FindBy(xpath = "//*[@data-qa='reservation-tab']")
    static WebElement reserveNowBtn;

    @FindBy(xpath = "//*[@data-qa='sub-nav-tab-tab-photos']/div/h2")
    static WebElement photosTabText;


    public void clickOnPhotosTab() throws InterruptedException {
        photosTab.click();
        Thread.sleep(5000);
    }

    public void clickOnMenuTab() throws InterruptedException {
        menuTab.click();
        Thread.sleep(5000);
    }

    public ReservationPage clickOnReserveNowButton() throws InterruptedException {
        reserveNowBtn.click();
        Thread.sleep(5000);
        return new ReservationPage(driver);
    }

    public String getPhotosTabText() {
        return photosTabText.getText();
    }

    public String getMenuFromText() {
        return menuFromText.getText();
    }
}
