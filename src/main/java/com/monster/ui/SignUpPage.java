package com.monster.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SignUpPage extends BaseActions {

    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super (driver, wait);
    }

    public void clickRegisterButton() {
        wait.until (ExpectedConditions.elementToBeClickable (Locators.BUTTON_REGISTER));
        driver.findElement (Locators.BUTTON_REGISTER).click ();
    }

    public void signUpStep1(String email, String password) {
        wait.until (ExpectedConditions.elementToBeClickable (Locators.TEXT_FIELD_EMAIL));
        driver.findElement (Locators.TEXT_FIELD_EMAIL).sendKeys (email);
        driver.findElement (Locators.TEXT_FIELD_PASSWORD).sendKeys (password);
        WebElement radioButtonConfirmation = driver.findElement (Locators.RADIO_BUTTON_YES);
        if (!radioButtonConfirmation.isSelected ()) {
            radioButtonConfirmation.click ();
        } else {
            System.out.println ("Radio button is already selected");
        }
    }

    public void signUpStep2(String firstName, String lastName, String zipCode) {
        driver.manage ().timeouts ().implicitlyWait (3, TimeUnit.SECONDS);
        driver.findElement (Locators.TEXT_FIELD_FIRST_NAME).sendKeys (firstName);
        driver.findElement (Locators.TEXT_FIELD_LAST_NAME).sendKeys (lastName);
        driver.findElement (Locators.DROPDOWN_COUNTRY).click ();
        clickValueOfLists (Locators.DROPDOWN_COUNTRY, "US");
        driver.findElement (Locators.TEXT_FIELD_ZIP_CODE).sendKeys (zipCode);
        WebElement dropdownListCareerLevel = driver.findElement (Locators.DROPDOWN_CAREER_LEVEL);
        getDropDownListByValue (dropdownListCareerLevel, "12");
        WebElement dropdownListEducationLevel = driver.findElement (Locators.DROPDOWN_EDUCATION_LEVEL);
        getDropDownListByValue (dropdownListEducationLevel, "9");

    }

    public void clickNextButton() {
        wait.until (ExpectedConditions.elementToBeClickable (Locators.BUTTON_NEXT));
        driver.findElement (Locators.BUTTON_NEXT).click ();
    }

    public void signUpStep3() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        clickUnselectedCheckbox (Locators.CHECKBOX_RESUME_IS_SEARCHABLE_BY_EMPLOYERS);
        clickUnselectedCheckbox (Locators.CHECKBOX_RESUME_IS_SEARCHABLE_BY_DIVERSITY_EMPLOYERS);
        clickUnselectedCheckbox (Locators.CHECKBOX_RESUME_EVALUATION);
        WebElement dropdownWorkAuthorization = driver.findElement (Locators.DROPDOWN_WORK_AUTHORIZATION);
        getDropDownListByIndex (dropdownWorkAuthorization, 2);
    }

    public void fillContactPrefFormSMSIn(String phoneNumber){

        driver.findElement (Locators.FIELD_PHONE_COUNTRY_CODE).click ();
        clickValueOfLists (Locators.FIELD_PHONE_COUNTRY_CODE, "US (+1)");
        driver.findElement (Locators.FIELD_PHONE_NUMBER).sendKeys (phoneNumber);
    }


    public void clickSkipForNowButton(){
        wait.until (ExpectedConditions.elementToBeClickable (Locators.LINK_SKIP_FOR_NOW));
        driver.findElement (Locators.LINK_SKIP_FOR_NOW).click ();
    }

    public void clickAskMeLaterButton(){
        wait.until (ExpectedConditions.elementToBeClickable (Locators.BUTTON_ASK_ME_LATER));
        driver.findElement (Locators.BUTTON_ASK_ME_LATER).click ();
    }

    public void clickConfirmContactPrefButton(){
        wait.until (ExpectedConditions.elementToBeClickable (Locators.BUTTON_CONFIRM_CONTACT_PREFERENCE));
        driver.findElement (Locators.BUTTON_CONFIRM_CONTACT_PREFERENCE).click ();
    }


    public void verifyUploadResumeButtons (){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.BUTTON_UPLOAD_RESUME_VIA_GOOGLE)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.BUTTON_UPLOAD_RESUME_VIA_DROPBOX)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.BUTTON_UPLOAD_RESUME_VIA_ONE_DRIVE)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.BUTTON_UPLOAD_RESUME_FROM_COMPUTER)));
        System.out.println ("Upload Resume buttons are displayed");
    }


    public void verifyWorkAuthorizationMenuIsDisplayed(){
        wait.until (ExpectedConditions.visibilityOf (driver.findElement (Locators.DROPDOWN_WORK_AUTHORIZATION)));
        System.out.println ("Work Authorization dropdown menu is displayed");
    }

    public void verifyNumberOfCheckboxes(){
        List<WebElement> checkBoxes = driver.findElements(Locators.CHECKBOXES_ON_UPLOAD_RESUME_SCREEN);
        System.out.println(checkBoxes.size()+  " Upload Resume checkboxes are displayed");
    }


    public List<WebElement> collectErrorMessages(){
        List<WebElement> inputErrors= driver.findElements (Locators.INPUT_ERROR);
        return inputErrors;
    }

    public void testUploadResumeFromComputer(){
        wait.until (ExpectedConditions.visibilityOf (driver.findElement (Locators.BUTTON_UPLOAD_RESUME_FROM_COMPUTER)));
        driver.findElement (Locators.BUTTON_UPLOAD_RESUME_FROM_COMPUTER).sendKeys("Desktop/Test/InvalidResume.png");
    }

}
