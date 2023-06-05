package Automationtest;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;



public class Navigate {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RIL-LT-AYUSH\\Desktop\\web\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
	driver.navigate().to("https://facebook.com");// tonavigate url
	driver.get("https://sarkariresult.com");// to navigate application 
	//driver.close();// close the driver
	//driver.quit();// same close\
	driver.navigate().back();
	driver.navigate().forward();
 driver.navigate().refresh();
 
	}

}
