package Automationtest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Testcase {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RIL-LT-AYUSH\\Desktop\\web\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://saucedemo.com");

		// *With valid data*

//	driver.findElement(By.id("user-name")).sendKeys("standard_user");
//	driver.findElement(By.id("password")).sendKeys("secret_sauce");
//	driver.findElement(By.name("login-button")).click();

		// *User name is correct and password is incorrect*
//
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("dummy");
//		driver.findElement(By.name("login-button")).click();

		// *User name is incorrect and passowrd is correct*

//		driver.findElement(By.id("user-name")).sendKeys("dummy");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//       	driver.findElement(By.name("login-button")).click();

		// *both input field is incorrect*

//		driver.findElement(By.id("user-name")).sendKeys("dummy");
//		driver.findElement(By.id("password")).sendKeys("dummy");
//		driver.findElement(By.name("login-button")).click();

		// * both input field is blank

//		driver.findElement(By.id("user-name"));
//		driver.findElement(By.id("password"));
//		driver.findElement(By.name("login-button")).click();

		// *Check user name cross button working or not
		
//		driver.findElement(By.name("login-button")).click();
//		driver.findElement(By.className("svg-inline--fa fa-times-circle fa-w-16 error_icon")).click();
		
		//* check password cross button working or not
		
//		driver.findElement(By.name("login-button")).click();
//		driver.findElement(By.className("svg-inline--fa fa-times-circle fa-w-16 error_icon")).click();

		//* check login alert cross button working or not
		
//		driver.findElement(By.name("login-button")).click();
//		driver.findElement(By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3 > button > svg > path")).click();
//		
		//*
		
		
		
		
	}

}
