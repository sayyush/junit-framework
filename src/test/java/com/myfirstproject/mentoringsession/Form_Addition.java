package com.myfirstproject.mentoringsession;

import com.github.javafaker.Faker;
import com.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class Form_Addition extends TestBase {

    @Test
    public void test() throws InterruptedException {
        driver.get("https://phptravels.com/demo/");
        driver.findElement(By.name("first_name")).sendKeys(new Faker().name().firstName());
        driver.findElement(By.name("last_name")).sendKeys(new Faker().name().lastName());
        driver.findElement(By.name("business_name")).sendKeys(new Faker().name().title());
        driver.findElement(By.name("email")).sendKeys(new Faker().internet().emailAddress());

        String num1 = driver.findElement(By.id("numb1")).getText();
        String num2 = driver.findElement(By.id("numb2")).getText();


        int sum = Integer.valueOf(num1) + Integer.valueOf(num2);
        WebElement result = driver.findElement(By.id("number"));
        result.sendKeys(sum + "");
        driver.findElement(By.id("demo")).click();

        Thread.sleep(2000);
        assertTrue(driver.findElement(By.xpath("//h2[.=' Thank you!']")).isDisplayed());
    }
}