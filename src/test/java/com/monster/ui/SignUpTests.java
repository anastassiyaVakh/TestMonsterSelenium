package com.monster.ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class SignUpTests extends BaseUI {
    String linkSignUp;


    @DataProvider(name = "Registration")
    public static Object[][] testRegistration() throws Exception{
        ArrayList<Object[]> out = new ArrayList<> ();
        Files.readAllLines (Paths.get ("com.monster.ui.RegistrationData.txt")).stream ().forEach (s -> {

            String[] data = s.split (",");
            out.add (new Object[]{data[0], data[1], data[2], data[3]});
        });
        return  out.toArray (new Object[out.size ()][]);
    }

    @Test(dataProvider = "Registration")
    public void testSignUp(String email, String password, String firstname, String lastname){
         mainPage.clickSignUpButton();
         signUpPage.signUpStep1(email, password);
         signUpPage.signUpStep2(firstname,lastname);
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

