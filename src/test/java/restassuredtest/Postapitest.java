package restassuredtest;

import io.restassured.RestAssured;
import requestPayload.Payload;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.testng.annotations.Test;

public class Postapitest {

	
	@Test
	public void validateCreateNewPalce() {

		RestAssured.baseURI = "https://rahulshettyacademy.com";

String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(Payload.createplaceDetails()).when().post("maps/api/place/add/json").then().
				assertThat().statusCode(200).body("scope", equalTo("APP")).header("Server", "Apache/2.4.41 (Ubuntu)").extract().response().asString();

System.out.println(response);

JsonPath js=new JsonPath(response);// for parsing response

String PlaceID=js.getString("place_id");
System.out.println(PlaceID);
String status =js.getString("status");
assertEquals("OK", status);




// GET Place DATA

String getresponse=given().queryParam("place_id", PlaceID).queryParam("key", "qaclick123").when().get("maps/api/place/get/json").then().log().all().assertThat().
statusCode(200).extract().response().asString();

System.out.println(getresponse);
JsonPath js1= new JsonPath(getresponse);
String address=js1.getString("address");
assertEquals("29, side layout, cohen 09", address);

// PUT  place data


String response2=given().log().all().queryParam("place_id", PlaceID).queryParam("key", "qaclick123").header("Content-Type", "application/json").body("{\r\n"
		+ "\"place_id\":\""+PlaceID+"\",\r\n"
		+ "\"address\":\"Sector 75 Noida\",\r\n"
		+ "\"key\":\"qaclick123\"\r\n"
		+ "}").when().put("maps/api/place/update/json").
then().log().all().assertThat().statusCode(200).extract().response().asString();

System.out.println(response2);
//JsonPath js2= new JsonPath(getresponse);
//
//String msg=js2.getString("Address successfully updated");
//
//assertEquals("msg", msg);
	}

}

