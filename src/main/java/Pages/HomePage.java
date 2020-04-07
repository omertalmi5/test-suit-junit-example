package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import static org.openqa.selenium.support.PageFactory.initElements;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class HomePage extends BasePage {
    @FindBy (id = "admin")
    protected WebElement adminMenu;

    @FindBy (linkText = "Logout")
    protected WebElement logoutButton;

    @FindBy (css = "#option-menu > li:nth-child(1)")
    protected WebElement welcomeText;

    @FindBy (css = "#admin > ul > li:nth-child(1) > a")
    protected WebElement organizationMenu;

    @FindBy (css = "#admin > ul > li:nth-child(1) > ul > li:nth-child(2) > a")
    protected WebElement locationsButton;

    @FindBy (id = "rightMenu")
    private WebElement locationPageFrame;

    public HomePage(WebDriver driver) {
        super(driver);
        initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    public String getWelcomeToHomePageText() {
        return (this.welcomeText.getText());
    }

    public void goToLocationsPage() {
        Actions action = new Actions(driver);
        action.moveToElement(this.adminMenu).moveToElement(this.organizationMenu).moveToElement(this.locationsButton).build().perform();
        wait.until(elementToBeClickable(this.locationsButton)).click();
        wait.until(frameToBeAvailableAndSwitchToIt(locationPageFrame));
        wait.until(visibilityOfElementLocated(By.id("searchLocationHeading")));
    }

    public void goToOrganizationInfoPage() {
        this.adminMenu.click();
    }
}
