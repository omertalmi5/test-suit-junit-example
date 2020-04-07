package Tests.PositiveTests;

import static Processes.Utils.*;
import static org.hamcrest.core.StringContains.containsString;
import Pages.HomePage;
import Tests.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        loginAsAdmin(driver);
        HomePage homePage = new HomePage(driver);
        Assert.assertThat(homePage.getWelcomeToHomePageText(), containsString("Welcome"));
    }
}
