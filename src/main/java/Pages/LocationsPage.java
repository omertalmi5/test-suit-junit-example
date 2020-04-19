package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;
import java.util.List;

public class LocationsPage extends BasePage {
    private final String LOCATION_ALREADY_EXISTS_ERROR_SELECTOR = "#frmLocation > div:nth-child(7) > label";
    private final String LOCATION_NAMES_SELECTOR = "table > tbody > tr > td > a";

    @FindBy (id = "rightMenu")
    WebElement locationPageFrame;

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

    @FindBy (css = LOCATION_ALREADY_EXISTS_ERROR_SELECTOR)
    private WebElement locationAlreadyExistsError;

    @FindBy (css = LOCATION_NAMES_SELECTOR)
    private List<WebElement> locationNames;

    public LocationsPage(WebDriver driver) {
        super(driver);
        driver.switchTo().frame(locationPageFrame);
    }

    public void AddNewLocation(String locationName, String countryName) {
        this.addLocationButton.click();
        this.locationName.sendKeys(locationName);
        Select country = new Select(locationCountry);
        country.selectByVisibleText(countryName);
        this.saveLocationButton.click();
    }

    public String getErrorMessageText() {
        return (this.locationAlreadyExistsError.getText());
    }

    public String getSuccessMessageText() {
        return (this.successMessage.getText());
    }

    public ArrayList<String> getLocationNames() {
        ArrayList<String> locationNamesStrings = new ArrayList<String>();
        for (WebElement location : this.locationNames) {
            locationNamesStrings.add(location.getText());
        }

        return (locationNamesStrings);
    }

    public String getRandomLocationNameFromTable() {
        int randomLocationIndexFromTable;
        String locationName;

        randomLocationIndexFromTable = (int)(this.locationNames.size() * Math.random());
        locationName = this.getLocationNames().get(randomLocationIndexFromTable);

        return (locationName);
    }
}
