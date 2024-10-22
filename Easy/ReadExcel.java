import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;

public class ReadExcel {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream(new File("data.xlsx"));
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet = wb.getSheetAt(0);
        Row row = sheet.getRow(0);

        String email = row.getCell(0).getStringCellValue();
        String password = row.getCell(1).getStringCellValue();
        
        System.out.println("Email: " + email + ", Password: " + password);
        wb.close();
    }
}
