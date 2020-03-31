package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.support.PageFactory.*;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy (id = "txtUsername")
    private WebElement usernameBox;

    @FindBy (id = "txtPassword")
    private WebElement passwordBox;

    @FindBy (id = "btnLogin")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        initElements(ajaxLocator, this);
    }

    public void enterUsername(String username) {
        this.usernameBox.sendKeys(username);
    }

    public void enterPassword(String password) {
        this.passwordBox.sendKeys(password);
    }

    public void clickLogin() {
        this.loginButton.click();
    }
}
