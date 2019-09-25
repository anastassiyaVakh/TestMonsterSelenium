package com.monster.ui;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class LoginTests extends BaseUI {

    String currentUrlLogin;
    String parent_handle;

    @Test
    public void verifyElementsAreDisplayedOnSignPage() {
        mainPage.clickLogInlinkOnMainPage ();
        wait.until (ExpectedConditions.visibilityOf (driver.findElement (Locators.HEADER_SIGN_IN_PAGE)));
        wait.until (ExpectedConditions.elementToBeClickable (Locators.TEXT_FIELD_EMAIL));
        wait.until (ExpectedConditions.elementToBeClickable (Locators.TEXT_FIELD_PASSWORD));
        wait.until (ExpectedConditions.elementToBeClickable (Locators.CHECKBOX_KEEP_ME_LOGGED_IN));
        wait.until (ExpectedConditions.elementToBeClickable (Locators.BUTTON_LOGIN));
        wait.until (ExpectedConditions.elementToBeClickable (Locators.BUTTON_SIGN_IN_WITH_FB));
        wait.until (ExpectedConditions.elementToBeClickable (Locators.BUTTON_SIGN_IN_WITH_GOOGLE));
        wait.until (ExpectedConditions.visibilityOf (driver.findElement (Locators.HEADER_DONT_HAVE_MONSTER_ACCOUNT)));
        wait.until (ExpectedConditions.elementToBeClickable (Locators.BUTTON_SIGN_IN_WITH_GOOGLE));
        wait.until (ExpectedConditions.elementToBeClickable (Locators.BUTTON_SIGN_UP_SIGN_IN_PAGE));

    }

    @Test(dataProvider = "SignInWithValidCredentials", dataProviderClass = DataProviders.class)
    public void testSignInValidAccountInfo(String email, String password, boolean requirement) {
        driver.manage ().timeouts ().implicitlyWait (3, TimeUnit.SECONDS);
        mainPage.clickLogInlinkOnMainPage ();
        currentUrlLogin = driver.getCurrentUrl ();
        System.out.println (currentUrlLogin);
        softAssert.assertEquals (currentUrlLogin, Data.expectedUrlLogin, "URL is wrong");
        softAssert.assertAll ();

        System.out.println (email);
        loginPage.signInWithEmail (email, password);
        loginPage.clickLoginButton ();

        if (!requirement) {
            Assert.assertTrue (driver.findElement (Locators.ERROR_SOMETHING_IS_INCORRECT).isDisplayed (), " Element is displayed");
            System.out.println ("FAIL: Something is wrong with this account.");

        } else {
            System.out.println ("PASS: User is able to log in with valid account information");
            loginPage.signOut ();
        }
    }

    @Test(dataProvider = "SignInWithInvalidCredentials", dataProviderClass = DataProviders.class)
    public void signInWithEmailNegativeTestCase(String email, String password, boolean requirement) {
        Assert.assertTrue (driver.findElement (Locators.BUTTON_LOGIN_TOP_NAV_BAR).isDisplayed (), "Element is not displayed");
        mainPage.clickLogInlinkOnMainPage ();
        currentUrlLogin = driver.getCurrentUrl ();
        System.out.println (currentUrlLogin);
        softAssert.assertEquals (currentUrlLogin, Data.expectedUrlLogin, "URL is wrong");
        softAssert.assertAll ();

        System.out.println (email);
        loginPage.signInWithEmail (email, password);
        loginPage.clickLoginButton ();

        if (requirement) {
            Assert.assertTrue (driver.findElement (Locators.INPUT_ERROR).isDisplayed (), " Element is displayed");
            System.out.println ("PASS: User is unable to log in with an invalid email or password");
        }

        if (!requirement) {
            Assert.assertTrue (driver.findElement (Locators.ERROR_SOMETHING_IS_INCORRECT).isDisplayed (), " Element is displayed");
            System.out.println ("PASS: Something is wrong with this account");

        } else {
            System.out.println ("FAIL: User is able to log in with an invalid email or password");
        }
    }

    @Test (dataProvider = "SignInWithGoogle", dataProviderClass = DataProviders.class)
    public void testSignInWithGoogle(String email, String password) {
        mainPage.clickLogInlinkOnMainPage ();
        loginPage.javaWait (5000);

        parent_handle = driver.getWindowHandle();
        System.out.println(parent_handle);
        loginPage.clickContinueWithGoogleButton ();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);
        for(String handle1:handles)
            if(!parent_handle.equals(handle1))
            {
                driver.switchTo().window(handle1);
                System.out.println(handle1);
                loginPage.javaWait (5000);
                loginPage.signInWithGoogle (email, password);
                loginPage.javaWait (5000);
                driver.switchTo ().window (parent_handle);
                loginPage.verifyLogOutButtonIsDisplayed ();
            }

    }

    @Test (dataProvider = "SignInWithFacebookEmailNotRegistered", dataProviderClass = DataProviders.class)
    public void testSignInWithFacebookEmailNotRegistered(String email, String password) {
        mainPage.clickLogInlinkOnMainPage ();
        loginPage.javaWait (5000);

        parent_handle = driver.getWindowHandle();
        System.out.println(parent_handle);
        loginPage.clickContinueWithFacebookButton ();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);
        for(String handle1:handles)
            if(!parent_handle.equals(handle1))
            {
                driver.switchTo().window(handle1);
                System.out.println(handle1);
                loginPage.signInWithFacebook (email, password);
                loginPage.javaWait (5000);
                //loginPage.facebookClickConfirmButton ();
                driver.switchTo ().window (parent_handle);
                loginPage.javaWait (5000);
                loginPage.verifyElementsAreDisplayedOnCreateAccountPage ();

            }

    }
    @Test (dataProvider = "SignInWithFacebookEmailAlreadyRegistered", dataProviderClass = DataProviders.class)
    public void testSignInWithFacebook(String email, String password) {
        mainPage.clickLogInlinkOnMainPage ();
        loginPage.javaWait (5000);

        parent_handle = driver.getWindowHandle();
        System.out.println(parent_handle);
        loginPage.clickContinueWithFacebookButton ();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);
        for(String handle1:handles)
            if(!parent_handle.equals(handle1))
            {
                driver.switchTo().window(handle1);
                System.out.println(handle1);
                loginPage.signInWithFacebook (email, password);
                loginPage.javaWait (5000);
                //loginPage.facebookClickConfirmButton ();
                driver.switchTo ().window (parent_handle);
                loginPage.javaWait (5000);
                loginPage.verifyLogOutButtonIsDisplayed ();
            }

    }

    @Test(dataProvider = "ForgotPasswordForm", dataProviderClass = DataProviders.class)
    public void testForgotPassword(String email, boolean requirement) {
        mainPage.clickLogInlinkOnMainPage ();
        Assert.assertTrue (driver.findElement (Locators.LINK_FORGOT_PASSWORD).isDisplayed (), " Element is displayed");

        System.out.println (email);
        loginPage.forgotPassword (email);

        if (!requirement) {
            Assert.assertTrue (driver.findElement (Locators.EMAIL_ERROR).isDisplayed ());
            System.out.println ("PASS: User provided an invalid email address");
        } else {
            Assert.assertTrue (driver.findElement (Locators.HEADER_RESET_PASSWORD).isDisplayed ());
            System.out.println ("PASS: Reset password instructions have been sent");
        }
    }

}
