package Automationtest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simplAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RIL-LT-AYUSH\\Desktop\\web\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");
//driver.findElement(By.id("alertButton")).click();

		/*
		 * WebElement element = driver.findElement(By.id("promtButton"));
		 * ((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);
		 * 
		 * 
		Alert dummy = driver.switchTo().alert(); String test = dummy.getText();
		 * 
		 * System.out.println("Alert text is"+test); dummy.sendKeys("test user");
		 * 
		 */ /*
			 * dummy.accept();
			 * 
			 
			 */
		
//		WebElement element = driver.findElement(By.id("confirmButton"));
//		((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);
//		
//
//		Alert dummy = driver.switchTo().alert();
//		dummy.accept();
//		
		
		
	}

}
