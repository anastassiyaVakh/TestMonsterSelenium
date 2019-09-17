package com.monster.ui;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SalaryTests extends BaseUI {
    String currentUrlSalary;


    @Test
    public  void testSalaryLink1 (){
        Assert.assertTrue(driver.findElement(Locators.LINK_SALARY).isDisplayed(), "Element is not displayed");
        driver.findElement(Locators.LINK_SALARY).click();
        currentUrlSalary = driver.getCurrentUrl();
        System.out.println(currentUrlSalary);
        softAssert.assertEquals(currentUrlSalary, Data.expectedUrlSalary, "URL is wrong");
        softAssert.assertAll();

    }

}
