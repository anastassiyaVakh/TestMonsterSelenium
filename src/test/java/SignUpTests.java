import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTests extends BaseUI {
    String linkSignUp;

    @Test
    public void testSignUp(){
         mainPage.clickSignUpButton();
         signUpPage.signUpStep1();
         signUpPage.signUpStep2();
         signUpPage.ajaxClick(Locators.LINK_SKIP_FOR_NOW);
        // linkSignUp = driver.getCurrentUrl();
        // System.out.println(linkSignUp);
        // Assert.assertEquals(linkSignUp, Data.expectedUrlSignUp);


       /* System.out.println(linkSignUp);
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }*/

        /*WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_SORT_BY);
        signUpPage.getDropDownListByValue(dropDownListSortBy, "date created");
    }*/

    }
}

