package com.myfirstproject;

import com.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

public class Day08_04Actions4 extends TestBase {
      /*
    Given user is on https://jqueryui.com/droppable/
    And user moves the target element(Drag me to my target) in to destination(Drop here)
    Then verify it is "Dropped!"


    DragAndDrop cok kullanilir .
                .clickAndHold(source)// kaynagi tut
                .moveToElement(target)    <== bu ise az kullanilir. cunku zor
     */

    @Test
    public void dragAndDropTest() throws InterruptedException {   // surukle birak
//        Given user is on https://jqueryui.com/droppable/
        driver.get("https://jqueryui.com/droppable/");

//        And user moves the target element(Drag me to my target) in to destination(Drop here)
        //There is an iframe we need to switch to frame first:driver.switchTo().frame(0);

        driver.switchTo().frame(0);
        WebElement source = driver.findElement(By.id("draggable"));   // kaynak
        WebElement target = driver.findElement(By.id("droppable"));   // hedef

        Thread.sleep(3000);
        //To drag and drop we need to create actions object
        new Actions(driver).dragAndDrop(source, target).perform();

//        Then verify it is "Dropped!"
        assertEquals("Dropped!", target.getText());

    }

    @Test
    public void dragAndDropByTest() {
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement source = driver.findElement(By.id("draggable"));

        Actions actions = new Actions(driver);

        actions.dragAndDropBy(source, 434, 253).perform();
        //With dragAndDropBy() method you can drag elements anywhere you like
    }



    @Test
    public void clickAndHoldTest() {
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        //Drag the source on target but do not drop it
        actions
                .clickAndHold(source)// kaynagi tut
                .moveToElement(target) // hedefe koy
                .build()   // art arda method kullandiginda onlari bir birine baglamak icin kullanilir
                          // yani onceki methodlarin iliskisini kur/guclendir. KULLANILMASI TERCIH EDILIR.
                         // perform() dan once kullanilir.
                 .perform(); // islemi gerceklestir.  KULLANILMASI ZORUNLU.

        //Verify it is not dropped
        assertEquals("Drop here", target.getText());

    }
}