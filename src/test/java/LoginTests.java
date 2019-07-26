
import org.testng.annotations.Test;

public class LoginTests extends BaseUI {


    @Test
    public void testLogIn(){
        driver.findElement(Locators.LINK_LOG_IN).click();
        driver.findElement(Locators.TEXT_FIELD_EMAIL_LOGIN).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD_LOGIN).sendKeys(Data.password);
        driver.findElement(Locators.BUTTON_LOGIN).click();


    }


}
