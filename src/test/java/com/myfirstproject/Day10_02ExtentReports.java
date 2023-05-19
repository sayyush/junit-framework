package com.myfirstproject;

import com.utilities.TestBase;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.io.IOException;

public class Day10_02ExtentReports extends TestBase {

    /*
    We need to familiar with names of Extent reports.  RAPORLAMA bir testerin en onemli yapmasi gereken seylerden biri.
        What is "Extent Report" ?
It is used to generate CUSTOM HTML REPORTS.
We can add company or porject specific information in the report configuration.
Extent reports CUSTOM HTML REPORTlari olusturmak icin kullanilir.
Bu raporlara ozel proje veya sirket bilgisi, takim bilgisi , QA bilgisi eklenebilir.

3 onemli class:
               protected static ExtentReports extentReports;
               protected static ExtentTest extentTest;
               protected static ExtentHtmlReporter extentHtmlReporter;

Raporlamada olmasi gereken seyler :
Tarih,
Raporun basligi
Raporun kendi ismi
test adimlari

Extent Reports bu Seleniumun bir parcasi degil, o yuzden biz dependencies ekliyoruz.
Bu Junit'te testNG de cucumber da kullanilir.

https://mvnrepository.com/artifact/com.aventstack/extentreports   dependency

     */


    @Test
    public void extentReportsTest() throws IOException, InterruptedException {

        //        Given user is on https://testcenter.techproeducation.com/index.php?page=autocomplete
        driver.get("https://testcenter.techproeducation.com/index.php?page=autocomplete");
//        When user type “uni” in the search box
        extentTest.pass("Taking the screenshot of the home page");
        //TAKE SCREENSHOT
        takeScreenshotOfTheEntirePage();
        driver.findElement(By.id("myCountry")).sendKeys("uni");
        Thread.sleep(2000);
//        And select the ‘United Kingdom’ from the suggestions
        //TAKE SCREENSHOT
        extentTest.pass("Selecting the United Kingdom option");
        takeScreenshotOfTheEntirePage();
//        TAKING SCREENSHOT OF ONLY UNITED KINGDOM ELEMENT
        takeScreenshotOfThisElement(driver.findElement(By.xpath("//div[@id='myCountryautocomplete-list']//*[.='United Kingdom']")));
        driver
                .findElement(By.xpath("//div[@id='myCountryautocomplete-list']//*[.='United Kingdom']"))
                .click();
        Thread.sleep(2000);
//        And click on submit button
        //TAKE SCREENSHOT
        takeScreenshotOfTheEntirePage();
        extentTest.pass("Clinking on the Submit Button");
        driver.findElement(By.xpath("//input[@type='button']")).click();
        Thread.sleep(2000);
        //TAKE SCREENSHOT
//        Then verify the result contains ‘United Kingdom’
        takeScreenshotOfTheEntirePage();
//        TAKING THE SCREENSHOT OF THE RESULT ELEMENT
        extentTest.pass("Taking the screenshot of result element");
        WebElement result = driver.findElement(By.id("result"));
        takeScreenshotOfThisElement(result);
        extentTest.pass("Asserting the result contains United Kingdom");
        Assert.assertTrue(driver.findElement(By.id("result")).getText().contains("United Kingdom"));




    }

}
