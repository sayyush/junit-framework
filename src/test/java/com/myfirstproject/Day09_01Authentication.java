package com.myfirstproject;

import com.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;


/*

Authentication Nedir? (verification)
Herhangi bir internet kullanicisinin, uygulamanin ya da programin,
soz konusu sisteme dahil olup olamayacagini belirleyen dogrulama sistemini ifade eder.
Uygulama ana sayfalarindaki kullanici adi ve password istemek de bir authentication'dir.

Bu authentication'i yapabilmek icin uygulamanin kullanicilara authentication'i
nasil yapacagina dair bilgilendirme yapmis olmasi gerekir.

The syntax to handle basic authentication : https://username:password@URL

 */


/*
   Go to http://the-internet.herokuapp.com/basic_auth
   Login with:
       username: admin
       password: admin
   Assert if login is success
    */
public class Day09_01Authentication  extends TestBase {

    @Test
    public void basicAuthenticationTest() {
//        Go to http://the-internet.herokuapp.com/basic_auth
//        Login with:
//        username: admin
//        password: admin
    //The syntax to handle basic authentication : https://username:password@URL
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

    //        Assert if login is success
    String loginText = driver.findElement(By.xpath("//p")).getText();
    assertTrue(loginText.contains("Congratulations"));



}}





