package com.monster.ui;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainTests extends BaseUI {

    String info;
    String popularJobName;

    @Test
    public void verifyMainNavBarElementsAreDisplayed(){

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wait.until (ExpectedConditions.elementToBeClickable (Locators.DROPDOWN_FIND_JOBS));
        wait.until (ExpectedConditions.elementToBeClickable (Locators.DROPDOWN_CAREER_RESOURCES));
        wait.until (ExpectedConditions.elementToBeClickable (Locators.TAB_COMPANY_PROFILE));
        wait.until (ExpectedConditions.elementToBeClickable (Locators.TAB_SALARY));

        driver.findElement(Locators.DROPDOWN_FIND_JOBS).click();

        wait.until (ExpectedConditions.elementToBeClickable (Locators.TAB_ADVANCED_SEARCH));
        wait.until (ExpectedConditions.elementToBeClickable (Locators.TAB_BROWSE_JOBS));
        wait.until (ExpectedConditions.elementToBeClickable (Locators.DROPDOWN_MOST_POPULAR_JOBS));

        driver.findElement (Locators.DROPDOWN_CAREER_RESOURCES).click ();

        wait.until (ExpectedConditions.elementToBeClickable (Locators.TAB_CAREER_ADVICE));
        wait.until (ExpectedConditions.elementToBeClickable (Locators.TAB_RESUME_WRITING_SERVICES));
        wait.until (ExpectedConditions.elementToBeClickable (Locators.TAB_UPLOAD_RESUME));

    }

    @Test
    public void verifyAccountButtonIsDisplayed(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().setPosition(new Point (-2000, 0));
        wait.until (ExpectedConditions.elementToBeClickable (Locators.DROPDOWN_ACCOUNT));
        driver.findElement (Locators.DROPDOWN_ACCOUNT).click ();
        wait.until (ExpectedConditions.elementToBeClickable (Locators.BUTTON_LOGIN_TOP_NAV_BAR));
        wait.until (ExpectedConditions.elementToBeClickable (Locators.BUTTON_SIGN_UP_TOP_NAV_BAR));




    }
@Test
public void verifyMostPopularJobsDropdownMenu(){
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    driver.findElement (Locators.DROPDOWN_FIND_JOBS).click ();
    wait.until (ExpectedConditions.elementToBeClickable (Locators.DROPDOWN_MOST_POPULAR_JOBS));

    driver.findElement (Locators.DROPDOWN_MOST_POPULAR_JOBS).click ();
    int count = driver.findElements (Locators.TAB_MOST_POPULAR_JOBS).size ();
    System.out.println (count);
    if (count == 6){
        System.out.println ("PASS: Most popular jobs are displayed ");
    }
    else {
        System.out.println ("Something is wrong");

    }
}
    @Test
    public void smokeTestMostPopularJobs() {

        List<WebElement> popularJobsList = mainPage.collectMostPopularJobs ();

        for (int i = 0; i < popularJobsList.size (); i++) {
            WebElement link = popularJobsList.get (i);
            popularJobName = link.getText ();

            if (popularJobName.contains ("Software Developer / Engineer")) {
                System.out.println ("Software Developer / Engineer tab is displayed ");
            } else if (popularJobName.contains ("Registered Nurse")) {
                System.out.println ("Registered Nurse tab is displayed");

            } else if (popularJobName.contains ("Retail Sales")) {
                System.out.println ("Retail Sales tab is displayed");

            } else if (popularJobName.contains ("IT")) {
                System.out.println ("IT tab is displayed");

            } else if (popularJobName.contains ("Driver")) {
                System.out.println ("Driver tab is displayed");

            }else if (popularJobName.contains ("Customer Service")) {
                System.out.println ("Customer Service tab is displayed ");

            }
            else {
                System.out.println ("Something is wrong");

            }
        }

    }



    @Test
    public void smokeTestFooter() {
        mainPage.scrollToBottomOfPage ();
        mainPage.javaWait (1000);
        List<WebElement> footer = driver.findElements (Locators.FOOTER_BUTTONS);
        for (int i = 0; i < footer.size (); i++) {
            footer.get (i).click ();
            driver.get (Data.mainUrl);
            footer = driver.findElements (Locators.FOOTER_BUTTONS);
        }
    }

  /*  @Test
    public void testNavigationMenu() {

        String actualTitle;
        String actualUrlCompanyProfiles;

        List<WebElement> links = driver.findElements (Locators.MAIN_NAVIGATION_MENU);
        System.out.println (links.size ());

        for (int i = 0; i < links.size (); i++) {
            info = links.get (i).getText ();
            System.out.println (info);
            mainPage.ajaxClick (links.get (i));

            if (info.contains ("Company Profiles")) {
                driver.findElement (Locators.LINK_COMPANY_PROFILE).click ();
                actualTitle = driver.findElement (Locators.PAGE_TITLE_COMPANY_PROFILES).getText ();
                actualUrlCompanyProfiles = driver.getCurrentUrl ();
                Assert.assertEquals (Data.expectedTitleCompanyProfiles, actualTitle);
                Assert.assertEquals (actualUrlCompanyProfiles, Data.expectedUrlCompanyProfiles);
                driver.findElement (Locators.LINK_BROWSE_ALL_COMPANIES).isDisplayed ();

                if (actualUrlCompanyProfiles.contains ("#")) {
                    Assert.fail ("It contains restricted #");
                } else {
                    System.out.println ("No special character.It it good URL!");
                }

            }

            if (info.contains ("Salary")) {
                driver.findElement (Locators.LINK_SALARY).click ();
                actualTitle = driver.findElement (Locators.PAGE_TITLE_SALARY).getText ();
                Assert.assertEquals (Data.expectedTitleSalary, actualTitle);

            }
            driver.get (Data.mainUrl);
            links = driver.findElements (Locators.MAIN_NAVIGATION_MENU);

        }
    }*/

    @Test
    public void testAdvancedSearch() {
        mainPage.clickAdvancedSearchButton ();
    }

    @Test
    public void testBrowseJobs() {
        mainPage.clickBrowseJobsButton ();
    }

    @Test
    public void testPopularJobs() {
        mainPage.clickMostPopularJobsButton ();
        mainPage.clickITJobsButton ();
    }

    @Test
    public void testCareerResources() {
        mainPage.clickCareerAdvise ();
    }

  /* @Test
    public void testIFrame(){
        int numberOfIFrames = mainPage.verifyIFrameSizeMainPage();
       Assert.assertTrue(numberOfIFrames > 0);
       mainPage.verifyIFrameOnMainPage();

   }*/
}



