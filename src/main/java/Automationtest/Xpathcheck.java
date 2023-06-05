package Automationtest;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;



public class Xpathcheck {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RIL-LT-AYUSH\\Desktop\\web\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://saucedemo.com");
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("Ayush");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		
	
		
		
	}

}
