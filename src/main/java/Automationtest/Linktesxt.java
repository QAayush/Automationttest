package Automationtest;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;



public class Linktesxt extends Webdrivermethod{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Linktesxt obj=new Linktesxt();
		obj.webdriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://scodenetwork.com");
		driver.findElement(By.linkText("About us")).click();
		
		
	}

}
