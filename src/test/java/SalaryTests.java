import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SalaryTests extends BaseUI {
    String currentUrlSalary;


    @Test
    public  void testSalaryLink (){
        driver.findElement(Locators.LINK_SALARY).click();
        currentUrlSalary = driver.getCurrentUrl();
        System.out.println(currentUrlSalary);
        Assert.assertEquals(currentUrlSalary, Data.expectedUrlSalary);

    }
}
