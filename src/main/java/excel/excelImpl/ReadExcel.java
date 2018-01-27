package excel.excelImpl;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author guoqing
 * @createDate： 2018/1/27 18:45
 * @Description: ${Descriptions}
 */
public class ReadExcel {


    public static String[][] readExcel(String excelName) throws IOException {
        Workbook wb = dealExcel(excelName);
        Sheet sheet = wb.getSheetAt(0);
        int i = 0;
        int physicalNumberOfCells = sheet.getRow
                (0).getPhysicalNumberOfCells();
        String[][] results = new String[sheet.getPhysicalNumberOfRows()
                ][physicalNumberOfCells];
        for (Row row : sheet) {
            for (int j = 0; j < physicalNumberOfCells; j++) {
                Cell cell = row.getCell(j);
                if (cell == null) {
                    results[i][j] = "";
                    continue;
                }
                String cellValue = cell.getStringCellValue();
                results[i][j] = cellValue;
            }
            i++;
        }
        wb.close();
        return results;
    }


    private static Workbook dealExcel(String excelName) throws IOException {
        Workbook wb;
        FileInputStream inputStream = new FileInputStream(new File(excelName));
        if (excelName.endsWith(".xls")) {
            wb = new HSSFWorkbook(inputStream);
        } else if (excelName.endsWith(".xlsx")) {
            wb = new XSSFWorkbook(inputStream);
        } else {
            throw new RuntimeException("所给文件格式有误，请确认文件！");
        }
        return wb;
    }
}
