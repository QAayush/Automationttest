package restassuredtest;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

@Test
public class Requesthitbyafile {
			
		public void addBook() throws IOException {
			RestAssured.baseURI="https://rahulshettyacademy.com";
			
		String str=	given().log().all().header("Content-Type", "application/json").body(Files.readAllBytes(Path.of("C:\\Users\\SCOREME-LT-AYUSH\\Downloads"
				+ "\\payload.json"))).when().post("Library/Addbook.php").then().log().all().assertThat().statusCode(200).extract().response().asString();
			
			JsonPath js= new JsonPath(str);
		String id=	js.get("ID");
		
		System.out.println(id);
		}
}