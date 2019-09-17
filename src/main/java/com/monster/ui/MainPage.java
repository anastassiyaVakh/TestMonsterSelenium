package com.monster.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainPage extends BaseActions {

    public  MainPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public void clickLogInlinkOnMainPage(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.LINK_LOG_IN).click();
    }

    public void clickSignUpButton(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.LINK_SIGN_UP).click();
    }


    public void clickAdvancedSearchButton(){
        driver.findElement(Locators.FIND_JOBS_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.ADVANCED_SEARCH_LINK));
        driver.findElement(Locators.ADVANCED_SEARCH_LINK);
    }

    public void clickBrowseJobsButton(){
        driver.findElement(Locators.FIND_JOBS_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BROWSE_JOBS_LINK));
        driver.findElement(Locators.BROWSE_JOBS_LINK).click();
    }


    public void clickMostPopularJobsButton(){
        driver.findElement(Locators.FIND_JOBS_BUTTON).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.MOST_POPULAR_JOBS_BUTTON)));
        driver.findElement(Locators.MOST_POPULAR_JOBS_BUTTON).click();
    }
    public void clickITJobsButton(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.IT_JOBS_LINK)));
        driver.findElement(Locators.IT_JOBS_LINK).click();
    }
    public void clickCareerAdvise(){
        driver.findElement(Locators.CAREER_RESOURCES_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.CAREER_ADVICE_BUTTON));
    }
    public void clickSalaryButton(){
        driver.findElement(Locators.LINK_SALARY);
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

}
