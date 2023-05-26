package com.myfirstproject;
import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class Day15_02ReadExcel {

    @Test
    public void readExcelTest() throws IOException {

        // TESTERS only read an Excel file

        String pathOfFile = "resources/Capitals.xlsx";
//        Open the file
        FileInputStream fileInputStream = new FileInputStream(pathOfFile);

//        Open the workbook using fileinputstream
        Workbook workbook = WorkbookFactory.create(fileInputStream);

//        Open the first worksheet
        Sheet sheet1 = workbook.getSheet("Sheet1"); // if all letters are true it is not case-sensitive.

//        Go to first row
        Row row1 = sheet1.getRow(0);//index starts at 0

//        Go to first cell on that first row and print
        Cell cell1 = row1.getCell(0);//index starts at 0
        System.out.println("cell1 = " + cell1);//COUNTRY

//        Go to second cell on that first row and print
        Cell cell2 = sheet1.getRow(0).getCell(1);
        System.out.println("cell2 = " + cell2);//CAPITAL

//        Go to 2nd row first cell and assert if the data equal to USA
        Cell row2cell1 = sheet1.getRow(1).getCell(0);
        System.out.println("row2cell1 = " + row2cell1);//USA
        assertEquals("USA", row2cell1.toString());

//        Go to 3rd row 2nd cell-chain the row and cell
        Cell row3cell2 = sheet1.getRow(2).getCell(1);
        System.out.println("row3cell2 = " + row3cell2);//Paris

//        Find the number of row
        System.out.println("Last Row Number: " + (sheet1.getLastRowNum() + 1));//sheet1.getLastRowNum() method returns last rows index
                                                                              // bu method 3 4 satir bos koyup sonra bir seyler yazsan bile o araliktaki satirlari sayar.
//        Find the number of used row
        System.out.println("Number of used row: " + sheet1.getPhysicalNumberOfRows());//getPhysicalNumberOfRows method counts only used rows
                                                                                      // bu da fiziken dolu satir sayisini veriyor.
//        Print country, capitol key value pairs as map object
        System.out.println("===Homework===");
        Map<String, String> capitals = new HashMap<>();
        int lastRowNumber = sheet1.getLastRowNum();

        for (int i = 1; i <= lastRowNumber; i++) {
            String country = sheet1.getRow(i).getCell(0).toString();
            String capital = sheet1.getRow(i).getCell(1).toString();
            capitals.put(country, capital);
        }

        System.out.println("capitals = " + capitals);

    }

}