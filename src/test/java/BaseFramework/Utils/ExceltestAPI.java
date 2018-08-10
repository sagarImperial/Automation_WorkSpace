package BaseFramework.Utils;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;


/**
 * Created by sjoshi10 on 06/12/2017.
 */
public class ExceltestAPI {

    public static XSSFSheet ExcelWSheet;
    public static XSSFWorkbook ExcelWBook;
    public static XSSFCell Cell;
    public static XSSFRow Row;
    public static XSSFSheet sheet;


    //This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method
    public static XSSFSheet setExcelFile(String Path, String SheetName) throws Exception {
        try {
            // Open the Excel file
            File src = new File(Path);
            FileInputStream ExcelFile = new FileInputStream(src);
            XSSFWorkbook workbook = new XSSFWorkbook(ExcelFile);
            XSSFSheet sheet = workbook.getSheet(SheetName);
            // Access the required test data sheet
            // ExcelWBook = new XSSFWorkbook(ExcelFile);
            ExcelWSheet = workbook.getSheet(SheetName);
            return ExcelWSheet;
        } catch (Exception e) {
            throw (e);
        }
    }

    //This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num

    public static String getCellData(int RowNum, int ColNum) throws Exception {
        Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
        String CellData = Cell.getStringCellValue();
        return CellData;

    }


    //This method is to write in the Excel cell, Row num and Col num are the parameters
    public static void setCellData(String Result, int RowNum, int ColNum) throws Exception {

        try {

            Row = ExcelWSheet.getRow(RowNum);
            Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);
            if (Cell == null) {
                Cell = Row.createCell(ColNum);
                Cell.setCellValue(Result);
            } else {
                Cell.setCellValue(Result);
            }
        } catch (Exception e) {
            throw (e);
        }
    }
}

