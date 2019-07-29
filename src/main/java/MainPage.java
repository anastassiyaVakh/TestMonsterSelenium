import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainPage extends BaseActions {

    public  MainPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public void clickLogInButton(){
        driver.findElement(Locators.ACCOUNT_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_LOG_IN));
        driver.findElement(Locators.LINK_LOG_IN).click();
    }

    public void clickSignUpButton(){
        driver.findElement(Locators.ACCOUNT_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_SIGN_UP));
        driver.findElement(Locators.LINK_SIGN_UP).click();
    }

    public void clickFindJobsButton(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.FIND_JOBS_BUTTON).click();
    }

    public void clickAdvancedSearchButton(){
        wait.until(ExpectedConditions.elementToBeClickable(Locators.ADVANCED_SEARCH_LINK));
        driver.findElement(Locators.ADVANCED_SEARCH_LINK);
    }

    public void clickBrowseJobsButton(){
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BROWSE_JOBS_LINK));
        driver.findElement(Locators.BROWSE_JOBS_LINK).click();
    }


    public void clickMostPopularJobsButton(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.MOST_POPULAR_JOBS_BUTTON)));
        driver.findElement(Locators.MOST_POPULAR_JOBS_BUTTON).click();
    }
    public void clickItJobsButton(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.IT_JOBS_LINK)));
        driver.findElement(Locators.IT_JOBS_LINK).click();
    }
}
