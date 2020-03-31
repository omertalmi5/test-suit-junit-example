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

    @FindBy (css = "#admin > ul > li:nth-child(1) > ul > li:nth-child(2) > a")
    protected WebElement locationsButton;

    public HomePage(WebDriver driver) {
        super(driver);
        initElements(ajaxLocator, this);
    }

    public String getWelcomeToHomePageText() {
        return (this.welcomeText.getText());
    }

    public void goToLocationsPage() {
        this.locationsButton.click();
    }
}
