package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


/*
                       These are fixed STEPS
        WebDriverManager.chromedriver().setup(); // setup
        WebDriver driver = new ChromeDriver(); // create chrome driver
        driver.manage().window().maximize(); // maximize windows
 */
public class Day02_03GetPageSource {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup(); // setup
        WebDriver driver = new ChromeDriver(); // create chrome driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // implicit(tam) wait. wait UP to 30 second  recommended
        // implicit wait it is dynamic wait, this is recommended to use right after CREATING THE DRIVER. It means wait, whenever I use driver
        // in tHis class WAIT up to 20 seconds, if needed. If driver does not need to wait driver is gonna continue to execution as a normal
        // fast pace. implicitlyWait will wait make the driver wait for 10 seconds. By default driver waits about 0.4 second less than a second.
        // less than 1 second by default.
        // If it does not open in 20seconds, it will fail.
        // wait and synchronization are very important for UI testing.
        // Timeouts is the interface for managing driver timeouts(zamanasimi).
        // If your testing is slow, then your test case can fail
        // implicitlyWait() Gets the amount of time,the driver should wait when searching for an element if it is not immediately present.
        driver.manage().window().maximize(); // maximize windows



        // Test Case:
  //  Test if amazon contains “Registry” on the homepage

        driver.get("https://www.amazon.com");
        String pageSource = driver.getPageSource(); // RETURNS ENTIRE HTML SOURCE OF THE PAGE
        // getPageSource() returns page source code as a String. We might use this to verify if a certain text exist in the entire page.

        if(pageSource.contains("Registry")){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println(pageSource + "DOESN'T EXIST ON THE PAGE");
        }
        driver.quit();
    }

}
