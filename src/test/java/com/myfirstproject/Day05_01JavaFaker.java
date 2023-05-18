package com.myfirstproject;

import com.github.javafaker.Faker;
import org.junit.Test;

public class Day05_01JavaFaker {
    /*

      fake data = mock data : data that is not real
      fake ssn(Social Security number), fake name, fake address
      we can use fake data to test
      we can use fake data test
      we can use java faker class to generate (uretmek olusturmak) fake data.
      ILK once dependency ekliyoruz.


      *** You can use "Java faker" in your company also   ***

      Imagine you are working in bank. Can you do any change on back accounts . You can not use real addresses, names...
      No one let you use REAL data.


    Test Data: Username, password, name, lastname, address, zipcode, ssn, title etc...
    Where do we get these test data?
    From :
    BA - Business Analyst ==> Because he/she writes requirements like acceptance criteria
    Test Lead
    Manual Tester
    Team Lead
    PO - Maintains product backlog
    Developer
    From Database
    From API requests
    AND ==>  Java Faker as mock data

     */

    @Test
    public void javaFaker() {

        //1st Step: Create Faker object
        Faker faker = new Faker();

        //2nd Step: By using faker object generate fake data   1.way
        String firstName = faker.name().firstName();    // method chain  // her defasinda degisik fake isim veriyor.
        System.out.println("firstName = " + firstName);

        //It is also possible to use instance() static method without creating object:    2.way
        String firstName2 = Faker.instance().name().firstName();                      // Buda kolay yolu
        System.out.println("firstName2 = " + firstName2);

        //fullName
        String fullName = faker.name().fullName();
        System.out.println("fullName = " + fullName);

        //username
        System.out.println(faker.name().username());

        //city
        System.out.println(faker.address().city());

        //fullAddress
        System.out.println(faker.address().fullAddress());

        //zipCode
        System.out.println(faker.address().zipCode());

        //timeZone
        System.out.println(faker.address().timeZone());

        //state
        System.out.println(faker.address().state());

        //numberBetween ==> Random number --> First is inclusive, second is exclusive
        System.out.println("faker.number().numberBetween(1,10) = " + faker.number().numberBetween(1, 10));

        //emailAddress
        System.out.println("faker.internet().emailAddress() = " + faker.internet().emailAddress());

        //funnyName
        System.out.println("faker.funnyName().name() = " + faker.funnyName().name());

        //birthday
        System.out.println("faker.date().birthday() = " + faker.date().birthday());

    }

}