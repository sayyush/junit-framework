package com.myfirstproject.practices.practice02;


import com.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Q06_DeleteAndDragBack extends TestBase {
    /*
     Go to URL : https://www.globalsqa.com/demo-site/draganddrop/
     Delete images by clicking delete buttons
     Recycle images by clicking Recycle buttons
     Delete images by drag and drop
     Recycle images by drag and drop
    */

    @Test
    public void test() throws InterruptedException {
//        Go to URL : https://www.globalsqa.com/demo-site/draganddrop/
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        //Switch to iframe
        WebElement iframe = driver.findElement(By.xpath("//iframe[@data-src='../../demoSite/practice/droppable/photo-manager.html']"));
        //driver.switchTo().frame(iframe);

//        Delete images by clicking delete buttons
        //Locate delete buttons:
        List<WebElement> deleteButtons = driver.findElements(By.xpath("//a[.='Delete image']"));

//        for (WebElement w : deleteButtons) {
//            Thread.sleep(1000);
//            w.click();
//        }

        deleteButtons.forEach(WebElement::click);//Lambda is recommended

//        Recycle images by clicking Recycle buttons
        Thread.sleep(1000);
        List<WebElement> recycleButtons = driver.findElements(By.xpath("//a[.='Recycle image']"));
        recycleButtons.forEach(WebElement::click);

//        Delete images by drag and drop
        Thread.sleep(1000);
        List<WebElement> images = driver.findElements(By.xpath("//ul[@id='gallery']/li"));
        Actions actions = new Actions(driver);
        WebElement trash = driver.findElement(By.id("trash"));

        images.forEach(t -> actions.pause(1000).dragAndDrop(t, trash).perform());

//        Recycle images by drag and drop
        WebElement gallery = driver.findElement(By.id("gallery"));
        images.forEach(t -> actions.pause(500).dragAndDrop(t, gallery).perform());

    }
}