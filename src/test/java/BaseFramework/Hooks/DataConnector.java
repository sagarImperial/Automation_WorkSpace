package BaseFramework.Hooks;

import BaseFramework.Utils.Constants;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataConnector {

    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;
    XSSFRow row;

    FileOutputStream outputStream;

    public DataConnector() {

    }

    //This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method
    public void setDataFile(String excelFilePath, String sheetName) {
        try {
            //Open File to read data
            FileInputStream excelFile = new FileInputStream(excelFilePath);
            workbook = new XSSFWorkbook(excelFile);
            sheet = workbook.getSheet(sheetName);

            FileOutputStream outputStream = new FileOutputStream(excelFilePath);
            workbook.write(outputStream);
            outputStream.close();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

    public String getData(int row, int col) throws Exception {
        try {
            cell = sheet.getRow(row).getCell(col);
            String cellData = cell.getStringCellValue();
            return cellData;
        } catch (Exception e) {
            return "";
        }
    }

    public void writeData(String value, int rowNum, int colNum) {
        try {
//            sheet.getRow(rowNum).createCell(colNum).setCellValue(value);
            //Old Code
//            row = sheet.getRow(rowNum);
//            cell = row.getCell(colNum);
////            cell = row.createCell(colNum);
//            cell.setCellValue(value);
//            FileOutputStream outputStream = new FileOutputStream(Constants.EXCEL_FILE_PATH);
//            workbook.write(outputStream);
//            outputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // There is plan to


    public static void main(String[] args) {
        try {
            File src = new File(Constants.EXCEL_FILE_PATH);// Specify the file path which you want to create or write
            FileInputStream fis = new FileInputStream(src);// Load the file
            XSSFWorkbook wb = new XSSFWorkbook(fis);// load the workbook
            XSSFSheet sh1 = wb.getSheet(Constants.EXCEL_CREATE_ACCOUNT_SHEET_NAME);// get the sheet which you want to modify or create

            sh1.getRow(0).createCell(0).setCellValue("ashwini");// here createCell will create column and setCellvalue will set the value
            FileOutputStream fout = new FileOutputStream(new File(Constants.EXCEL_FILE_PATH));// here we need to specify where you want to save file
            wb.write(fout);// finally write content
            fout.close();// close the file
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
