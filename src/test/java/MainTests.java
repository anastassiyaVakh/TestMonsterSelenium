import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MainTests extends BaseUI {


    @Test
    public void testAdvancedSearch(){
        mainPage.clickFindJobsButton();
        mainPage.clickAdvancedSearchButton();
    }

    @Test
    public void testBrowseJobs(){
        mainPage.clickFindJobsButton();
        mainPage.clickBrowseJobsButton();
    }

        @Test
        public void testPopularJobs(){
            mainPage.clickFindJobsButton();
            mainPage.clickMostPopularJobsButton();
            mainPage.clickItJobsButton();
        }

    @Test
    public void testCareerResources(){
        driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Career Resources')]")).click();
        //driver.findElement(By.xpath("//li//a[@href='https://www.monster.com/career-advice/?intcid=skr_navigation_www_career-advice']")).click();
        //driver.findElement(By.xpath("//li//a[@href='https://www.monster.com/jobs/?intcid=skr_navigation_www_jobs']")).click();

    }


}



