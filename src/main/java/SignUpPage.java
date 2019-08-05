import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage extends BaseActions {

    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }



    public void completeSignUp() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.TEXT_FIELD_EMAIL_SIGN_UP));
        driver.findElement(Locators.TEXT_FIELD_EMAIL_SIGN_UP).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD_SIGN_UP).sendKeys(Data.password);
        WebElement radioButtonConfirmation = driver.findElement(Locators.RADIO_BUTTON_YES);
        if (!radioButtonConfirmation.isSelected()){
            radioButtonConfirmation.click();
        } else {
            System.out.println("Radio button is already selected");
        }
        driver.findElement(Locators.BUTTON_REGISTER).click();
    }

    }
