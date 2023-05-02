package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_02WebDriverManager {
    public static void main(String[] args) {
//         WITHOUT WEBDRIVER MANAGER
//             TESTING ON CHROME
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe"); // chrome setup
//        WebDriver driver = new ChromeDriver();

//            TESTING ON fIREFOX
//         System.setProperty("webdriver.firefox.fdriver", "src/main/resources/drivers/firefoxdriver.exe"); // firefox setup
//        WebDriver firefox = new FirefoxDriver();

//            TESTING ON EDGE
//         System.setProperty("webdriver.ende.driver", "src/main/resources/drivers/edgedriver.exe"); // edge setup
//        WebDriver edge = new EdgeDriver();

//         WITH  WEBDRIVER MANAGER(Setting up and executing the best cases)    (Dependency ekledik bunu kullanmak icin)
        WebDriverManager.chromedriver().setup(); // chrome setup    Alternative way and short
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techproeducation.com");

//        WebDriverManager.firefoxdriver().setup(); // firefox setup
//        WebDriver driver = new FirefoxDriver(); // firefox driver create
//        driver.manage().window().maximize(); // maximize
//        driver.get("https://www.techproeducation.com"); // navigate


    }
}
