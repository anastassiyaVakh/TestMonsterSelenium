import org.testng.annotations.Test;

public class LoginTests extends BaseUI {


    @Test
    public void testSignInWithEmail(){
        mainPage.clickLogInButton();
        loginPage.signInWithEmail();
    }

    @Test
    public void testSignInWithFB(){
        mainPage.clickLogInButton();
        driver.findElement(Locators.BUTTON_SIGN_IN_WITH_FB);
    }
    @Test
    public void testSignInWithGoogle(){
        mainPage.clickLogInButton();
        driver.findElement(Locators.BUTTON_SIGN_IN_WITH_GOOGLE);
    }

    @Test
    public void testSignUp(){
        loginPage.clickSignUpButton();
        signUpPage.completeSignUp();
    }
    @Test
    public void testForgotPassword(){
          mainPage.clickLogInButton();
          loginPage.forgotPasswordLinkIsDisplayed();
          loginPage.forgotPassword();
    }
}
