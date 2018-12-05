package com.company;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ParcerOne {

    private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    private static XSSFCell Cell;
    private static XSSFRow Row;
    File fileName = new File("home/denys/IdeaProjects/Learning/TimeReportsComparator/Fund.xlsx");


    public void setExcelFile(File Path, String SheetName) throws Exception {

        try {
            FileInputStream ExcelFile = new FileInputStream(Path);
            ExcelWBook = new XSSFWorkbook(ExcelFile);
            ExcelWSheet = ExcelWBook.getSheet(SheetName);
        } catch (Exception e) {
            throw (e);
        }

    }

    public  String getCellData(int RowNum, int ColNum) throws Exception {

        try {
            Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
            String CellData = Cell.getStringCellValue();
            return CellData;
        } catch (Exception e) {

            return "";

        }

    }

    public static void setCellData(String Result, int RowNum, int ColNum, File Path) throws Exception {

        try {
            Row = ExcelWSheet.createRow(RowNum - 1);
            Cell = Row.createCell(ColNum - 1);
            Cell.setCellValue(Result);
            FileOutputStream fileOut = new FileOutputStream(Path);
            ExcelWBook.write(fileOut);
            fileOut.flush();
            fileOut.close();
        } catch (Exception e) {

            throw (e);

        }

    }

}

