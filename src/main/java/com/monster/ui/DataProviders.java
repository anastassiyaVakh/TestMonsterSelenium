package com.monster.ui;
import org.testng.annotations.DataProvider;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


public class DataProviders {

    @DataProvider(name= "Search")
    public static Object[][] testSearchFeature(){
        return new Object[][]{
                {"18","80", "Default"},
                {"18","19", "Default"},
                {"30","40", "Default"},
        };
    }


    @DataProvider(name= "RegistrationStep1TestEmailField")
    public static Object[][] testRegistrationEmail(){
        return new Object[][]{
                {Data.fullEmail1, Data.randomString, Data.randomString, Data.randomString, Data.zipCode, true},
                {Data.emailAlreadyRegistered, Data.randomString, Data.randomString, Data.randomString, Data.zipCode, false},
                {Data.fullInvalidEmail, Data.randomString, Data.randomString, Data.randomString, Data.zipCode, false},
                {Data.emptyString, Data.randomString, Data.randomString, Data.randomString, Data.zipCode, false},
        };
    }

    @DataProvider(name= "RegistrationStep1TestPasswordField")
    public static Object[][] testRegistrationPassword(){
        return new Object[][]{
                {Data.fullEmail1, Data.randomString, Data.randomString, Data.randomString, Data.zipCode, true},
                {Data.fullEmail2, Data.emptyString, Data.randomString, Data.randomString, Data.zipCode, false},
                {Data.fullEmail3, Data.invalidString, Data.randomString, Data.randomString, Data.zipCode, false},
        };
    }

    @DataProvider(name= "RegistrationStep2")
    public static Object[][] testRegistration2(){
        return new Object[][]{
                {Data.fullEmail1, Data.randomString, Data.randomString, Data.randomString, Data.zipCode, true},
                {Data.fullEmail2, Data.randomString, Data.emptyString, Data.randomString, Data.zipCode, false},
                {Data.fullEmail3, Data.randomString, Data.randomString, Data.emptyString, Data.zipCode, false},
                {Data.fullEmail4, Data.randomString, Data.randomString, Data.randomString, Data.emptyString, false},
        };
    }

    @DataProvider(name= "RegistrationStep3")
    public static Object[][] testRegistrationStep3(){
        return new Object[][]{
                {Data.fullEmail1, Data.randomString, Data.randomString, Data.randomString, Data.zipCode, true},
                {Data.fullEmail2, Data.randomString, Data.randomString, Data.randomString, Data.emptyString, false},

        };
    }

    @DataProvider(name="RegistrationSMSOptIn")
    public static Object[][] testContactPrefForm(){
        return new Object[][]{
                {Data.fullEmail1, Data.randomString,Data.phoneNumber,true},
                {Data.fullEmail2, Data.randomString, Data.invalidString,true},

        };
    }

    @DataProvider(name="SignInWithInvalidCredentials")
    public static Object[][] testSignInForm(){
        return new Object[][]{
                {Data.emailTooManyAttempts, Data.passwordToManyAttempts, false},
                {Data.fullEmail1, Data.invalidString, false},
                {Data.fullEmail2, Data.fullpassword, false},
                {Data.fullEmail3, Data.emptyString, true},
                {Data.emptyString, Data.randomString, true},
                {Data.emailAlreadyLinkedToGoogleAccount, Data.fullpassword, false},

        };
    }

    @DataProvider(name="SignInWithValidCredentials")
    public static Object[][] testSignInFormValidCred(){
        return new Object[][]{
                {Data.emailValid, Data.passwordValid, true},
                {Data.emailValid, Data.invalidString, false},
                {Data.fullEmail2, Data.fullpassword, false},

        };
    }


    @DataProvider(name="ForgotPasswordForm")
    public static Object[][] testForgotPasswordForm(){
        return new Object[][]{
                {Data.fullEmail1, true},
                {Data.emptyString, false},
                {Data.fullInvalidEmail, false},

        };
    }

    @DataProvider(name="UploadResumeFromComputer")
    public static Object[][] testUploadResumeFromComputer(){
        return new Object[][]{
                {Data.fullEmail1, Data.randomString, Data.validResume, true},
                {Data.fullEmail2, Data.randomString, Data.invalidFormatResume,false},


        };
    }

    @DataProvider(name="SignInWithFacebookEmailAlreadyRegistered")
    public static Object[][] testSignInWithFacebookRegisteredEmail(){
        return new Object[][]{
                {Data.fb_email_already_registered, Data.fb_password_already_registered},

        };
    }
    @DataProvider(name="SignInWithFacebookEmailNotRegistered")
    public static Object[][] testSignInWithFacebook(){
        return new Object[][]{
                {Data.fb_email_not_registered, Data.fb_password_not_registered},

        };
    }

    @DataProvider(name="SignInWithGoogle")
    public static Object[][] testSignInWithGoogle(){
        return new Object[][]{
                {Data.google_email1, Data.google_password},

        };
    }

    @DataProvider (name = "Registration")
    public static Object[][] testRegistration() throws Exception{
        ArrayList<Object[]> out = new ArrayList<> ();
        Files.readAllLines (Paths.get ("Registration.txt")).stream ().forEach (s -> {

            String[] data = s.split (",");
            out.add (new Object[]{data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7]});
        });
        return  out.toArray (new Object[out.size ()][]);
    }

}