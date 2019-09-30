package com.monster.ui;

import org.openqa.selenium.By;

public class Locators {

    //Main Navigation bar
    public static final By DROPDOWN_FIND_JOBS = By.xpath ("//a[@class='dropdown-toggle'] [text()='Find Jobs ']");
    public static final By DROPDOWN_CAREER_RESOURCES = By.xpath ("//a[@class='dropdown-toggle'][text()='Career Resources ']");
    public static final By TAB_COMPANY_PROFILE = By.xpath ("//a[@href='https://www.monster.com/company/?intcid=skr_navigation_www_company']");
    public static final By DROPDOWN_MOST_POPULAR_JOBS = By.xpath ("//a[@class='dropdown-toggle'][text()='Most Popular Jobs ']");
    public static final By TAB_MOST_POPULAR_JOBS = By.xpath ("//ul[@class='nav navbar-nav hidden-xs subnav-nav clearfix']//ul[@id='most-popular-jobs-id']//li");
    public static final By TAB_SALARY = By.xpath ("//a[@class='navbar-text subnav-link'][text()='Salary']");
    public static final By TAB_ADVANCED_SEARCH = By.xpath ("//ul[@class='dropdown-menu']//a[text()='Advanced Search']");
    public static final By TAB_BROWSE_JOBS = By.xpath ("//ul[@class='dropdown-menu']//a[text()='Browse Jobs']");
    public static final By TAB_CAREER_ADVICE = By.xpath ("//ul[@class='dropdown-menu']//a[text()='Career Advice']");
    public static final By TAB_RESUME_WRITING_SERVICES = By.xpath ("//ul[@class='dropdown-menu']//a[text()='Resume Writing Services']");
    public static final By TAB_UPLOAD_RESUME = By.xpath ("//li[@class='login-hide']//a[text()='Upload Resume']");
    public static final By BUTTON_ACCOUNT_TOP = By.xpath ("//button[@class='navbar-toggle navbar-toggle-account account-trigger action action--open-2 hidden-sm hidden-md hidden-lg']//span[@class='logged-name'][contains(text(),'Account')]  ");
    public static final By BUTTON_POST_JOBS_FIND_TALENTS = By.xpath ("//div[@id='login-btn-employer']//a");

    //Top Navigation bar
    public static final By DROPDOWN_ACCOUNT = By.xpath ("//a[@class='dropdown-toggle navbar-icon-link loginLink2']");
    public static final By BUTTON_LOGIN_TOP_NAV_BAR = By.xpath ("//ul[@class='dropdown-menu']//a[text()='Log In']");
    public static final By BUTTON_SIGN_UP_TOP_NAV_BAR = By.xpath ("//ul[@id='s-menu-d']//a[text()='Sign Up']");

    //Footer
    public static final By FOOTER_BUTTONS = By.xpath ("//ul[@class='col-sm-2 clearfix']//li//a");
    public static final By FOOTER_POPULAR_JOBS_LINKS = By.xpath ("//div[@id='pv_pre_footer']//li//a");

    //Search
    public static final By SEARCH_TAB_JOBS = By.xpath ("//li[@role='presentation']//a[@title='Search for Jobs']");
    public static final By SEARCH_TAB_COMPANIES = By.xpath ("//li[@role='presentation']//a[@title='Search for Companies']");
    public static final By SEARCH_TAB_ADVICE = By.xpath ("//li[@role='presentation']//a[@title='Search Career Advice']");
    public static final By SEARCH_FOR_JOBS_FIELD = By.xpath ("//input[@id='q2']");
    public static final By SEARCH_FOR_COMPANIES_FIELD = By.xpath ("//input[@id='compbn']");
    public static final By SEARCH_FOR_CAREER_ADVICE_FIELD = By.xpath ("//input[@id='q3']");
    public static final By BUTTON_FIND_JOBS = By.xpath ("//button[@id='doQuickSearch2']");
    public static final By BUTTON_SEARCH_FOR_COMPANIES = By.xpath ("//button[@id='doCompanyQuickSearch']");
    public static final By BUTTON_SEARCH_FOR_CAREER_ADVICE = By.xpath ("//button[@id='doAdviceQuickSearch']");

    public static final By LINK_UPLOAD_RESUME = By.xpath ("//a[@href='https://www.monster.com/resumes/post-resume2?landedFrom=Header&intcid=skr_CTAResumeUpload_www_post-resume2']");

    //Main Page
    public static final By IT_JOBS_LINK = By.xpath ("//li//a[@href='https://www.monster.com/jobs/q-it-support-specialist-jobs?intcid=skr_navigation_www_it-jobs']");

    public static final By CAREER_ADVICE_BUTTON = By.xpath ("https://www.monster.com/career-advice/");
   // public static final By ACCOUNT_BUTTON = By.xpath ("//ul//li[@class='dropdown account-dropdown']");
    public static final By BUTTON_LOG_OUT = By.xpath ("//ul[@class='dropdown-menu']//li//a[text()='Log Out']");

    //Log in Page

    public static final By HEADER_SIGN_IN_PAGE = By.xpath ("//h1[text()='Sign In With Monster Account']");
    public static final By HEADER_DONT_HAVE_MONSTER_ACCOUNT = By.xpath ("//h2[@class='new-user-header']");
    public static final By TEXT_FIELD_EMAIL = By.xpath ("//input[@id='EmailAddress']");
    public static final By TEXT_FIELD_PASSWORD = By.xpath ("//input[@id='Password']");
    public static final By CHECKBOX_KEEP_ME_LOGGED_IN = By.cssSelector ("#PersistLogin");
    public static final By BUTTON_LOGIN = By.cssSelector ("#btn-login");
    public static final By BUTTON_SIGN_IN_WITH_FB = By.cssSelector ("#btn-facebook-signup");
    public static final By BUTTON_SIGN_IN_WITH_GOOGLE = By.cssSelector ("#btn-google-signin");
    public static final By LINK_FORGOT_PASSWORD = By.xpath ("//a[@href='https://login20.monster.com/Password/Forgot?r=http%3a%2f%2flogin20.monster.com%2fLogin%2fSignIn%3fch%3dMONS%26intcid%3dskr_navigation_www_signin']");
    public static final By BUTTON_SIGN_UP_SIGN_IN_PAGE = By.cssSelector ("#btn-signup");
    public static final By BUTTON_NEED_HELP = By.xpath (" //a[text()='Need help?']");

    //Log In With Facebook
    public static final By FB_EMAIL_FIELD = By.cssSelector ("#email");
    public static final By FB_PASSWORD_FIELD = By.cssSelector ("#pass");
    public static final By FB_LOGIN_BUTTON = By.cssSelector ("#u_0_0");
    public static final By FB_BUTTON_CONFIRM = By.xpath ("//button[@name='__CONFIRM__']");

    //Log In With Google
    public static final By GOOGLE_EMAIL_FIELD = By.cssSelector ("#identifierId");
    public static final By GOOGLE_PASSWORD_FIELD = By.xpath ("//input[@name='password']");
    public static final By GOOGLE_BUTTON_NEXT_ON_EMAIL_SCREEN = By.cssSelector ("#identifierNext");
    public static final By GOOGLE_BUTTON_NEXT_ON_PASSWORD_SCREEN = By.cssSelector ("#passwordNext");
    public static final By GOOGLE_BUTTON_ALLOW = By.cssSelector ("#submit_approve_access");


    //Forgot Password Page
    public static final By BUTTON_SEND_RESET_INSTRUCTION = By.xpath (" //button[@class='ui-m-btn']");
    public static final By HEADER_RESET_PASSWORD = By.xpath ("//h1[text()='Password Reset']");

    //Sign Up Page
   // public static final By LINK_SIGN_UP = By.xpath ("//a[@href='https://login20.monster.com/Become-Member/Create-Account?landedFrom=Header&ch=MONS&intcid=skr_navigation_www_create-account']");
    public static final By RADIO_BUTTON_YES = By.cssSelector ("#OptiInEmailCarrerRelatedYes");
    public static final By RADIO_BUTTON_NO = By.cssSelector ("#OptiInEmailCarrerRelatedNo");
    public static final By LINK_PRAVACY_POLICY = By.xpath ("//a[@title='privacy policy']");
    public static final By LINK_TERMS_OF_USE = By.xpath ("//a[@title='terms of use']");
    public static final By BUTTON_REGISTER = By.xpath ("//button[@id='btn-register']");
    public static final By TEXT_FIELD_FIRST_NAME = By.cssSelector ("#FirstName");
    public static final By TEXT_FIELD_LAST_NAME = By.cssSelector ("#LastName");
    public static final By DROPDOWN_COUNTRY = By.xpath ("//select[@id='CountryID']");
    public static final By TEXT_FIELD_ZIP_CODE = By.cssSelector ("#UserEnteredZipName");
    public static final By DROPDOWN_CAREER_LEVEL = By.cssSelector ("#CareerLevelID");
    public static final By DROPDOWN_EDUCATION_LEVEL = By.cssSelector ("#EducationLevelID");
    public static final By BUTTON_NEXT = By.cssSelector ("#btn-submit");


    //Sign Up Page Facebook
    public static final By HEADER_CREATE_ACCOUNT = By.xpath ("//h1[text()='Create your Account ']");
    public static final By BUTTON_SIGN_IN_ON_CREATE_ACCOUNT_PAGE = By.xpath ("//a[@role='button'][text()='Sign in']");


    //Sign Up Step 3
    public static final By CHECKBOX_RESUME_IS_SEARCHABLE_BY_EMPLOYERS = By.xpath ("//input[@id='IsSearchable']");
    public static final By CHECKBOX_RESUME_IS_SEARCHABLE_BY_DIVERSITY_EMPLOYERS = By.xpath (" //input[@id='IsDiversitySearchable']");
    public static final By CHECKBOX_RESUME_EVALUATION = By.xpath ("//input[@id='IsResumeCritique']");
    public static final By CHECKBOXES_ON_UPLOAD_RESUME_SCREEN = By.xpath ("//input[@class='checkbox']");
    public static final By DROPDOWN_WORK_AUTHORIZATION = By.xpath ("//select[@id='WorkAuthorizationId']");
    public static final By BUTTON_UPLOAD_RESUME_VIA_GOOGLE = By.xpath ("//button[@id='btn-google-drive']");
    public static final By BUTTON_UPLOAD_RESUME_VIA_DROPBOX = By.xpath ("//button[@id='btn-dropbox']");
    public static final By BUTTON_UPLOAD_RESUME_VIA_ONE_DRIVE = By.xpath ("//button[@id='btn-one-drive']");
    public static final By BUTTON_UPLOAD_RESUME_FROM_COMPUTER = By.xpath ("//button[@id='btnUploadFromMyComputer']");
    public static final By LINK_SKIP_FOR_NOW = By.xpath ("//a[@href='https://www.monster.com/account/homepage'][text()='Skip for now']");

    //Sign Up Step 4
    public static final By BUTTON_ASK_ME_LATER = By.cssSelector ("#skip-cta-link-1");
    public static final By CHECKBOX_SMS_IN = By.xpath ("//div[@class='seeker-ctas card open']//input[@id='IsContactPreferenceOptIn']");
    public static final By FIELD_PHONE_COUNTRY_CODE = By.xpath ("//select[@id='CountryId']");
    public static final By FIELD_PHONE_NUMBER = By.xpath ("//input[@id='MobilePhone']");
    public static final By BUTTON_CONFIRM_CONTACT_PREFERENCE = By.xpath ("//button[@id='btnConfirmContactPreference']");
    public static final By BUTTON_SKIP_CONTACT_PREF_FORM = By.xpath ("//div[@id='seeker-cta-step-4']//a[@id='skip-cta-link-3']");

    //Errors
    public static final By INPUT_ERROR = By.xpath ("//span[@class='input-error']");
    public static final By EMAIL_ERROR = By.cssSelector ("#EmailAddress-error");
    public static final By PASSWORD_ERROR = By.cssSelector ("#Password-error");
    public static final By CONTACT_PREF_ERROR = By.cssSelector ("#settings-error");
    public static final By INVALID_FORMAT_RESUME_ERROR = By.xpath ("//div[@id='fileSizeUploadError']");
    public static final By ERROR_SOMETHING_IS_INCORRECT = By.xpath ("//div[@class='form-group has-error']");

    //Salary

    public static final By PAGE_TITLE_SALARY = By.xpath ("/h1[contains(text(),'What Are You Worth?')]");



    public static final By PAGE_TITLE_COMPANY_PROFILES = By.xpath ("//h1[@class='hero_slogan']");

    public static final By LINK_BROWSE_ALL_COMPANIES = By.cssSelector ("#browseAll");

    //Compnany Profiles



    //Upload Resume
    //public static final By LINK_UPLOAD_RESUME = By.xpath ("//a[@href='https://www.monster.com/resumes/post-resume2?landedFrom=Header&intcid=skr_navigation_www_post-resume2']");
    public static final By UPLOAD_RESUME_INDICATOR = By.xpath ("//div[@id='load-spinner']");

    public static final By UPLOAD_RESUME_LINK = By.xpath ("//input[@id='fuUploadFromMyComputer'][@name='upload']");

}
