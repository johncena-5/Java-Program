package amdocsQuestion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchData {

	public static void main(String[] args) throws Throwable, IOException {
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Book1.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet1");
		
		int lastRow = sh.getLastRowNum();
		
		Map<String, String> map = new HashMap<>();
		
		for(int i=0;i<lastRow;i++) {
			
			String key = sh.getRow(i).getCell(0).getStringCellValue();
			String value = sh.getRow(i).getCell(1).getStringCellValue();
			
			map.put(key, value);
		}
		
		String TC01 = map.get("TC02");
		
		String[] data = TC01.split("-");
		
		for(int i=0;i<data.length;i++) {
			
			if(data[i].contains("A")) {
			   System.out.println(data[i]);	
			}
		}
		wb.close();
		

	}

}
