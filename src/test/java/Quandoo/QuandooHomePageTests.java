package Quandoo;

import org.junit.Test;
import static org.junit.Assert.*;

public class QuandooHomePageTests extends BaseTest {

    @Test
    public void findRestaurantsInBerlin() throws InterruptedException {
        HomePage.fillDestinationField("Berlin");
        HomePage.clickOnFindBtn();
        Thread.sleep(7000);
        assertTrue(FilterPage.listingHeaderDisplayed());
        String headerText = FilterPage.getHeaderText();
        assertEquals(headerText,"Restaurants in Berlin");
    }

    @Test
    public void findBarThatIsInBerlinButNotOnTheWebsite() {
        HomePage.fillRestaurantField("The Hat");
        HomePage.fillDestinationField("Berlin");
        HomePage.clickOnFindBtn();

        String headerText = FilterPage.getHeaderText();
        assertEquals(headerText,"Restaurants in Berlin");

        String searchText = FilterPage.getSearchText();
        assertEquals(searchText,"\\\"The Hat\\\"");

        String results = FilterPage.getResults();
        assertEquals(results,"10 ");
    }

    @Test
    public void findRestaurantsInNearMe() {
        HomePage.clickOnNearMeBtn();
        assertTrue(FilterPage.listingHeaderDisplayed());

        String headerText = FilterPage.getHeaderText();
        assertEquals(headerText,"Restaurants Near Me");

        String errorText = FilterPage.getErrorText();
        assertEquals(headerText,"Enable location services to see restaurants near you.");
    }

    @Test
    public void findRestaurantsPizzaType() {
        HomePage.fillRestaurantField("Pizza");
        HomePage.clickOnFindBtn();
        assertTrue(FilterPage.listingHeaderDisplayed());

        String headerText = FilterPage.getHeaderText();
        assertEquals(headerText,"Restaurants in Berlin");

        String searchText = FilterPage.getSearchText();
        assertEquals(searchText,"\\\"Pizza\\\"");
    }
}
