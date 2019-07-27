import org.openqa.selenium.By;

public class Locators {

    //Main Page
    public static final By FIND_JOBS_BUTTON = By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Find Jobs')]");
    public static final By BROWSE_JOBS_LINK = By.xpath("//li//a[@href='https://www.monster.com/jobs/?intcid=skr_navigation_www_jobs']");
    public static final By ADVANCED_SEARCH_LINK = By.xpath("//li//a[@href='https://www.monster.com/jobs/advanced-search?intcid=skr_navigation_www_advanced-search']");
    public static final By MOST_POPULAR_JOBS_BUTTON = By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Most Popular Jobs')]");

    //Login Page
    public static final By LINK_LOG_IN = By.xpath("//a[@href='https://login20.monster.com/Login/SignIn?ch=MONS&intcid=skr_navigation_www_signin']");
    public static final By TEXT_FIELD_EMAIL_LOGIN = By.xpath("//input[@id='Password']");
    public static final By TEXT_FIELD_PASSWORD_LOGIN = By.xpath("//input[@id='Password']");
    public static final By BUTTON_LOGIN = By.cssSelector("#btn-login");

    //Sign Up Page
   public static final By LINK_SIGN_UP = By.xpath("//a[@href='https://login20.monster.com/Become-Member/Create-Account?landedFrom=Header&ch=MONS&intcid=skr_navigation_www_create-account']");
    //public static final By TEXT_FIELD_EMAIL_SIGN_UP = By.xpath("//div[@class='form-group has-feedback has-feedback-left has-error']//input[@id='EmailAddress']");


   //Salary
   public static final By LINK_SALARY = By.xpath("//a[@href='https://www.monster.com/salary/?intcid=skr_navigation_www_salary']");
}
