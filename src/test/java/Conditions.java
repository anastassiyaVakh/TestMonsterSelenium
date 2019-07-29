import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conditions extends BaseUI {
    @Test
    public void test() {
        String fruit1 = "apple";
        String fruit2 = "orange";

        if (fruit1.contains("apple") && fruit2.contains("kiwi")) {
            System.out.println("we cand find this fruit 1");
        } else {
            Assert.fail("we cannot find it");
        }
    }

    @Test
    public void test2() {
        int number = 10;
        int sum;

        if (number==15 +5){
            sum =95+100;
        } else {
            sum= 100-95;
        }
        System.out.println(sum);

    }

    @Test
    public void test4(){
        boolean requirement = true;

        if(!requirement){
            System.out.println("Boolean is true");
        }else {
            Assert.fail("Boolean is false");
        }

    }

    @Test
    public void test5(){
        WebElement tabSearch = driver.findElement(Locators.FIND_JOBS_BUTTON);

        if(tabSearch.isDisplayed()){
            tabSearch.click();
        }else {
            Assert.fail("We can't find this button");
        }
    }


    @Test
    public void test6(){
        mainPage.clickLogInButton();
        signUpPage.completeSignUp();

        WebElement checkbox = driver.findElement(Locators.RADIO_BUTTON_YES);

        if(!checkbox.isSelected()){
            checkbox.click();
        }

    }

    @Test
    public void test7 (){
        List<String> crunchifyList1 = new ArrayList(Arrays.asList("kiwi","orange","melon"));
        String element = crunchifyList1.get(0);
        if (crunchifyList1.contains("orange")){
            System.out.println(crunchifyList1);
        }

    }


    @Test
    public void test8 (){
        List<Integer> crunchifyList2 = new ArrayList(Arrays.asList(5,7,4));
        int sum = crunchifyList2.get(1) + crunchifyList2.get(2);
        System.out.println(sum);
        }


     /*   @Test
      public void test9(){
        List<WebElement> links = driver.findElements(By.xpath(("//ul//li")));
        System.out.println(links.size());
        for (int i=0; i <links.size(); i++){
            String info = links.get((i)).getText();
            System.out.println(info);

            links.get(i).click();
            driver.get(Data.MAIN_URL);
            links = driver.findElements(By.xpath("//ul/li"));

        }
    }*/




    }


