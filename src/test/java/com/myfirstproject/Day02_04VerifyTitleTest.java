package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day02_04VerifyTitleTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // implicit wait. wait UP to 30 second  recommended
        driver.manage().window().maximize(); // maximize windows

        // Test case:
//        Create a new class: VerifyTitleTest
//        Navigate to techproeducation homepage
//        Verify if page title is “Techpro Education | Online It Courses & Bootcamps”

        driver.get("https://www.techproeducation.com");
        String actualtitle = driver.getTitle();
        if (actualtitle.equals("Techpro Education | Online It Courses & Bootcamps")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("EXPECTED TITLE : Techpro Education | Online It Courses & Bootcamps");
            System.out.println("ACTUAL TITLE : " + actualtitle);
        }
    }
}
