package Automationtest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.ValidatableResponse;
import pojo.payloaddata;
import static org.hamcrest.Matchers.*;

public class Testingp {

	payloaddata d= new payloaddata();
	
	
	
	@Test( priority=0, groups="smoke", invocationCount=1)

		public  void addBook() {
						
			d.setName("www");
			d.setAisle("42342324");
			d.setAuthor("twest");
			d.setIsbn("twesting");
			
			
			
			RestAssured.baseURI="https://rahulshettyacademy.com";
			
		ValidatableResponse str=	given().log().all().header("Content-Type", "application/json").body(d).
				when().post("Library/Addbook.php").then().log().all().assertThat().
				statusCode(equalTo(200)).body(JsonSchemaValidator.matchesJsonSchema(new String("C:\\Users\\SCOREME-LT-AYUSH\\eclipse-workspace\\Automationtest\\TestData\\testt.json")));
			
		
		System.out.println(str);
		
		}
		
		
	
	
		
	
		
	}




