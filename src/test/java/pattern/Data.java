package pattern;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data {
	
	

		@DataProvider
		public Object[][] data() {
			
			Object [][] obj = new Object[2][2];
			
			obj[0][0]="Sub";
			obj[0][1]="java";
			
			obj[1][0]="Sub";
			obj[1][1]="python";
			
			return obj;
			
			
		}

	}


