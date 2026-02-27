package Utilities;

import Pages.Page_Online_App;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileInputStream;
import java.io.IOException;

public class DataSheet extends Page_Online_App {

public void DataRead() throws IOException {

    FileInputStream fs = new FileInputStream("C:\\Users\\617018917\\Downloads\\Maven Projects\\TestDataSheet.xlsx");
    XSSFWorkbook workbook = new XSSFWorkbook(fs);
    XSSFSheet sheet = workbook.getSheetAt(0);
    Row row = sheet.getRow(0);
    Cell cell = row.getCell(0);
    System.out.println(sheet.getRow(0).getCell(0));
    Row row1 = sheet.getRow(1);
    Cell cell1 = row1.getCell(1);
    System.out.println(sheet.getRow(0).getCell(1));
    Row row2 = sheet.getRow(1);
    Cell cell2 = row2.getCell(1);
    System.out.println(sheet.getRow(1).getCell(0));
    Row row3 = sheet.getRow(1);
    Cell cell3 = row3.getCell(1);
    System.out.println(sheet.getRow(1).getCell(1));

}
}
