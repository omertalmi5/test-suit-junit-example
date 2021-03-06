package Processes;

import static Constants.CONST.ADMIN_USERNAME;
import static Constants.CONST.ADMIN_PASSWORD;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class Utils {

    public static void loginAsAdmin(WebDriver driver) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(ADMIN_USERNAME);
        loginPage.enterPassword(ADMIN_PASSWORD);
        loginPage.clickLogin();
    }

    public static void goToOrganizationInfoPage(WebDriver driver) {
        HomePage homePage = new HomePage(driver);
        homePage.goToOrganizationInfoPage();
    }
}
