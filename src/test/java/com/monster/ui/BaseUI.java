package com.monster.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;

public class BaseUI {
    WebDriver driver;
    WebDriverWait wait;
    String mainUrl = "https://www.monster.com/";
    MainPage mainPage;
    LoginPage loginPage;
    SalaryPage salaryPage;
    SignUpPage signUpPage;
    UploadResumePage uploadResumePage;
    SoftAssert softAssert = new SoftAssert();



    @BeforeMethod
    @Parameters("browser")
    public void setup (@Optional("chrome") String browser, Method method) throws Exception {

    //Check if parameter passed from TestNG is 'firefox'
    if (browser.equalsIgnoreCase("firefox")) {
        //Create firefox instance
        System.setProperty("webdriver.gecko.driver", "geckodriver");
        driver = new FirefoxDriver();
    }

    // Check if parameter passed 'chrome'
    else if (browser.equalsIgnoreCase("chrome")) {

        //Set path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        //Create chrome instance
        driver = new ChromeDriver();
        driver.get("chrome://settings/clearBrowserData");

    }else if (browser.equalsIgnoreCase("IE")) {

        System.setProperty("webdriver.ie.driver", "IEDriverServer");
        driver = new InternetExplorerDriver();
        driver.manage().deleteAllCookies();

    }else if (browser.equalsIgnoreCase("safari")) {

        System.setProperty("webdriver.safari.driver", "SafariDriverServer");
        driver = new SafariDriver ();
        driver.manage().deleteAllCookies();

    }
    else {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.get("chrome://settings/clearBrowserData");
    }

        wait = new WebDriverWait(driver, 20);
        mainPage = new MainPage(driver, wait);
        loginPage = new LoginPage (driver, wait);
        salaryPage = new SalaryPage (driver, wait);
        signUpPage = new SignUpPage(driver, wait);
        uploadResumePage = new UploadResumePage(driver, wait);
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }

    @AfterMethod
    public void afterActions() {
        driver.quit();
    }


}
