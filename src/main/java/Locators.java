import org.openqa.selenium.By;

public class Locators {

    //Login Page
    public static final By LINK_LOG_IN = By.xpath("//a[@href='https://login20.monster.com/Login/SignIn?ch=MONS&intcid=skr_navigation_www_signin']");
    public static final By TEXT_FIELD_EMAIL_LOGIN = By.xpath("//input[@id='Password']");
    public static final By TEXT_FIELD_PASSWORD_LOGIN = By.xpath("//input[@id='Password']");
    public static final By BUTTON_LOGIN = By.cssSelector("#btn-login");

    //Sign Up Page
   public static final By LINK_SIGN_UP = By.xpath("//a[@href='https://login20.monster.com/Become-Member/Create-Account?landedFrom=Header&ch=MONS&intcid=skr_navigation_www_create-account']");
    //public static final By TEXT_FIELD_EMAIL_SIGN_UP = By.xpath("//div[@class='form-group has-feedback has-feedback-left has-error']//input[@id='EmailAddress']");
   //Find Jobs
    public static final By DROPDOWN_FIND_JOBS = By.xpath("//ul//a[@class='dropdown-toggle'][contains(text(),'Find Jobs')]//select");

   //Salary
   public static final By LINK_SALARY = By.xpath("//a[@href='https://www.monster.com/salary/?intcid=skr_navigation_www_salary']");
}
