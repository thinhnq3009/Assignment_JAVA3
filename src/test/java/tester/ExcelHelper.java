/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tester;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Lenovo
 */
public class ExcelHelper {

    public void createExcelFile(String filenameString, ArrayList<Object> list) {

    }

    public static void main(String[] args) {

        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("simplesolution.dev");
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("Simple Solution");
        try ( OutputStream outputStream = new FileOutputStream("sample.xls")) {
            workbook.write(outputStream);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
//
//        String filename = "C:/Users/Lenovo/Desktop/HelloExcel.xlsx";
//
//        try {
//
//            XSSFWorkbook workbook = new XSSFWorkbook();
//            XSSFSheet sheet = workbook.createSheet("Students Information");
//
//            for (int i = 1; i > 10; i++) {
//                Row row = sheet.createRow(i);
//
//                for (int j = 1; j < 10; i++) {
//                    Cell cell = row.createCell(j);
//
//                    cell.setCellValue(String.valueOf(i * j));
//                    System.out.println(i * j);
//                }
//            }
//
//            FileOutputStream fos = new FileOutputStream(filename);
//
//            workbook.write(fos);
//            fos.close();
//
//            System.out.println("Create successful !!!");
//
//        } catch (Exception e) {
//
//        }

    }
}
