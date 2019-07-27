import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainPage extends BaseActions {

    public  MainPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public void clickLogInButton(){
        driver.findElement(Locators.LINK_LOG_IN).click();

    }


}
