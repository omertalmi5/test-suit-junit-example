package Tests;

import Enums.Country;
import Pages.HomePage;
import Pages.LocationsPage;
import static org.junit.Assert.*;
import org.junit.Test;
import static Processes.Functions.login;

public class AddLocationTest extends BaseTest {
    @Test
    public void addLocationTest() {
        login(driver, USERNAME, PASSWORD);
        HomePage homePage = new HomePage(driver);
        homePage.goToLocationsPage();

        LocationsPage locationsPage = new LocationsPage(driver);
        locationsPage.clickAddLocation();
        locationsPage.enterLocationName("hello");
        locationsPage.enterLocationCountry(Country.ARGENTINA.toString());
        locationsPage.saveLocation();

    }
}
