package com.monster.ui;

import org.openqa.selenium.By;

public class Locators {

    //Main Page
    public static final By FIND_JOBS_BUTTON = By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Find Jobs')]");
    public static final By BROWSE_JOBS_LINK = By.xpath("//li//a[@href='https://www.monster.com/jobs/?intcid=skr_navigation_www_jobs']");
    public static final By ADVANCED_SEARCH_LINK = By.xpath("//li//a[@href='https://www.monster.com/jobs/advanced-search?intcid=skr_navigation_www_advanced-search']");
    public static final By MOST_POPULAR_JOBS_BUTTON = By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Most Popular Jobs')]");
    public static final By IT_JOBS_LINK = By.xpath("//li//a[@href='https://www.monster.com/jobs/q-it-support-specialist-jobs?intcid=skr_navigation_www_it-jobs']");
    public static final By CAREER_RESOURCES_BUTTON = By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Career Resources')]");
    public static final By CAREER_ADVICE_BUTTON = By.xpath("https://www.monster.com/career-advice/");

    //Login Page
    public static final By ACCOUNT_BUTTON = By.xpath("//ul//span[@class='logged-name']");
    public static final By LINK_LOG_IN = By.xpath("//a[@href='https://login20.monster.com/Login/SignIn?ch=MONS&intcid=skr_navigation_www_signin']");
    public static final By TEXT_FIELD_EMAIL_LOGIN = By.xpath("//input[@id='EmailAddress']");
    public static final By TEXT_FIELD_PASSWORD_LOGIN = By.xpath("//input[@id='Password']");
    public static final By CHECKBOX_KEEP_ME_LOGGED_IN = By.cssSelector("#PersistLogin");
    public static final By BUTTON_LOGIN = By.cssSelector("#btn-login");
    public static final By BUTTON_SIGN_IN_WITH_FB = By.cssSelector("#btn-facebook-signup");
    public static final By BUTTON_SIGN_IN_WITH_GOOGLE = By.cssSelector(" #btn-google-signin");
    public static final By LINK_FORGOT_PASSWORD = By.xpath("//a[@href='https://login20.monster.com/Password/Forgot?r=http%3a%2f%2flogin20.monster.com%2fLogin%2fSignIn%3fch%3dMONS%26intcid%3dskr_navigation_www_signin']");

    //Forgot Password Page
    public static final By BUTTON_SEND_RESET_INSTRUCTION = By.xpath(" //button[@class='ui-m-btn']");

    //Sign Up Page
   public static final By LINK_SIGN_UP = By.xpath("//a[@href='https://login20.monster.com/Become-Member/Create-Account?landedFrom=Header&ch=MONS&intcid=skr_navigation_www_create-account']");
   public static final By TEXT_FIELD_EMAIL_SIGN_UP = By.xpath("//input[@id='EmailAddress']");
   public static final By TEXT_FIELD_PASSWORD_SIGN_UP = By.xpath("//input[@id='Password']");
   public static final By RADIO_BUTTON_YES = By.cssSelector("#OptiInEmailCarrerRelatedYes");
   public static final By RADIO_BUTTON_NO = By.cssSelector("#OptiInEmailCarrerRelatedNo");
   public static final By BUTTON_REGISTER = By.cssSelector("#btn-register");
   public static final By TEXT_FIELD_FIRST_NAME = By.cssSelector("#FirstName");
   public static final By TEXT_FIELD_LAST_NAME = By.cssSelector("#LastName");
   public static final By DROPDOWN_COUNTRY = By.xpath("//select[@id='CountryID']");
   public static final By TEXT_FIELD_ZIP_CODE = By.xpath("//input[@id='UserEnteredZipName']");
   public static final By DROPDOWN_CAREER_LEVEL = By.xpath("//select[@id='CountryID']");
   public static final By DROPDOWN_EDUCATION_LEVEL = By.xpath("//select[@id='EducationLevelID']");
   public static final By BUTTON_NEXT = By.cssSelector("#btn-submit");
   public static final By CHECKBOX_IS_SEARCHABLE = By.xpath("//input[@id='IsSearchable']");
   public static final By DROPDOWN_WORK_AUTHORIZATION = By.xpath("//select[@id='WorkAuthorizationId']");
   public static final By LINK_SKIP_FOR_NOW = By.xpath("//a[@class='skip']");

   //Salary
   public static final By LINK_SALARY = By.xpath("//a[@href='https://www.monster.com/salary/?intcid=skr_navigation_www_salary']");


   public static final By MAIN_NAVIGATION_MENU = By.xpath("//ul[@class='nav navbar-nav hidden-xs subnav-nav clearfix']");
   public static final By PAGE_TITLE_COMPANY_PROFILES = By.xpath("//h1[@class='hero_slogan']");
   public static final By PAGE_TITLE_SALARY = By.xpath ("/h1[contains(text(),'What Are You Worth?')]");
   public static final By LINK_BROWSE_ALL_COMPANIES = By.cssSelector("#browseAll");

   //Compnany Profiles
   public static final By LINK_COMPANY_PROFILE = By.xpath("//a[@href='https://www.monster.com/company/?intcid=skr_navigation_www_company']");
   public static final String expectedUrlCompanyProfiles= "https://www.monster.com/company/?intcid=skr_navigation_www_company";

    //Upload Resume
   public static final By LINK_UPLOAD_RESUME = By.xpath("//a[@href='https://www.monster.com/resumes/post-resume2?landedFrom=Header&intcid=skr_navigation_www_post-resume2']");
}
