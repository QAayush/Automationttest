package Udemyprojects;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RIL-LT-AYUSH\\Desktop\\web\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());// the title for page
		
		
		//System.out.println(driver);
	}
	
}
