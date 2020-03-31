package Processes;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class Functions {

    public static void login(WebDriver driver, String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }
}
