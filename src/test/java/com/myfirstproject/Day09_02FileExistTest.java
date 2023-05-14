package com.myfirstproject;

import com.utilities.TestBase;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertTrue;

public class Day09_02FileExistTest  {


    /*
    Pick a file on your desktop
    And verify if that file exist on your computer or not
     */


    /*
                    File Exist
   Selenium ile windows uygulamalarini test edemiyoruz. Ama test etmek icin JAVA kullanabiliriz.
   Bilgisayarimizda bir dosya olup olmadigini(exist) kontrol etmek icin Java'yi kullanabiliriz.

   ?????



     */
    @Test
    public void isExist() {

//        Pick a file on your desktop
        //To make the path dynamic we need to create home directory:
        String userHome = System.getProperty("user.home");
      //  System.out.println(userHome);   // C:\Users\ROG


                                 // "\\Desktop\\flower.jpeg";
        String pathOfFile = userHome+"/Desktop/flower.jpeg";   //MASAUSTUNE kaydedin dosyayi.
        System.out.println("pathOfFile = " + pathOfFile);  // pathOfFile = C:\Users\ROG\Desktop\flower.jpeg

//        And verify if that file exists on your computer or not
        assertTrue(Files.exists(Paths.get(pathOfFile)));


/*

flower dosyasinin path(yolunu) almak icin 1.   shift + resmin ustune sag click ordan "copy as path"
                                          2.  bilgisayar da terminal aciyoruz resmi surukle yapistir oylede path veriyor
 */


}}





