package Quandoo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReservationPage extends Page{

    public ReservationPage(WebDriver driver) {
        super(driver);
    }

    public static String RESERVATION_HEADER_TEXT = "Complete your reservation";

    @FindBy (xpath = "//h1[@data-qa='checkout-title']")
    WebElement completeYourReservationText;

    public String getCompleteYourReservationText() {
        return completeYourReservationText.getText();
    }
}
