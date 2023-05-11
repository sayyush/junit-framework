package com.myfirstproject;
import com.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.*;
import static org.junit.Assert.assertEquals;

/*                     IFRAME
Bir web element tag'dir.
• Iframe is used to embed a new map, video, page on a page. It kind of creates a page within a page
• Selenium cannot directly see the elements inside an iframe if there is an iframe on a page.
◦ When there is an iframe, we must first switch() to the iframe.

Iframe, bir web sayfasinin icine yerlestirilmis baska bir web sayfasidir veya HTML dokumaninin icine
yerlestirilmis baska bir HTML dokumanidir.

Iframe genellikle bir web sayfasina dokuman, video veya interaktif media gibi baska bir kaynaktan
icerik eklemek icin kullanilir.
<iframe> tag'i bir inline frame belirtir.

★There are 3 ways to switch to iframe :  by index, id/name, or web element
• driver.switchTo().frame(index of the iframe);//index start from 0
• driver.switchTo().frame(“id or name of the iframe");
• driver.switchTo().frame(WebElement of the iframe);//WebElement using any locators like xpath,..


  Switching back to parent / default frame:
◦ driver.switchTo().parentFrame();       to get back to parent frame.let you go only 1 upper level. 1 ust seviyedeki frame'e cikarir.
◦ driver.switchTo().defaultContent();     to get back to main/most upper page. Let you go multiple upper level . en ust frmae'e cikmak icin.

Developer'lar sayfaya cok fazla video map falan  koymak istemezler, cunku sayfa yavaslar.  Mumkun oldugunda az kullanmaya calisir.

       the element is INSIDE THE IFRAME SO SWITCH THE FRAME FIRST

        NOTE: I have to switch to the frame otherwise I will get no such element exception when
        I try to locate button
        When I switch to the frame I will locate the element and wil not get no such element exception

 */





public class Day06_03Iframe extends TestBase {
//    https://testcenter.techproeducation.com/index.php?page=iframe
//    click on the Back to TechProEducation.com

    @Test
    public void iframeTest() throws InterruptedException {
//        going to the page
        driver.get("https://testcenter.techproeducation.com/index.php?page=iframe");

        //There are 3 ways to switch to iframe : by index, id/class, or webelement
        //driver.switchTo().frame(0);//by index ==> index starts from 0
        // driver.switchTo().frame("id or name attribute");
        WebElement iframeElement = driver.findElement(By.xpath("//iframe[@src='/index.php']"));
        driver.switchTo().frame(iframeElement);//
        Thread.sleep(2000);
//        location the element inside the frame and trying to click
        WebElement techProLink = driver.findElement(By.xpath("//a[@type='button']"));
        Thread.sleep(2000);


//        NOTE: NORMAL CLICK DIDN'T WORK I USED JS EXECUTOR YOU WILL LEARN THIS LATER
//        element.click(); UNFORTUNATELLY DIDN'T WORK

//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("arguments[0].click();", techProLink);
        techProLink.sendKeys(Keys.ENTER);

        //Assert that if h3 element's text equals to "iframe"
        //Driver is still inside iframe. We need to take it back to parent page where h3 element belongs to.
        driver.switchTo().parentFrame();//This will take driver one step back to parent page.
        String h3Text =  driver.findElement(By.xpath("//h3")).getText();
        System.out.println("h3Text = " + h3Text);

        assertEquals("iframe",h3Text);
        System.out.println(driver.findElements(By.xpath("//iframe")).size()); // 1 == number of iframes in this page

    }
}