package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*
User Story:
When user goes to walmart
Then goes to amazon
Navigate back to walmart
Navigate forward to amazon
Refresh the page
Close/ Quit the browser

Steps:
Create a new class under: Navigations
Create main method
Set path
Create chrome driver
Maximize the window
Open google home page https://www.walmart.com/
On the same class, Navigate to amazon home page https://www.amazon.com
Navigate back to google
Navigate forward to amazon
Refresh the page
Close/ Quit the browser      Selenium does not close the browser automatically
 */

public class Day02_01Navigations {
    public static void main(String[] args) {

 //        1. Set Up
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe"); // bunu her defasinda yapmiycaz
 //        2. Create the driver object
        WebDriver driver = new ChromeDriver();
//       3. Now that we have our driver instance, we can START CREATING OUT TEST SCRIPT
//        Maximize the window
        driver.manage().window().maximize(); //we always maximize our window
//        Open google home page https://www.walmart.com/.
        driver.get("https://www.walmart.com/");   // more common
//        On the same class, Navigate to amazon home page https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        driver.navigate().to("https://www.amazon.com/"); //Alternative way of navigating to a website

//        Navigate back to google
      driver.navigate().back();
//        Navigate forward to amazon
       driver.navigate().forward();
//        Refresh the page
        driver.navigate().refresh();
//        Close/Quit the browser
        // There are 2 ways to close the browser: close() AND quit()  We should NOT use BOTH
//     driver.close();
     driver.quit();

     /*
     ****** What is the difference between get() and navigate() to functions?
     * Similarities: both let you go to a page
     * get is more common than navigate to. it is easy to read
     * get accepts ONLY String as url, navigate to accepts both String and URL
     * navigate has more options such as to(), back(), forward(), refresh()
     *
     * ****** What is the difference between close() and quit()?
     * close() cleses ONLY last active window
     * quit() closes ALL ACTIVE windows
     * recommendation is use quit at the end of the last test case
      */
    }

}

