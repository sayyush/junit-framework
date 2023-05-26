
package com.myfirstproject;

import com.utilities.LoggerUtils;
import com.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

public class Day08_02Actions1 extends TestBase {
    /*
    Given go to https://testcenter.techproeducation.com/index.php?page=context-menu
    When use right-click on the box
    Then verify the alert message is “You selected a context menu”
    And accept the alert
     */

    @Test
    public void contextClickTest() {
        LoggerUtils.info("Going to the page");
//        Given go to https://testcenter.techproeducation.com/index.php?page=context-menu
        driver.get("https://testcenter.techproeducation.com/index.php?page=context-menu");

//        When use right-click on the box
        LoggerUtils.info("Right clicking the box");
        WebElement box = driver.findElement(By.id("hot-spot"));
        //To right-click on the box we need to use "actions class"

        //Create actions object
        Actions actions = new Actions(driver);

        //Use contextClick() method with web element inside it. And DO NOT forget to use PERFORM() method at the end.
        actions.contextClick(box).perform();

//        Then verify the alert message is “You selected a context menu”
        LoggerUtils.info("Getting alert message");
        String alertMessage = driver.switchTo().alert().getText();
        assertEquals("You selected a context menu", alertMessage);

//        And accept the alert
        driver.switchTo().alert().accept();
        LoggerUtils.info("Test is success!!!");

    }
}




/*

package com.myfirstproject;


import com.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

import static org.junit.Assert.assertEquals;

public class Day08_02Actions1 extends TestBase {

    //Actions Class- Selenium'da bir kutuphane. mouse ve klavye islemleri icin kullanilir.
  // hover over = move over  uzerinde gezdir

    /*
    actions.contextClick(element ismi).perform();   actions()  ve sondaki perform() kismi sabit degismez, sadece
    ortadaki degiskendir. Perform yani emir vermek gibi artik yap diye.
    action objesi kullanilarak baslayan her komut, calismak icin PERFORM() bekler.
     egerde siz unutursaniz onu, kod hata vermez ama islemi gerceklestirmez.

     contextClick() - mouse ile istedigimiz WebElement'e SAG tiklama yapar.
     rightClick diye method yok onun yerine ustteki kullanilir.

     */

    /*
 Given go to https://testcenter.techproeducation.com/index.php?page=context-menu
 When use right-click on the box
 Then verify the alert message is "You selected a context menu"
 And accept the alert
  */
/*
import org.junit.Test;

@Test
public void contextClickTest() {

//        Given go to https://testcenter.techproeducation.com/index.php?page=context-menu
        driver.get("https://testcenter.techproeducation.com/index.php?page=context-menu");

//        When use right-click on the box
        WebElement box = driver.findElement(By.id("hot-spot"));
        // To right - click on the box we need to use "actions class"
        // Create actions object
        Actions actions = new Actions(driver);
        actions.contextClick(box).perform(); // 2 turlu contextClick() methodu var :
        // contextClick(WebElement target)     bu web eleman kabul ediyor ve o elemanin uzerine tiklar.
        // contextClick()  buda kabul etmiyor ve rastgele bir yere tiklar.
        // use contexClick() method with webElement inside it.
        // And DO NOT FORGET to use PERFORM() method at the end.

//        Then verify the alert message is "You selected a context menu"
        String alertMessage = driver.switchTo().alert().getText();
        assertEquals("You selected a context menu", alertMessage);
        // Object olusturmak wait gerekdiren durumlarda makul
        //   Assert.assertEquals("You selected a context menu",driver.switchTo().alert().getText());

//        And accept the alert

        driver.switchTo().alert().accept();

        }
        }


// adimlari yaz   11. video tr      47:33 . dakikada kaldim
 */