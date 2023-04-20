package mock;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SelectTest {
	

	@Test(invocationCount=0)
	public void demo() {
		
		SoftAssert soft = new SoftAssert();
		soft.fail();
		soft.assertAll();
	}
	
	@Test(dependsOnMethods="demo")
	public void m() {
		
		System.out.println("class");
	}

}
