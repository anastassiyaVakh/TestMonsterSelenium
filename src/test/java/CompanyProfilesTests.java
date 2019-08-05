import org.testng.Assert;
import org.testng.annotations.Test;

public class CompanyProfilesTests extends BaseUI {
    String currentUrlCompanyProfiles;

    @Test
    public  void testCompanyProfiles (){
        driver.findElement(Locators.LINK_COMPANY_PROFILE).click();
        currentUrlCompanyProfiles = driver.getCurrentUrl();
        System.out.println(currentUrlCompanyProfiles);
        Assert.assertEquals(currentUrlCompanyProfiles, Locators.expectedUrlCompanyProfiles);

    }
}
