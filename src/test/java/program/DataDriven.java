package program;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DataDriven {
	
	
	@Test(dataProvider = "data")
	public void demo(String createdBy, String projectName, String status, int teamSize) {
		
		
		baseURI = "http://rmgtestingserver";
		port = 8084;
		
		PojoClass p = new PojoClass(createdBy, projectName, status, teamSize);
		
		given()
		.body(p)
		.contentType(ContentType.JSON)
		
		.when()
		.post("/addProject")
		
		.then()
		.assertThat()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.time(Matchers.lessThan(1000l), TimeUnit.MILLISECONDS)
		.log().all();
	}
	
	@DataProvider
	public Object[][] data() {
		
		Object [][]obj = new Object[1][4];
	
		
		obj [0][0]="mohan";
		obj [0][1]="akash9831";
		obj[0][2]="done";
		obj[0][3]=10;
		
		
		return obj;
		
		
	}

}
