import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BaseActions {

    public LoginPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }


    public void signInWithEmail (){
        driver.findElement(Locators.LINK_LOG_IN).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_FIELD_EMAIL_LOGIN).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD_LOGIN).sendKeys(generateNewNumber(Data.nickname,10));

        if (!driver.findElement(Locators.CHECKBOX_KEEP_ME_LOGGED_IN).isSelected()){
            driver.findElement(Locators.CHECKBOX_KEEP_ME_LOGGED_IN).click();
        }
        driver.findElement(Locators.BUTTON_LOGIN).click();
    }

    public void forgotPassword(){
        driver.findElement(Locators.LINK_FORGOT_PASSWORD).click();
        driver.findElement(Locators.TEXT_FIELD_EMAIL_LOGIN).sendKeys(Data.email);
        driver.findElement(Locators.BUTTON_SEND_RESET_INSTRUCTION).click();
    }

  public void forgotPasswordLinkIsDisplayed (){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.LINK_FORGOT_PASSWORD)));
        System.out.println("Forgot Password link is displayed");
    }
    public void clickSignUpButton(){
        driver.findElement(Locators.ACCOUNT_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_SIGN_UP));
        driver.findElement(Locators.LINK_SIGN_UP).click();
    }

}
