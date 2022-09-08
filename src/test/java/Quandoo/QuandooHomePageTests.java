package Quandoo;

import org.junit.Before;
import org.junit.Test;

import static Quandoo.Page.*;
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
        assertEquals(filterPage.getHeaderText(), EXPECTED_CITY_HEADER_TEXT);
    }

    @Test
    public void findBarThatIsInBerlinButNotOnTheWebsite() throws InterruptedException {
        homePage.fillRestaurantField(CITY_RESTAURANT);
        homePage.fillDestinationField(CITY_NAME);
        homePage.clickOnFindBtn();

        String headerText = filterPage.getHeaderText();
        assertThat(headerText, containsString(EXPECTED_CITY_HEADER_TEXT));

        String searchText = filterPage.getSearchText();
        assertThat(searchText, containsString(CITY_RESTAURANT));
    }

    @Test
    public void findRestaurantsInNearMe() throws InterruptedException {
        homePage.clickOnNearMeBtn();
        assertTrue(filterPage.listingHeaderDisplayed());
        assertEquals(filterPage.getHeaderText(), RESTAURANT_NEAR_ME);
    }

    @Test
    public void findRestaurantsPizzaType() throws InterruptedException {
        homePage.fillRestaurantField(TYPE_OF_CUISINE);
        homePage.fillDestinationField(CITY_NAME);
        homePage.clickOnFindBtn();
        assertTrue(filterPage.listingHeaderDisplayed());
        assertEquals(filterPage.getHeaderText(), EXPECTED_CITY_HEADER_TEXT);
        assertThat(filterPage.getSearchText(), containsString(TYPE_OF_CUISINE));
    }

    @Test
    public void findSpecificRestaurantClick() throws InterruptedException {
        homePage.fillDestinationField(CITY_NAME);
        homePage.fillRestaurantField(SPECIAL_CITY_RESTAURANT);
        homePage.clickOnFindBtn();
        assertTrue(filterPage.listingHeaderDisplayed());
        assertEquals(filterPage.getHeaderText(), EXPECTED_CITY_HEADER_TEXT_ONE_OPTION);
        filterPage.clickOnRestaurant();
        restaurantPage.getRestaurantName();
    }
}
