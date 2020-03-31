package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class HomePage extends BasePage {
    @FindBy (id = "admin")
    protected WebElement adminMenu;

    @FindBy (linkText = "Logout")
    protected WebElement logoutButton;

    @FindBy (css = "#option-menu > li:nth-child(1)")
    protected WebElement welcomeText;

    public HomePage(WebDriver driver) {
        super(driver);
        initElements(driver, this);
    }

    public String getWelcomeToHomePageText() {
        return (this.welcomeText.getText());
    }
}
