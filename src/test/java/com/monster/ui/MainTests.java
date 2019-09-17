package com.monster.ui;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class MainTests extends BaseUI {

    @Test
    public void smokeTestMainMenu() {
        List<WebElement> mainTabs = driver.findElements (Locators.MAIN_NAVIGATION_MENU);
        for (int i = 0; i < mainTabs.size (); i++) {
            mainTabs.get (i).click ();
            driver.get (Data.mainUrl);
            mainTabs = driver.findElements (Locators.MAIN_NAVIGATION_MENU);
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

    @Test
    public void testNavigationMenu() {

        String actualTitle;
        String actualUrlCompanyProfiles;
        String info;

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
    }

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



