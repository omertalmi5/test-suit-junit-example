package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium.support.PageFactory.initElements;

public class LocationsPage extends BasePage {

    @FindBy (id = "btnAdd")
    private WebElement addLocationButton;

    @FindBy (id = "location_name")
    private WebElement locationName;

    @FindBy (id = "location_country")
    private WebElement locationCountry;

    @FindBy (id = "btnSave")
    private WebElement saveLocationButton;

    @FindBy (className = "messageBalloon_success")
    private WebElement successMessage;

    public LocationsPage(WebDriver driver) {
        super(driver);
        initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    public void clickAddLocation() {
        this.addLocationButton.click();
    }

    public void enterLocationName(String name) {
        this.locationName.sendKeys(name);
    }

    public void enterLocationCountry(String countryName) {
        Select country = new Select(locationCountry);
        country.selectByVisibleText(countryName);
    }

    public void saveLocation() {
        this.saveLocationButton.click();
    }
}
