package Tests.UnfinishedTests;

import static Constants.Country.*;
import Pages.HomePage;
import Pages.LocationsPage;
import Tests.BaseTest;
import org.junit.Test;

import static Constants.Errors.SAVE_SUCCESS_MESSAGE;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddLocationTest extends BaseTest {
    final String LOCATION_NAME = "Buenos Aires";
    final String SUCCESS_MESSAGE = SAVE_SUCCESS_MESSAGE;

    @Test
    public void addLocationTest() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLocationsPage();

        LocationsPage locationsPage = new LocationsPage(driver);
        locationsPage.AddNewLocation(LOCATION_NAME, ARGENTINA.NAME);

        assertThat(locationsPage.getSuccessMessageText(), is(SUCCESS_MESSAGE));
        assertThat(locationsPage.getLocationNames(), hasItem(LOCATION_NAME));

    }
}
