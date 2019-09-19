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
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_LOG_OUT));
        driver.findElement (Locators.BUTTON_LOG_OUT).click ();
    }

    public void verifyLogOutButtonIsDisplayed(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement (Locators.ACCOUNT_BUTTON).click ();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_LOG_OUT));
        System.out.println ("Log out button is displayed");


    }

    public void signInWithFacebook(String email, String password){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement (Locators.FB_EMAIL_FIELD).sendKeys (email);
        driver.findElement (Locators.FB_PASSWORD_FIELD).sendKeys (password);
        driver.findElement (Locators.FB_LOGIN_BUTTON).click ();

    }

    public void facebookClickConfirmButton(){
        wait.until(ExpectedConditions.elementToBeClickable(Locators.FB_BUTTON_CONFIRM));
        driver.findElement (Locators.FB_BUTTON_CONFIRM).click ();

    }

    public void verifyElementsAreDisplayedOnCreateAccountPage(){
        wait.until (ExpectedConditions.visibilityOf (driver.findElement (Locators.HEADER_CREATE_ACCOUNT)));
        wait.until (ExpectedConditions.elementToBeClickable (Locators.BUTTON_SIGN_IN_ON_CREATE_ACCOUNT_PAGE));
        wait.until (ExpectedConditions.elementToBeClickable (Locators.TEXT_FIELD_EMAIL));
        wait.until (ExpectedConditions.elementToBeClickable (Locators.RADIO_BUTTON_YES));
        wait.until (ExpectedConditions.elementToBeClickable (Locators.RADIO_BUTTON_NO));
        wait.until (ExpectedConditions.elementToBeClickable (Locators.LINK_PRAVACY_POLICY));
        wait.until (ExpectedConditions.elementToBeClickable (Locators.LINK_TERMS_OF_USE));
        wait.until (ExpectedConditions.elementToBeClickable (Locators.BUTTON_REGISTER));
    }

    public void signInWithGoogle(String email, String password){
        wait.until(ExpectedConditions.elementToBeClickable(Locators.GOOGLE_EMAIL_FIELD));
        driver.findElement (Locators.GOOGLE_EMAIL_FIELD).sendKeys (email);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.GOOGLE_BUTTON_NEXT_ON_EMAIL_SCREEN));
        driver.findElement (Locators.GOOGLE_BUTTON_NEXT_ON_EMAIL_SCREEN).click ();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.GOOGLE_PASSWORD_FIELD));
        driver.findElement (Locators.GOOGLE_PASSWORD_FIELD).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.GOOGLE_BUTTON_NEXT_ON_PASSWORD_SCREEN));
        driver.findElement (Locators.GOOGLE_BUTTON_NEXT_ON_PASSWORD_SCREEN).click ();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.GOOGLE_BUTTON_ALLOW));
        driver.findElement (Locators.GOOGLE_BUTTON_ALLOW).click ();

    }

    public void googleClickNextButton(){
        wait.until(ExpectedConditions.elementToBeClickable(Locators.GOOGLE_BUTTON_NEXT_ON_EMAIL_SCREEN));
        driver.findElement (Locators.GOOGLE_BUTTON_NEXT_ON_EMAIL_SCREEN).click ();

    }


}
