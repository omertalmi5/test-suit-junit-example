package Tests;

import static Processes.Functions.*;
import static org.hamcrest.core.StringContains.containsString;
import Pages.HomePage;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseTest {
    private final String USERNAME = "opensourcecms";
    private final String PASSWORD = "opensourcecms";

    @Test
    public void loginTest() {
        login(driver, USERNAME, PASSWORD);
        HomePage homePage = new HomePage(driver);
        Assert.assertThat(homePage.getWelcomeToHomePageText(), containsString("Welcome"));
    }
}
