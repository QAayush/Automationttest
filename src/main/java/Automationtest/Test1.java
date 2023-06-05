package Automationtest;

import org.openqa.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class Test1 extends Webdrivermethod {

	public static void main(String[] args) {
		Test1 tc = new Test1();
		tc.webdriver();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.scodenetwork.com");

		// driver.findElement(By.className("gLFyf")).sendKeys("Test");
		// driver.findElement(By.className("gNO89b")).sendKeys(Keys.RETURN);

		Select Scode = new Select(driver.findElement(By.id("person_select")));
		Scode.selectByVisibleText("Delhi");
		Scode.selectByIndex(2);
		if(Scode.isMultiple()) {
			System.out.println("Multiples allow");
		}else {
			System.out.println("Not allow");
		}

	}

}
