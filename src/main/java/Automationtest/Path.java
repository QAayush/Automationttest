package Automationtest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.commons.io.FileUtils;
import java.io.File;
import org.openqa.selenium.*;
import java.io.IOException;

public class Path extends Webdrivermethod{

	public static void main(String[] args) throws IOException {
	 Path p=new Path();
	 
	// p.webdriver();
//	 Webdrivermethod dirver1=new Webdrivermethod();
	p.webdriver();
	 WebDriver driver = new ChromeDriver();
	 String URL="https://ubi-quality.scoreme.in:444/#/mudra-main";
	 driver.get(URL);
//	 File sc= URL.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(sc, new File("Dummy.png"));
	 
	 driver.manage().window().maximize();
	
WebElement s=driver.findElement(By.xpath("/html/body"));
s.click();
	
	File sc= s.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(sc, new File("Dummy.png"));
	driver.quit();
	
	// driver.findElement(By.linkText("Login")).click();
	
	 
	}

}
