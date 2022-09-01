package Quandoo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected HomePage homePage;
    protected FilterPage filterPage;
    protected RestaurantPage restaurantPage;
    protected WebDriver driver;

    @Before
    public void initialSetUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Windows\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1829, 1038));
        restaurantPage = new RestaurantPage(driver);
        homePage = new HomePage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
