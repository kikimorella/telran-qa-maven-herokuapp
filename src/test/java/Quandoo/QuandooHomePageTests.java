package Quandoo;

import org.junit.Before;
import org.junit.Test;

import static Quandoo.Page.*;
import static Quandoo.RestaurantPage.TEXT_PHOTOS_OF;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.*;

public class QuandooHomePageTests extends BaseTest {

    @Before
    public void setUp() {
        driver.get(BASE_URL);
        homePage.clickAcceptCookiesBtn();
    }

    @Test
    public void findRestaurantsByCityName() throws InterruptedException {
        homePage.fillDestinationField(CITY_NAME);
        filterPage = homePage.clickOnFindBtn();
        assertEquals(filterPage.getHeaderText(),EXPECTED_CITY_HEADER_TEXT);
    }

//    @Test
//    public void findBarThatIsInBerlinButNotOnTheWebsite() {
//        HomePage.fillRestaurantField("The Hat");
//        HomePage.fillDestinationField("Berlin");
//        HomePage.clickOnFindBtn();
//
//        String headerText = FilterPage.getHeaderText();
//        assertEquals(headerText,"Restaurants in Berlin");
//
//        String searchText = FilterPage.getSearchText();
//        assertEquals(searchText,"\\\"The Hat\\\"");
//
//        String results = FilterPage.getResults();
//        assertEquals(results,"10 ");
//    }
//
//    @Test
//    public void findRestaurantsInNearMe() {
//        HomePage.clickOnNearMeBtn();
//        assertTrue(FilterPage.listingHeaderDisplayed());
//
//        String headerText = FilterPage.getHeaderText();
//        assertEquals(headerText,"Restaurants Near Me");
//
//        String errorText = FilterPage.getErrorText();
//        assertEquals(headerText,"Enable location services to see restaurants near you.");
//    }
//
//    @Test
//    public void findRestaurantsPizzaType() {
//        HomePage.fillRestaurantField("Pizza");
//        HomePage.clickOnFindBtn();
//        assertTrue(FilterPage.listingHeaderDisplayed());
//
//        String headerText = FilterPage.getHeaderText();
//        assertEquals(headerText,"Restaurants in Berlin");
//
//        String searchText = FilterPage.getSearchText();
//        assertEquals(searchText,"\\\"Pizza\\\"");
//    }
}
