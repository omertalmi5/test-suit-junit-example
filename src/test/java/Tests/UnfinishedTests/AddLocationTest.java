package Tests.UnfinishedTests;

import Constants.Country;
import Pages.HomePage;
import Pages.LocationsPage;
import Tests.BaseTest;
import org.junit.Test;
import static Processes.Utils.loginAsAdmin;

public class AddLocationTest extends BaseTest {

    @Test
    public void addLocationTest() {
        loginAsAdmin(driver);
        HomePage homePage = new HomePage(driver);
        homePage.goToLocationsPage();

        LocationsPage locationsPage = new LocationsPage(driver);
        locationsPage.clickAddLocation();
        locationsPage.enterLocationName("hello");
        locationsPage.enterLocationCountry(Country.ARGENTINA.NAME);
        locationsPage.saveLocation();
    }
}
