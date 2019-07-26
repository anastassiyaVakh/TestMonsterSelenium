import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class MainTests extends BaseUI {




    @Test
    public void testMainPage(){
        driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Find Jobs')]")).click();
        driver.findElement(By.xpath("//li[@id='sub-nav-1']//a[text()='Browse Jobs']")).click();

//why this is not working?
    }


}



