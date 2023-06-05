package Automationtest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import requestPayload.Libaraypayload;

import static io.restassured.RestAssured.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(dataProvider="BookData")
public class Liabaryapitest {

	
	public void addBook(String isbn, String aisle, String name, String author) {
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
	String str=	given().log().all().header("Content-Type", "application/json").body(Libaraypayload.payload(isbn, aisle, name, author )).when().post("Library/Addbook.php").then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js= new JsonPath(str);
	String id=	js.get("ID");
	
	System.out.println(id);
	}
	
	@DataProvider(name="BookData")
	public Object[][] getData() {
		return new Object[][] {{"abcd","1234"}, {"efgh", "12345"}};
	}
	
	
	
}
