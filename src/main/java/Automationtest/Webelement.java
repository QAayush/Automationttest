package Automationtest;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;




public class Webelement extends Webdrivermethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Webelement web=new Webelement();
		web.webdriver();
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://scodenetwork.com");
		
		
		WebElement s=driver.findElement(By.linkText("About us"));
		s.click();

	}

}
