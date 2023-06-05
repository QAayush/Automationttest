package restassuredtest;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import requestPayload.Libaraypayload;

public class Readdatabyaexcel {

	public static Workbook book;

	

		@Test(dataProvider = "BookData")
		public void addBook(String isbn, String aisle) {
			RestAssured.baseURI = "https://rahulshettyacademy.com";

			String str = given().log().all().header("Content-Type", "application/json")
					.body(Libaraypayload.payload(isbn, aisle)).when().post("/Library/Addbook.php").then().log().all()
					.assertThat().statusCode(200).extract().response().asString();

			JsonPath js = new JsonPath(str);
			String id = js.get("ID");

			System.out.println(id);
		}

	

	@DataProvider(name="BookData")
	public static Object[][] getTestData() throws EncryptedDocumentException, IOException {
		FileInputStream file = null;
		try {
			file = new FileInputStream(
					"C:\\Users\\SCOREME-LT-AYUSH\\eclipse-workspace\\Automationtest\\TestData\\DATA.xlsx");

		} catch (FileNotFoundException e) {
			e.getStackTrace();
		}

		try {
			book = WorkbookFactory.create(file);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheet = book.getSheetAt(0);

		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
			}
		}

		return data;

	}

}
