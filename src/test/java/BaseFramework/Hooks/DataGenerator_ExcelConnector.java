package BaseFramework.Hooks;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class DataGenerator_ExcelConnector {
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;

    public void setDataGeneratorFile(String filePath, String sheetName) {
        try {
            FileInputStream file = new FileInputStream(filePath);
            workbook = new XSSFWorkbook(file);
            sheet = workbook.getSheet(sheetName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getExcelData(int row, int col) throws Exception {
        try {
            cell = sheet.getRow(row).getCell(col);
            String cellData = cell.getStringCellValue();
            return cellData;
        } catch (Exception e) {
            return "";
        }
    }
}
