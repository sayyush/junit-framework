//package homework;
//
//public class Homework_01 {
//
//    //Task01:
//    /*
//    Go to ebay page
//    Click on electronics section
//    Click on all the images with a Width of 225 and a Length of 225
//    Print the page title of each page
//    Close the page
//     */
//
////Task02:
//    /*
//    Create and Maximize the driver with the BeforeClass method and put implicit wait for 15 seconds
//    Go to http://www.google.com in the before method
//    With 3 different test methods:
//     -Type "Desktop" in the search box and print the number of results
//     -Type "Smartphone" in the search box and print the number of results
//     -Type "Laptop" in the search box and print the number of results
//    NOTE: Print the result numbers in After method
//    Close driver with AfterClass method
//     */
//
////Task03:
//    /*
//    Go to https://amazon.com
//    Print all the options in the 'Departments' dropdown on the left side of the search box
//    Search for each first five options and print titles
//    */
//
//    //Task01:
//    /*
//    Go to ebay page
//    Click on electronics section
//    Click on all the images with a Width of 225 and a Length of 225
//    Print the page title of each page
//    Close the page
//     */
//
//package com.myfirstproject.assignment;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.edge.EdgeDriver;
//
//import java.time.Duration;
//import java.util.List;
//
//    public class Task01_eBay_WidthLength {
//
//        /*
//        Go to ebay page
//        Click on electronics section
//        Click on all the images with a Width of 225 and a Length of 225
//        Print the page title of each page
//        Close the page
//         */
//        static WebDriver driver;
//        static List<WebElement> products;
//
//        @BeforeClass
//        public static void setUp() throws Exception {
//            WebDriverManager.edgedriver().setup();
//            driver = new EdgeDriver();
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        }
//
//        @Test
//        public void test01() throws InterruptedException {
//            //Go to ebay page
//            driver.get("https://ebay.com");
//
//            //Click on electronics section
//            driver.findElement(By.xpath("(//*[text()='Electronics'])[2]")).click();
//
//            //Click on all the images with a Width of 225 and a Length of 225
//            //Print the page title of each page
//            products = driver.findElements(By.xpath("//*[@width='225' and @height='225']"));
//            for (int i = 0; i < products.size(); i++) {
//                products = driver.findElements(By.xpath("//*[@width='225' and @height='225']"));
//                products.get(i).click();
//                Thread.sleep(2000);
//                System.out.println(i + 1 + ". title: " + driver.getTitle());
//                Thread.sleep(2000);
//                driver.navigate().back();
//                Thread.sleep(2000);
//            }
//
//        }
//
//        @AfterClass
//        public static void afterClass() {
//            driver.close();
//        }
//    }
//
//********************************************************
//
//
////Task02:
//    /*
//    Create and Maximize the driver with the BeforeClass method and put implicit wait for 15 seconds
//    Go to http://www.google.com in the before method
//    With 3 different test methods:
//     -Type "Desktop" in the search box and print the number of results
//     -Type "Smartphone" in the search box and print the number of results
//     -Type "Laptop" in the search box and print the number of results
//    NOTE: Print the result numbers in After method
//    Close driver with AfterClass method
//     */
//
//
//        package com.myfirstproject.assignment;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//import java.time.Duration;
//
//    public class Task02_GoogleSearchResult {
//    /*
//    Create and Maximize the driver with the BeforeClass method and put implicit wait for 15 seconds
//    Go to http://www.google.com in the before method
//    With 3 different test methods:
//     -Type "Desktop" in the search box and print the number of results
//     -Type "Smartphone" in the search box and print the number of results
//     -Type "Laptop" in the search box and print the number of results
//    NOTE: Print the result numbers in After method
//    Close driver with AfterClass method
//     */
//
//        static WebDriver driver;
//        WebElement searchBox;
//
//        @BeforeClass
//        public static void beforeClass() {
//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        }
//
//        @Before
//        public void setUp() {
//            driver.get("http://www.google.com");
//        }
//
//        @Test
//        public void test01() {
//            searchBox = driver.findElement(By.xpath("//*[@class='gLFyf']"));
//            searchBox.sendKeys("Desktop", Keys.ENTER);
//        }
//
//        @Test
//        public void test02() {
//            searchBox = driver.findElement(By.xpath("//*[@class='gLFyf']"));
//            searchBox.sendKeys("Smartphone", Keys.ENTER);
//        }
//
//        @Test
//        public void test03() {
//            searchBox = driver.findElement(By.xpath("//*[@class='gLFyf']"));
//            searchBox.sendKeys("Laptop", Keys.ENTER);
//        }
//
//        @After
//        public void tearDown() {
//            String [] result = driver.findElement(By.xpath("//*[@id='result-stats']")).getText().split(" ");
//            System.out.println("Number of search result = "+result[1]);
//        }
//
//        @AfterClass
//        public static void afterClass() {
//            driver.close();
//        }
//
//    }
//
//********************************************************
//
//
////Task03:
//    /*
//    Go to https://amazon.com
//    Print all the options in the 'Departments' dropdown on the left side of the search box
//    Search for each first five options and print titles
//    */
//
//        package com.myfirstproject.assignment;
//
//import com.myfirstproject.utilities.TestBase;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//
//    public class Task03_AmazonDropDown extends TestBase {
//    /*
//    Go to https://amazon.com
//    Print all the options in the 'Departments' dropdown on the left side of the search box
//    Search for each first five options and print titles
//     */
//
//        @Test
//        public void test01() throws InterruptedException {
//            //Go to https://amazon.com
//            driver.get("https://amazon.com");
//
//            //Print all the options in the 'Departments' dropdown on the left side of the search box
//            Select select = new Select(driver.findElement(By.xpath("//*[@id='searchDropdownBox']")));
//            for (WebElement w:select.getOptions()) {
//                System.out.println(w.getText());
//            }
//            System.out.println("***********************************************");
//
//
//            //Search for each first five options and print titles
//            int index=1;
//            for (WebElement w:select.getOptions()) {
//                Select option = new Select(driver.findElement(By.xpath("//*[@id='searchDropdownBox']")));
//                option.selectByIndex(index);
//                driver.findElement(By.xpath("//*[@type='submit']")).click();
//                System.out.println(driver.getTitle());
//                Thread.sleep(2000);
//                driver.navigate().back();
//                Thread.sleep(2000);
//                index++;
//                if (index==6){
//                    break;
//                }
//            }
//        }
//
//
//    }
//
//
//
//
//
//
//}
