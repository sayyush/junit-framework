package com.myfirstproject;

import com.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Day08_03Actions3 extends TestBase {
     /*
    Given user is on the https://www.amazon.com/
    Scroll the page down
    Scroll the page up


    yukariya 2 sekilde cikabiliriz:
     PAGE_UP
    ARROW_UP


    asagiya 2 sekilde inebilriz:
    PAGE_DOWN  daha fazla mesafe aldirir
    ARROW_DOWN  bi tik az mesafe aldirir.


     */

    @Test
    public void scrollTest() throws InterruptedException {

//        Given user is on the https://www.amazon.com/
     //   driver.get("https://www.amazon.com/");
        driver.get("https://www.walmart.com/");

//        Scroll the page down
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();   // bi tik asagiya iniyor
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Thread.sleep(3000);
        //We can use method chain as well    // method chain'de wait koyamiyoruz.
        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                build().//build() method is recommended to use in method chain. NOT mandatory.
                perform();


//        Scroll the page up
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_UP).perform();

        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_UP).
                sendKeys(Keys.PAGE_UP).
                sendKeys(Keys.PAGE_UP).
                build().//build() method is recommended to use in method chain. NOT mandatory.
                perform();

        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_DOWN).perform();//ARROW_DOWN scrolls a little bit   PAGE_DOWN'a gore daha az mesafe aldirir

        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_UP).perform();//ARROW_UP scrolls a little bit

    }
}