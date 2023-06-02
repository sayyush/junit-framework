package com.myfirstproject.practices.practice03;


import com.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_ClassWork extends TestBase {

    @Test
    public void test01() throws InterruptedException {
        //htpps://www.facebook.com adresine gidin
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);
        //cookies i kabul edin
        //"create an account " butonuna basin
        driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();
        //   Thread.sleep(3000);

        //"radio buttons" elementlerini locate edin
      //  WebElement female = driver.findElement(By.xpath("//*[@id='u_c_4_8K']"));
        WebElement male = driver.findElement(By.id("u_14_5_Ew"));
        Thread.sleep(3000);
        WebElement custom = driver.findElement(By.xpath("//*[@id='u_c_6_tb']"));
        Thread.sleep(3000);
        //secili degilse cinsiyet butonundan size uygun olanini secin
        if (!male.isSelected()){
            male.click();
        }
        Thread.sleep(3000);
        male.click();
        Thread.sleep(3000);
        custom.click();
    }
}