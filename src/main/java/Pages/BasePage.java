package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.support.PageFactory.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
        protected WebDriver driver;
        protected WebDriverWait wait;

        protected BasePage(WebDriver driver) {
            this.driver = driver;
            this.wait = new WebDriverWait(driver, 10);
            initElements(driver, this);
        }

        protected void type(WebElement element, String text) {
            //waitToBeVisible(element);
            element.sendKeys(text);
        }

        protected void click(WebElement element) {
            //waitToBeClickable(element);
            element.click();
        }

        public String getCurrentURL() {
            return (driver.getCurrentUrl());
        }
    }
}
