import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseUI {
    WebDriver driver;
    String mainUrl = "https://www.monster.com/";



    @BeforeMethod
    public void setUp(){

        System.setProperty ("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }

    @AfterMethod
    public void afterActions() {
        driver.quit();
    }

    //public static String generateNewNumber (String name, int length){

       // return name + RandomStringUtils.random(length, "125466");
   // }
}
