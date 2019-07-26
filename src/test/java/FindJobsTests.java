import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FindJobsTests extends BaseUI {

    public void getDropDownListByIndex(WebElement element, int index){

        Select select = new Select(element);
        select.selectByIndex(index);
    }

    @Test
    public void testFindJobs (){

        WebElement dropDownListFindJobs = driver.findElement(Locators.DROPDOWN_FIND_JOBS);
        getDropDownListByIndex(dropDownListFindJobs, 1);

    }
}
