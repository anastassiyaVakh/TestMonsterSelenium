package com.monster.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class SignUpTests extends BaseUI {

    String nameOfErrorMessage;
    String currentUrlStep4ResumeIsNotUploaded;


    @Test(dataProvider = "RegistrationStep1TestEmailField", dataProviderClass = DataProviders.class)
    public void testEmailFieldSignUp(String email, String password, String firstName, String lastName, String zipCode, boolean requirement) {

        System.out.println (email);
        mainPage.clickSignUpButton ();
        signUpPage.signUpStep1 (email, password);

        if (!requirement) {
            Assert.assertTrue (driver.findElement (Locators.EMAIL_ERROR).isDisplayed ());
            System.out.println ("Something is wrong with your email");
        } else {
            signUpPage.clickRegisterButton ();
            signUpPage.signUpStep2 (firstName, lastName, zipCode);
            signUpPage.clickNextButton ();
            loginPage.signOut ();
        }
    }

    @Test(dataProvider = "RegistrationStep1TestPasswordField", dataProviderClass = DataProviders.class)
    public void testPasswordFieldSignUp(String email, String password, String firstName, String lastName, String zipCode, boolean requirement) {

        System.out.println (email);
        mainPage.clickSignUpButton ();
        signUpPage.signUpStep1 (email, password);

        if (!requirement) {
            Assert.assertTrue (driver.findElement (Locators.PASSWORD_ERROR).isDisplayed ());
            System.out.println ("Something is wrong with your password");
        } else {
            signUpPage.clickRegisterButton ();
            signUpPage.signUpStep2 (firstName, lastName, zipCode);
            signUpPage.clickNextButton ();
            loginPage.signOut ();
        }
    }

    @Test(dataProvider = "RegistrationStep2", dataProviderClass = DataProviders.class)
    public void testRegistrationStep2(String email, String password, String firstName, String lastName, String zipCode, boolean requirement) {

        System.out.println (email);
        mainPage.clickSignUpButton ();
        signUpPage.signUpStep1 (email, password);
        signUpPage.clickRegisterButton ();
        signUpPage.signUpStep2 (firstName, lastName, zipCode);

        if (!requirement) {
            Assert.assertTrue (driver.findElement (Locators.INPUT_ERROR).isDisplayed ());
            System.out.println ("Red fields are required");
        } else {

            signUpPage.clickNextButton ();
            signUpPage.signUpStep3 ();
            loginPage.signOut ();
        }
    }

    @Test(dataProvider = "RegistrationStep3", dataProviderClass = DataProviders.class)
    public void testRegistrationStep3(String email, String password, String firstName, String lastName, String zipCode, boolean requirement) {

        System.out.println (email);
        mainPage.clickSignUpButton ();
        signUpPage.signUpStep1 (email, password);
        signUpPage.clickRegisterButton ();
        signUpPage.signUpStep2 (firstName, lastName, zipCode);
        signUpPage.clickNextButton ();

        if (!requirement) {
            Assert.assertTrue (driver.findElement (Locators.INPUT_ERROR).isDisplayed ());
            System.out.println ("Red fields are required");
        } else {
            signUpPage.signUpStep3 ();
            signUpPage.clickSkipForNowButton ();
            loginPage.signOut ();
        }
    }

    @Test
    public void verifyElementsAreDisplayedStep3() {
        mainPage.clickSignUpButton ();
        signUpPage.signUpStep1 (Data.fullEmail1, Data.fullpassword);
        signUpPage.clickRegisterButton ();
        signUpPage.signUpStep2 (Data.randomString, Data.randomString, Data.zipCode);
        signUpPage.clickNextButton ();
        signUpPage.verifyUploadResumeButtons ();

        signUpPage.verifyNumberOfCheckboxes ();
        signUpPage.verifyWorkAuthorizationMenuIsDisplayed ();

        int sizeOfDropDownWorkAuthorization = signUpPage.getSizeDropDownList (Locators.DROPDOWN_WORK_AUTHORIZATION);
        System.out.println ("Size of Authorization dropdown menu is " + sizeOfDropDownWorkAuthorization);
        for (int i = 0; i < 2; i++) {
            signUpPage.selectItemDropDownRandomOption (Locators.DROPDOWN_WORK_AUTHORIZATION, "Work Authorization");
            mainPage.javaWait (3);
        }

    }

    @Test  /*(dataProvider = "UploadResumeFromComputer", dataProviderClass = DataProviders.class)*/
    public void verifyUploadResumeFromComputer()  /*(String email, String password, String resume, boolean requirement)*/ {
        //System.out.println (email);
        mainPage.clickSignUpButton ();
        signUpPage.signUpStep1 (Data.fullEmail1, Data.fullpassword);
        signUpPage.clickRegisterButton ();
        signUpPage.signUpStep2 (Data.randomString, Data.randomString, Data.zipCode);
        signUpPage.clickNextButton ();

         WebElement element= driver.findElement(Locators.UPLOAD_RESUME_LINK);
         element.sendKeys("Desktop/Test/Test_Resume.docx");
         signUpPage.javaWaitSec (5);
         //signUpPage.testUploadResumeFromComputer ();
         Assert.assertTrue (driver.findElement (Locators.UPLOAD_RESUME_INDICATOR).isDisplayed ());
/*
         if (!requirement) {
            wait.until (ExpectedConditions.visibilityOf (driver.findElement (Locators.INVALID_FORMAT_RESUME_ERROR)));
            System.out.println ("The selected resume file has an invalid format");
        } else {

            System.out.println ("Resume is uploaded");
            loginPage.signOut ();

        }*/
    }

    @Test
    public void testRegistrationStep4() {
        mainPage.clickSignUpButton ();
        signUpPage.signUpStep1 (Data.fullEmail1, Data.fullpassword);
        signUpPage.clickRegisterButton ();
        signUpPage.signUpStep2 (Data.randomString, Data.randomString, Data.zipCode);
        signUpPage.clickNextButton ();
        signUpPage.clickSkipForNowButton ();
        currentUrlStep4ResumeIsNotUploaded = driver.getCurrentUrl ();
        System.out.println (currentUrlStep4ResumeIsNotUploaded);
        Assert.assertEquals (currentUrlStep4ResumeIsNotUploaded, Data.expectedUrlRegistrationStep4ResumeSkipped);

        WebElement buttonResumeGoogle = driver.findElement (Locators.BUTTON_UPLOAD_RESUME_VIA_GOOGLE);
        WebElement buttonResumeDropBox = driver.findElement (Locators.BUTTON_UPLOAD_RESUME_VIA_DROPBOX);
        WebElement buttonResumeOneDrive = driver.findElement (Locators.BUTTON_UPLOAD_RESUME_VIA_ONE_DRIVE);
        WebElement buttonResumeComputer = driver.findElement (Locators.BUTTON_UPLOAD_RESUME_FROM_COMPUTER);

        if (signUpPage.elementsDisplayed (buttonResumeGoogle)) {
            System.out.println ("Upload Resume via Google button is displayed");
        }
        if (signUpPage.elementsDisplayed (buttonResumeDropBox)) {
            System.out.println ("Upload Resume via Dropbox is displayed");
        }
        if (signUpPage.elementsDisplayed (buttonResumeOneDrive)) {
            System.out.println ("Upload Resume via One Drive is displayed");
        }

        if (signUpPage.elementsDisplayed (buttonResumeComputer)) {
            System.out.println ("Upload Resume from computer is displayed");
        } else {
            Assert.fail ("We can't find this button");
        }

        signUpPage.clickAskMeLaterButton ();
        loginPage.signOut ();

    }

    @Test(dataProvider = "RegistrationSMSOptIn", dataProviderClass = DataProviders.class)
    public void testContactPreferencesForm(String email, String password, String phoneNumber, boolean requirement) {
        System.out.println (email);
        mainPage.clickSignUpButton ();
        signUpPage.signUpStep1 (email, password);
        signUpPage.clickRegisterButton ();
        signUpPage.signUpStep2 (Data.randomString, Data.randomString, Data.zipCode);
        signUpPage.clickNextButton ();

        signUpPage.clickSkipForNowButton ();
        currentUrlStep4ResumeIsNotUploaded = driver.getCurrentUrl ();
        System.out.println (currentUrlStep4ResumeIsNotUploaded);
        Assert.assertEquals (currentUrlStep4ResumeIsNotUploaded, Data.expectedUrlRegistrationStep4ResumeSkipped);
        signUpPage.clickAskMeLaterButton ();

        mainPage.javaWait (5000);
        driver.findElement (Locators.CHECKBOX_SMS_IN).click ();
        signUpPage.fillContactPrefFormSMSIn (phoneNumber);
        signUpPage.clickConfirmContactPrefButton ();

        if (!requirement) {
            Assert.assertTrue (driver.findElement (Locators.CONTACT_PREF_ERROR).isDisplayed ());
            System.out.println ("Something is wrong");
        } else {
            System.out.println ("Receive SMS is ON");
            loginPage.signOut ();
        }
    }

    @Test
    public void verifyInputErrorsAreDisplayed() {
        mainPage.clickSignUpButton ();
        signUpPage.signUpStep1 (Data.fullEmail1, Data.randomString);
        signUpPage.clickRegisterButton ();
        signUpPage.clickNextButton ();

        List<WebElement> inputErrors = signUpPage.collectErrorMessages ();

        for (int i = 0; i < inputErrors.size (); i++) {
            WebElement link = inputErrors.get (i);
            nameOfErrorMessage = link.getText ();

            if (nameOfErrorMessage.contains ("First Name is required.")) {
                System.out.println ("First Name Error is displayed");
            } else if (nameOfErrorMessage.contains ("Last Name is required.")) {
                System.out.println ("Last Name Error is displayed");

            } else if (nameOfErrorMessage.contains ("Zipcode is required.")) {
                System.out.println ("Zip code error is displayed");

            } else if (nameOfErrorMessage.contains ("Current Career Level is required.")) {
                System.out.println ("Career Level error is displayed");
            } else if (nameOfErrorMessage.contains ("Education Level is required.")) {
                System.out.println ("Education Level error is displayed");
                break;
            } else {
                System.out.println ("Something is wrong");
                loginPage.signOut ();

            }

        }

    }

}

