/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asm.app.helpers;

import com.asm.app.model.Score;
import com.asm.app.model.Students;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Lenovo
 */
public class ExcelHelper {

    XSSFWorkbook workbook;
    XSSFSheet firstSheet;
    private int rowCount;

    public ExcelHelper() {
        this.workbook = new XSSFWorkbook();
        this.firstSheet = workbook.createSheet();
    }

    public ExcelHelper(String name) {
        this.workbook = new XSSFWorkbook();
        this.firstSheet = workbook.createSheet(name);
    }

    public XSSFColor getColor(int r, int g, int b) {
        return new XSSFColor(new byte[]{(byte) r, (byte) g, (byte) b});
    }

    public XSSFFont createFont(String nameFont, int size) {
        XSSFFont font = workbook.createFont();
        font.setFontName("Arial");
        font.setFontHeightInPoints((short) size);
        return font;
    }

    public XSSFSheet createSheet(String namesheet) {
        namesheet = namesheet == null ? "Sheet" : namesheet;
        return workbook.createSheet();
    }

//    public XSSFCellStyle createCellStyle() {
//        return workbook.createCellStyle();
//    }
    public XSSFCellStyle createCellStyleTitle() {

        XSSFCellStyle style = workbook.createCellStyle();

        // Fill background
        style.setAlignment(HorizontalAlignment.CENTER_SELECTION);
        XSSFFont font = workbook.createFont();
        font.setFontName("Calibri");
        font.setFontHeightInPoints((short) 26);
        font.setBold(true);
        font.setColor(getColor(68, 84, 106));
        style.setFont(font);

        return style;
    }

    public XSSFCellStyle createCellStyleHeader() {

        XSSFCellStyle style = workbook.createCellStyle();

        // Fill background
        style.setAlignment(HorizontalAlignment.LEFT);
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        style.setFillForegroundColor(getColor(255, 217, 102));

        // Set font
        XSSFFont font = createFont("Calibri", 16);
        font.setColor(getColor(48, 84, 154));
        style.setFont(font);

        return style;

    }

    public XSSFCellStyle createCellStyleNommalEven() {

        XSSFCellStyle style = workbook.createCellStyle();

        // Fill background
        style.setAlignment(HorizontalAlignment.LEFT);
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        style.setFillForegroundColor(getColor(255, 242, 204));

        // Set font
        XSSFFont font = createFont("Calibri", 12);
        font.setColor(getColor(0, 0, 0));
        style.setFont(font);

        return style;
    }

    public XSSFCellStyle createCellStyleNommalOdd() {

        XSSFCellStyle style = workbook.createCellStyle();

        // Fill background
        style.setAlignment(HorizontalAlignment.LEFT);
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        style.setFillForegroundColor(getColor(255, 255, 255));

        // Set font
        XSSFFont font = createFont("Calibri", 12);
        font.setColor(getColor(0, 0, 0));
        style.setFont(font);

        return style;
    }

    public void autoWidth(XSSFSheet sheet, int a, int b) {
        sheet = sheet == null ? this.firstSheet : sheet;
        for (int i = a; i <= b; i++) {
            sheet.autoSizeColumn(i);
        }

    }

    public void insertData(XSSFSheet sheet, int startRow, int startColumn, Object[][] data, XSSFCellStyle style) {

        for (Object[] items : data) {

            insertRow(sheet, startRow++, startColumn, items, style);
        }

    }

    public void insertRow(XSSFSheet sheet, int startRow, int startColumn, Object[] data, XSSFCellStyle style) {

        sheet = sheet == null ? this.firstSheet : sheet;

        XSSFRow row = sheet.createRow(startRow);

        for (Object o : data) {
            XSSFCell cell = row.createCell(startColumn++);
            cell.setCellStyle(style);
            if (o instanceof String string) {
                cell.setCellValue(string);
            } else {
                cell.setCellValue((double) o);
            }
        }
    }

    public void setStyle(XSSFSheet sheet, int row, int column, XSSFCellStyle style) {
        sheet = sheet == null ? this.firstSheet : sheet;
        sheet.getRow(row).getCell(column).setCellStyle(style);
    }

    public void setStyles(XSSFSheet sheet, int startRow, int startCol, int endRow, int endCol, XSSFCellStyle style) {
        if (startCol > endCol
                || startRow > endRow) {
            return;
        } else {
            for (int i = startRow; i <= endRow; i++) {
                for (int j = startCol; j <= endCol; j++) {
                    try {
                        setStyle(sheet, i, j, style);
                    } catch (Exception e) {

                    }
                }
            }
        }
    }

    public void createFile(String path, String title, String[] header, Object[][] datas) {

        int l = header.length - 1;

        try {

            // Tao Title
            XSSFCell cell = firstSheet.createRow(0).createCell(0);
            cell.setCellValue(title);

            XSSFCellStyle style = createCellStyleTitle();

            cell.setCellStyle(style);
            firstSheet.addMergedRegion(new CellRangeAddress(0, 0, 0, l));

            XSSFCellStyle styleHeader = createCellStyleHeader();
            insertRow(null, 1, 0, header, styleHeader);

            // Set data
            int rowCount = 2;
            for (Object[] data : datas) {

                style = (rowCount % 2 == 0) ? createCellStyleNommalOdd() : createCellStyleNommalEven();

                insertRow(null, rowCount, 0, data, style);
                rowCount++;
            }
            autoWidth(null, 0, l);

            try ( FileOutputStream fos = new FileOutputStream(path)) {
                workbook.write(fos);
            }
//            System.out.println("Create Successfull");

        } catch (Exception e) {
        }

    }

    public void createFile(String path, String title, String[] header, ArrayList<Object> list) {
        Object[][] datas;

        if (list.get(0) instanceof Students) {
            datas = new Object[list.size()][6];
            for (int i = 0; i < list.size(); i++) {
                Students s = (Students) list.get(i);
                datas[i][0] = s.getID();
                datas[i][1] = s.getFullname();
                datas[i][2] = s.getStringGender();
                datas[i][3] = s.getEmail();
                datas[i][4] = s.getPhoneNumber();
                datas[i][5] = s.getAddress();

            }
        } else if (list.get(0) instanceof Score) {
            datas = new Object[list.size()][6];
            for (int i = 0; i < list.size(); i++) {
                Score s = (Score) list.get(i);
                datas[i][0] = s.getIdStudent();
                datas[i][1] = s.getFullname();
                datas[i][2] = s.getEnligsh();
                datas[i][3] = s.getJava();
                datas[i][4] = s.getSqlServer();
                datas[i][5] = s.getAvegare();
            }
        } else {
            return;
        }

        createFile(path, title, header, datas);

    }

//    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
//        ExcelHelper e = new ExcelHelper("Students List");
//
//        String[] title = new String[]{
//            "ID",
//            "Fullname",
//            "Gender",
//            "Email",
//            "Phone number",
//            "Address"
//        };
//
//        try {
//            StudentDao dao = new StudentDao();
//            ArrayList<Students> list = dao.getStudents();
//
//            Object[][] obj = new Object[][]{
//                {"PD06021", "Nguyen Quoc Thinh", "male", "quocthinhtme@gmail.com", "1", "1"},
//                {"PD06021", "Nguyen Quoc Thinh", "male", "quocthinhtme@gmail.com", "1", "1"},
//                {"PD06021", "Nguyen Quoc Thinh", "male", "quocthinhtme@gmail.com", "1", "1"},
//                {"PD06021", "Nguyen Quoc Thinh", "male", "quocthinhtme@gmail.com", "1", "1"}
//            };
//
//            e.createFile("C:/Users/Lenovo/Desktop/Temp/Test.xlsx","Tao boi Lisst", title, list);
//            FileOutputStream fos = new FileOutputStream("C:/Users/Lenovo/Desktop/Temp/Teast.xlsx");
//            e.workbook.write(fos);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
}
