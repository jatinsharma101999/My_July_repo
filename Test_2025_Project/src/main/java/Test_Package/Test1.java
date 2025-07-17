package Test_Package;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Test1 {
	
	@Test
	public void a() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.get("https://maven.apache.org/download.cgi");
	    System.out.println("Hello Jatin");
	    driver.get("https://www.facebook.com");
	    driver.findElement(By.id("email")).sendKeys("abcd");
	    
	    System.out.println("Hello New branch");
	    System.out.println("Hello second line");
		
	}

}
