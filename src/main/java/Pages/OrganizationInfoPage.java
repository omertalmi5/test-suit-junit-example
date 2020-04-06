package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import static org.openqa.selenium.support.PageFactory.initElements;

public class OrganizationInfoPage extends BasePage {
    @FindBy (id = "rightMenu")
    WebElement orgInfoPageFrame;

    @FindBy (id = "organization_name")
    WebElement organizationName;

    @FindBy (id = "organization_phone")
    WebElement organizationPhoneNumber;

    @FindBy (id = "organization_fax")
    WebElement organizationFaxNumber;

    @FindBy (id = "organization_email")
    WebElement organizationEmail;

    @FindBy (id = "btnSaveGenInfo")
    WebElement editButton;

    @FindBy (id = "btnSaveGenInfo")
    WebElement saveButton;


    @FindBy (css = "#messagebar > span")
    WebElement successMessage;

    @FindBy (className = "error")
    WebElement noOrganizationNameError;

    @FindBy (css = "#frmGenInfo > div:nth-child(10) > label > label")
    WebElement invalidEmailError;

    @FindBy (css = "#frmGenInfo > div:nth-child(9) > label:nth-child(1) > label")
    WebElement invalidPhoneError;

    @FindBy (css = "#frmGenInfo > div:nth-child(9) > label:nth-child(4) > label")
    WebElement invalidFaxError;

    public OrganizationInfoPage(WebDriver driver) {
        super(driver);
        initElements(new AjaxElementLocatorFactory(driver, 10), this);
        driver.switchTo().frame(orgInfoPageFrame);
    }

    public void fillFormWith(String name, String email, String phoneNumber, String faxNumber) {
        this.editButton.click();
        this.organizationName.sendKeys(name);
        this.organizationEmail.sendKeys(email);
        this.organizationPhoneNumber.sendKeys(phoneNumber);
        this.organizationFaxNumber.sendKeys(faxNumber);
        this.saveButton.click();
    }

    public void clearAllFormFields() {
        this.editButton.click();
        this.organizationName.clear();
        this.organizationEmail.clear();
        this.organizationFaxNumber.clear();
        this.organizationPhoneNumber.clear();
        this.saveButton.click();
    }

    public String getSuccessMessageText() {
        wait.until(visibilityOf(this.successMessage));
        return (this.successMessage.getText());
    }

    public String getNoOrganizationNameErrorMessageText() {
        return (this.noOrganizationNameError.getText());
    }

    public String getPhoneErrorMessageText() {
        return (this.invalidPhoneError.getText());
    }

    public String getEmailErrorMessageText() {
        return (this.invalidEmailError.getText());
    }

    public String getFaxErrorMessageText() {
        return (this.invalidFaxError.getText());
    }
}
