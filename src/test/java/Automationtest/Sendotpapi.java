package Automationtest;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Sendotpapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		RestAssured.baseURI="https://ubi-quality.scoreme.in";
		
		given().log().all().header("Content-Type", "application/json").body("{\r\n"
				+ "    \"mobileNumber\": \"4423432432\",\r\n"
				+ "    \"type\": \"\",\r\n"
				+ "    \"flag\": \"MUDRA\"\r\n"
				+ "}").when().post("ias/ubi/v1/user/sendOtp").then().log().all().assertThat().statusCode(200).body("status", equalTo("SUCCESS"));
	}

}
