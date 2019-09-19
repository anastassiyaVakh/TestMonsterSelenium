package com.monster.ui;

import java.io.File;

public class Data {

    //Home Page data
    public static final String mainUrl = "https://www.monster.com/";
    public static final String expectedUrlSalary = "https://www.monster.com/salary/?intcid=skr_navigation_www_salary";
    public static final String expectedUrlSignUp = "https://login20.monster.com/Become-Member/Create-Account?landedFrom=Header&ch=MONS&intcid=skr_navigation_www_create-account";
    public static final String expectedUrlLogin = "https://login20.monster.com/Login/SignIn?ch=MONS&intcid=skr_navigation_www_signin";
    public static final String expectedUrlCompanyProfiles = "https://www.monster.com/company/?intcid=skr_navigation_www_company";
    public static final String expectedTitleCompanyProfiles = "Explore companies to find the best fit";
    public static final String expectedTitleSalary = "What Are You Worth?";
    public static final String expectedUrlUploadResume = "https://www.monster.com/resumes/post-resume2?landedFrom=Header&intcid=skr_navigation_www_post-resume2";

    //Sign in data
    public static final String emailValid = "testqa17@gmail.com";
    public static final String passwordValid = "Test12345";
    public static final String emailAlreadyLinkedToGoogleAccount = "lekakeeler@gmail.com";
    public static final String emailTooManyAttempts = "Test121314@gmail.com";
    public static final String passwordToManyAttempts = "Tair2013!";


    //Sign Up data
    public static final String randomString = MainPage.generateRandomString ();
    public static final String invalidString = MainPage.generateNewNumber1 (3);
    public static final String emptyString = "";
    public static final String zipCode = "02132";

    // Email
    public static final String emailPart1 = "testEmailQA@gmail.com";
    public static final String fullEmail1 = MainPage.generateNewNumber (emailPart1, Data.lengthEmail);
    public static final String fullEmail2 = MainPage.generateNewNumber (emailPart1,Data.lengthEmail);
    public static final String fullEmail3 = MainPage.generateNewNumber (emailPart1,Data.lengthEmail);
    public static final String fullEmail4 = MainPage.generateNewNumber (emailPart1,Data.lengthEmail);
    public static final String invalidEmailPart1 = "monsterqagmail.com";
    public static final String fullInvalidEmail = MainPage.generateNewNumber (invalidEmailPart1, Data.lengthEmail);
    public static final int lengthEmail = 8;
    public static final String emailAlreadyRegistered = "anavakhitova@gmail.com";

    // Password
    public static final String fullpassword = MainPage.generateNewNumber (randomString, Data.lengthSecondPartOfPassword);
    public static final int lengthSecondPartOfPassword = 1;

    //Facebook
    public static final String fb_email_not_registered = "martaleon9305@gmail.com";
    public static final String fb_password_not_registered = "Winter1!";
    public static final String fb_email_already_registered = "holly@jobrapp.com";
    public static final String fb_password_already_registered = "test1234";

    //Google
    public static final String google_email1 = "lekakeeler@gmail.com";
    public static final String google_password = "Tair2013!";

    //Resume Upload data
    public static final String expectedUrlRegistrationStep4ResumeSkipped = "https://www.monster.com/account/homepage";
    public static final String validResume = "Desktop/Test/Test_Resume.docx";
    public static final String invalidFormatResume = "Desktop/Test/InvalidResume.png";

    //Contact Pref data
    public static final String phoneNumber = MainPage.generateNewNumber1 (10);


}
