import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompanyProfilesTests extends BaseUI {
    String currentUrlCompanyProfiles;
    String expectedUrlCompanyProfiles= "https://www.monster.com/company/?intcid=skr_navigation_www_company";
    By LINK_COMPANY_PROFILE = By.xpath("//a[@href='https://www.monster.com/company/?intcid=skr_navigation_www_company']");

    @Test
    public  void testCompanyProfiles (){
        driver.findElement(LINK_COMPANY_PROFILE).click();
        currentUrlCompanyProfiles = driver.getCurrentUrl();
        System.out.println(currentUrlCompanyProfiles);
        Assert.assertEquals(currentUrlCompanyProfiles, expectedUrlCompanyProfiles);

    }
}
