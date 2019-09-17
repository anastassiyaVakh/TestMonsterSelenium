package com.monster.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BaseActions {

    public LoginPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public void signInWithEmail (String email, String password){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(password);
        clickUnselectedCheckbox (Locators.CHECKBOX_KEEP_ME_LOGGED_IN);
    }

    public void clickContinueWithGoogleButton (){
        wait.until (ExpectedConditions.elementToBeClickable (Locators.BUTTON_SIGN_IN_WITH_GOOGLE));
        performClick (Locators.BUTTON_SIGN_IN_WITH_GOOGLE);
    }

    public void clickContinueWithFacebookButton (){
        wait.until (ExpectedConditions.elementToBeClickable (Locators.BUTTON_SIGN_IN_WITH_FB));
        performClick (Locators.BUTTON_SIGN_IN_WITH_FB);
    }

    public void clickLoginButton(){
        wait.until (ExpectedConditions.elementToBeClickable (Locators.BUTTON_LOGIN));
        driver.findElement (Locators.BUTTON_LOGIN).click ();
    }


    public void forgotPassword(String email){
        driver.findElement(Locators.LINK_FORGOT_PASSWORD).click();
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(email);
        driver.findElement(Locators.BUTTON_SEND_RESET_INSTRUCTION).click();
    }

    public void clickSignUpButton(){
        driver.findElement(Locators.ACCOUNT_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_SIGN_UP));
        driver.findElement(Locators.LINK_SIGN_UP).click();
    }

    public void signOut(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement (Locators.ACCOUNT_BUTTON).click ();
        driver.findElement (Locators.BUTTON_LOG_OUT).click ();
    }

}
