package com.monster.ui;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CompanyProfilesTests extends BaseUI {
    String currentUrlCompanyProfiles;

    @Test
    public  void testCompanyProfiles (){
        driver.findElement(Locators.TAB_COMPANY_PROFILE).click();
        currentUrlCompanyProfiles = driver.getCurrentUrl();
        System.out.println(currentUrlCompanyProfiles);
        Assert.assertEquals(currentUrlCompanyProfiles, Data.expectedUrlCompanyProfiles);

    }
}
