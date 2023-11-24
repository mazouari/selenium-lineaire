package testCases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumJunit {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void openBrowser() {
		
		String url = "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F";
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test
	public void valid_UserCredential() {
		
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	}
	
	@Test
	public void invalid_UserCredential() {
		
		driver.findElement(By.id("Email")).sendKeys("amir@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("amir123");
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	}
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
	

}