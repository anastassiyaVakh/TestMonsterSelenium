import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BaseActions {

    public LoginPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }


    public void completeLogIn(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_FIELD_EMAIL_LOGIN).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD_LOGIN).sendKeys(generateNewNumber(Data.nickname,10));
        driver.findElement(Locators.BUTTON_LOGIN).click();
    }

}
