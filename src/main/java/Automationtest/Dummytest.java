package Automationtest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;

public class Dummytest extends Webdrivermethod {

	public static void main(String[] args) {

		Dummytest dc = new Dummytest();
		dc.webdriver();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");
		/*
		 * driver.findElement(By.xpath("//*[@id=\"emailid\"]")).sendKeys(
		 * "ayush.chauhan@scoreme.in");
		 * driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Scoreme@123")
		 * ; driver.findElement(By.xpath(
		 * "/html/body/app-root/app-sign-in/div/div/div[2]/div/form/button")).click();
		 */
		/*
		 * WebElement sc=
		 * driver.findElement(By.xpath("/html/body/section[1]/div/div/div[6]/div/img"));
		 * Actions st=new Actions(driver); st.contextClick(sc).perform();
		 */
		
		driver.findElement(By.className("alertButton")).click();
		driver.switchTo().alert().accept();
		   System.out.println("Right click Alert Accepted");
		

	}

}
