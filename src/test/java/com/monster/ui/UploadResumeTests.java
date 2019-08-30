package com.monster.ui;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadResumeTests extends BaseUI {
    String currentUrlUploadResume;
    int indexLinkUploadResume =0;

    @Test
    public  void testUploadResume (){
        driver.findElements(Locators.LINK_UPLOAD_RESUME).get(indexLinkUploadResume).click();
        currentUrlUploadResume = driver.getCurrentUrl();
        System.out.println(currentUrlUploadResume);
        Assert.assertEquals(currentUrlUploadResume, Data.expectedUrlUploadResume);

    }
}
