import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SignUpPage extends BaseActions {

    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void completeSignUp() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.TEXT_FIELD_EMAIL_SIGN_UP));
        driver.findElement(Locators.TEXT_FIELD_EMAIL_SIGN_UP).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD_SIGN_UP).sendKeys(Data.password);
        if (!driver.findElement(Locators.RADIO_BUTTON_YES).isSelected()){
            driver.findElement(Locators.RADIO_BUTTON_YES).click();
        } else {
            driver.findElement(Locators.RADIO_BUTTON_NO).click();
        }
        driver.findElement(Locators.BUTTON_REGISTER).click();
    }

    }
