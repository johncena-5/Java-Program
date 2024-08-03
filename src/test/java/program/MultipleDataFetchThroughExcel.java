package program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleDataFetchThroughExcel {

	public static void main(String[] args) throws Throwable {

		FileInputStream fis = new FileInputStream("./src/test/resources/Book1.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sh = wb.getSheet("Sheet1");
		int lastrow = sh.getLastRowNum();
		int lastcell = sh.getRow(0).getLastCellNum();

		HashMap<String, String> map = new HashMap<>();
		for (int i = 0; i <= lastrow; i++) {
			for (int j = 0; j <= lastcell; j++) {
				String key = sh.getRow(i).getCell(0).getStringCellValue();
				String value = sh.getRow(i).getCell(1).getStringCellValue();
				map.put(key, value);
			}
		}
		System.out.println(map);
	}
}
