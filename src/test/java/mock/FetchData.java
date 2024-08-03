package mock;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./src/test/resources/Book1.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sh = wb.getSheet("Sheet1");

		int lastRow = sh.getLastRowNum() + 1;
		String f = null;

		for (int i = 0; i < lastRow; i++) {
			int lastCell = sh.getRow(i).getLastCellNum();
			for (int j = 0; j < lastCell; j++) {

				f = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(f + " ");
			}
			System.out.println();
		}
	}
}
