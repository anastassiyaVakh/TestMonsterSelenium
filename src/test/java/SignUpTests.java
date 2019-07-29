import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTests extends BaseUI {

    @Test
    public void testSignUp(){
         mainPage.clickSignUpButton();
         signUpPage.completeSignUp();

         WebElement radioButtonConfirmation = driver.findElement(Locators.RADIO_BUTTON_YES);
         if (driver.findElement(Locators.RADIO_BUTTON_YES).isSelected()){
             radioButtonConfirmation.click();
         }else{
             Assert.fail("Radio button is already selected");
         }
       // linkSignUp = driver.getCurrentUrl();
        //System.out.println(currentUrlSignUp);
       // Assert.assertEquals(currentUrlSignUp, Data.expectedUrlSignUp);


       /* System.out.println(linkSignUp);
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }*/

        /*WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_SORT_BY);
        signUpPage.getDropDownListByValue(dropDownListSortBy, "date created");
    }*/

   /* @Test
    public void testRadioButtons () {
        if (!driver.findElement(By.xpath("//div[@class='radio']//input[@id='OptiInEmailCarrerRelated']")).isSelected()) {
            driver.findElement(By.xpath("//div[@class='radio']//input[@id='OptiInEmailCarrerRelated']")).click();
        } else {
            System.out.println("This radio…");
        }*/


        //driver.findElement(Locators.TEXT_FIELD_PASSWORD_LOGIN).sendKeys(generateNewNumber((Data.nickname, 10)));
        //driver.findElement(By.cssSelector("#daySelect")).click();
        //driver.fintElement(By.xpath("//li[@data-handler='SelectDay'][//a[text()'='2']")).click();

    }}

