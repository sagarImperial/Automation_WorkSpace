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

    public DataConnector() {

    }

    //This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method
    public void setDataFile(String excelFilePath, String sheetName) {
        try {
            //Open File to read data
            FileInputStream excelFile = new FileInputStream(excelFilePath);
            workbook = new XSSFWorkbook(excelFile);
            sheet = workbook.getSheet(sheetName);
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
}
