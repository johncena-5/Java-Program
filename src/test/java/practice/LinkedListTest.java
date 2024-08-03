package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ResourceBundle;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LinkedListTest {

	@Test(dataProvider = "data")
	public void getData(String first, String second, String third, String forth) {
		System.out.println(first + " " + second + " " + third + " " + forth);
	}

	@DataProvider
	public Object[][] data() throws Throwable {

		FileInputStream fis = new FileInputStream("./src/test/resources/Book1.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sheet = wb.getSheet("Sheet1");

		int row = sheet.getLastRowNum() + 1;
		int cell = sheet.getRow(0).getLastCellNum();
		Object obj[][] = new Object[row][cell];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cell; j++) {
				obj[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return obj;
	}
}
