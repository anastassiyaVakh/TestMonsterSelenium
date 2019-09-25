package com.monster.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainPage extends BaseActions {

    public  MainPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public void clickLogInlinkOnMainPage(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.BUTTON_LOGIN_TOP_NAV_BAR).click();
    }

    public void clickSignUpButton(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.BUTTON_SIGN_UP_TOP_NAV_BAR).click();
    }


    public void clickAdvancedSearchButton(){
        driver.findElement(Locators.DROPDOWN_FIND_JOBS).click();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.TAB_ADVANCED_SEARCH));
        driver.findElement(Locators.TAB_ADVANCED_SEARCH);
    }

    public void clickBrowseJobsButton(){
        driver.findElement(Locators.DROPDOWN_FIND_JOBS).click();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.TAB_BROWSE_JOBS));
        driver.findElement(Locators.TAB_BROWSE_JOBS).click();
    }


    public void clickMostPopularJobsButton(){
        driver.findElement(Locators.DROPDOWN_FIND_JOBS).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.DROPDOWN_MOST_POPULAR_JOBS)));
        driver.findElement(Locators.DROPDOWN_MOST_POPULAR_JOBS).click();
    }
    public void clickITJobsButton(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.IT_JOBS_LINK)));
        driver.findElement(Locators.IT_JOBS_LINK).click();
    }
    public void clickCareerAdvise(){
        driver.findElement(Locators.DROPDOWN_CAREER_RESOURCES).click();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.CAREER_ADVICE_BUTTON));
    }
    public void clickSalaryButton(){
        driver.findElement(Locators.TAB_SALARY);
    }

    public List<WebElement> collectMostPopularJobs(){
        driver.findElement (Locators.DROPDOWN_FIND_JOBS).click ();
        wait.until (ExpectedConditions.elementToBeClickable (Locators.DROPDOWN_MOST_POPULAR_JOBS));
        driver.findElement (Locators.DROPDOWN_MOST_POPULAR_JOBS).click ();
        List<WebElement> popularJobs = driver.findElements (Locators.TAB_MOST_POPULAR_JOBS);
        return popularJobs;
    }


 }
    /*public int verifyIFrameSizeMainPage(){
        int size = driver.findElements(By.xpath("//iframe")).size();
        System.out.println(size + "iframe");
        return size;
    }

    public void verifyIFrameOnMainPage(){
    WebElement element = driver.findElement(Locators.IFRAME_);
    driver.switchTo().frame(element);
    performClick(Locators.OPEN_VIDEO);
    driver.switchTo().defaultContent();
}*/


