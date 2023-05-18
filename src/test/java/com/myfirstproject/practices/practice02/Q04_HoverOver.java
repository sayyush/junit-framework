package com.myfirstproject.practices.practice02;

import com.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertTrue;

public class Q04_HoverOver extends TestBase {

    /*
Given
   Go to https://www.gmibank.com/
When
   Hover over "Premium" Deposit Package
And
   Click on "Book Now"
Then
   Verify url contains "services"
*/

    @Test
    public void test() throws InterruptedException {
//       Go to https://www.gmibank.com/
        driver.get("https://www.gmibank.com/");

//       Hover over "Premium" Deposit Package    (burda 1 tane is yapiyoruz sadece hover over)
        WebElement premium = driver.findElement(By.xpath("//h4[.='Premium']"));
       new Actions(driver).moveToElement(premium).perform();

       // burda ise multiple yapabiliyoruz actions. ....   bu sekilde.
//       Actions actions new Actions(driver);
//       actions.moveToElement(premium).perform();

       //  Click on "Book Now"
        driver.findElement(By.xpath("(//a[.='Book Now'])[2]")).click();

        //       Verify url contains "services"
        Thread.sleep(3000);
        String url = driver.getCurrentUrl();
        assertTrue(url.contains("services"));

    }
}
