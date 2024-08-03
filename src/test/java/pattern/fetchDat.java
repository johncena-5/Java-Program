package pattern;

import org.testng.annotations.Test;

public class fetchDat {
	
	
	@Test(dataProviderClass = Data.class , dataProvider = "data")
	public void get(String id, String pass) {
		System.out.println(id+" "+pass);
		
	}
}
