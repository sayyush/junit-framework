package com.myfirstproject.mentoringsession;

import com.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class Q04_Calculator extends TestBase {

    // Create chrome driver by using @Before annotation and WebDriverManager
    // Navigate to  https://testpages.herokuapp.com/styled/index.html
    // Click on  Calculator under Micro Apps
    // Type any number in the first input
    // Type any number in the second input
    // Click on Calculate
    // Get the result
    // Verify the result
    // Print the result
    // Close the browser by using @After annotation


    @Test
    public void calculatorTest() {


        // Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        // Click on  Calculator under Micro Apps
        driver.findElement(By.id("calculatetest")).click();

        // Type any number in the first input
        driver.findElement(By.id("number1")).sendKeys("4");

        // Type any number in the second input
        driver.findElement(By.id("number2")).sendKeys("3");

        // Click on Calculate
        driver.findElement(By.id("calculate")).click();

        // Get the result
        String result = driver.findElement(By.id("answer")).getText();

        // Verify the result

        assertEquals("7", result);

        // Print the result
        System.out.println("result :" + result);



    }


}
