import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadResumeTests extends BaseUI {
    String currentUrlUploadResume;
    String expectedUrlUploadResume = "https://www.monster.com/resumes/post-resume2?landedFrom=Header&intcid=skr_navigation_www_post-resume2";
    By LINK_UPLOAD_RESUME = By.xpath("//a[@href='https://www.monster.com/resumes/post-resume2?landedFrom=Header&intcid=skr_navigation_www_post-resume2']");
    int indexLinkUploadResume =0;

    @Test
    public  void testUploadResume (){
        driver.findElements(LINK_UPLOAD_RESUME).get(indexLinkUploadResume).click();
        currentUrlUploadResume = driver.getCurrentUrl();
        System.out.println(currentUrlUploadResume);
        Assert.assertEquals(currentUrlUploadResume, expectedUrlUploadResume);

    }
}
