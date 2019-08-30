package com.monster.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage extends BaseActions {

    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }



    public void signUpStep1(String email, String password) {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.TEXT_FIELD_EMAIL_SIGN_UP));
        driver.findElement(Locators.TEXT_FIELD_EMAIL_SIGN_UP).sendKeys(email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD_SIGN_UP).sendKeys(password);
        WebElement radioButtonConfirmation = driver.findElement(Locators.RADIO_BUTTON_YES);
        if (!radioButtonConfirmation.isSelected()){
            radioButtonConfirmation.click();
        } else {
            System.out.println("Radio button is already selected");
        }
        driver.findElement(Locators.BUTTON_REGISTER).click();
    }

    public void signUpStep2(String firstname, String lastname) {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.TEXT_FIELD_FIRST_NAME));
        driver.findElement(Locators.TEXT_FIELD_FIRST_NAME).sendKeys(firstname);
        driver.findElement(Locators.TEXT_FIELD_LAST_NAME).sendKeys(lastname);
        WebElement dropdownListCountries = driver.findElement(Locators.DROPDOWN_COUNTRY);
        getDropDownListByValue(dropdownListCountries, "175");
        // driver.findElement(Locators.TEXT_FIELD_ZIP_CODE).sendKeys(Data.zipCode);

        WebElement dropdownListCareerLevel = driver.findElement(Locators.DROPDOWN_CAREER_LEVEL);
        getDropDownListByValue(dropdownListCareerLevel, "12");

        WebElement dropdownListEducationLevel = driver.findElement(Locators.DROPDOWN_EDUCATION_LEVEL);
        getDropDownListByValue(dropdownListEducationLevel, "9");
        driver.findElement(Locators.BUTTON_NEXT).click();

        wait.until(ExpectedConditions.elementToBeClickable(Locators.CHECKBOX_IS_SEARCHABLE));
        clickUnselectedCheckbox(Locators.CHECKBOX_IS_SEARCHABLE);
        WebElement dropdownWorkAuthorization = driver.findElement(Locators.DROPDOWN_WORK_AUTHORIZATION);
        getDropDownListByIndex(dropdownWorkAuthorization, 2);


    }

    }
