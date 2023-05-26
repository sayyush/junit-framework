package com.myfirstproject;

import com.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;

public class Day16_02ReusableMethods extends TestBase {

    /*
 When user goes to https://www.automationexercise.com/
 And click on Sing up link
 And enter credentials and click sign up button
 And enter the information
 Then verify the account creating is successful. Account Created! Element is displayed-HOMEWORK
 */

   @Test
   public void registerTest(){

//       When user goes to https://www.automationexercise.com/
    openURL("https://www.automationexercise.com/");

//       And click on Sing up link

      // driver.findElement(By.linkText("Signup / Login")).click(); // This one works but not very good !!
       clickWithTimeOut(waitForClickablility(driver.findElement(By.partialLinkText("Signup / Login")),5),5); // This works

//       And enter credentials and click sign up button



//       And enter the information


//       Then verify the account creating is successful. Account Created! Element is displayed-HOMEWORK





   }

}
