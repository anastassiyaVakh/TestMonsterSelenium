import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class MainTests extends BaseUI {


    @Test
    public void testFindJobs(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.FIND_JOBS_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.ADVANCED_SEARCH_LINK));
        driver.findElement(Locators.ADVANCED_SEARCH_LINK);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BROWSE_JOBS_LINK));
        driver.findElement(Locators.BROWSE_JOBS_LINK).click();
    }

        @Test
        public void testPopularJobs(){
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver.findElement(Locators.FIND_JOBS_BUTTON).click();
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.MOST_POPULAR_JOBS_BUTTON)));
            driver.findElement(Locators.MOST_POPULAR_JOBS_BUTTON).click();

        }
    @Test
    public void testCareerResources(){
        driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Career Resources')]")).click();
        //driver.findElement(By.xpath("//li//a[@href='https://www.monster.com/career-advice/?intcid=skr_navigation_www_career-advice']")).click();
        //driver.findElement(By.xpath("//li//a[@href='https://www.monster.com/jobs/?intcid=skr_navigation_www_jobs']")).click();

    }


}



