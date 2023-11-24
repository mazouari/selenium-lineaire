package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {

		// Open Chrome browser
		WebDriver driver = new ChromeDriver();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

		// Delete cookies
		driver.manage().deleteAllCookies();

		// Open NopCommerce Application
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		// Maximize browser
		driver.manage().window().maximize();

		// Wait 3 sec
		Thread.sleep(3000);

		// Clear Email field
		driver.findElement(By.id("Email")).clear();

		// Fill Email
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");

		// Clear password field
		driver.findElement(By.id("Password")).clear();

		// Fill Password
		driver.findElement(By.id("Password")).sendKeys("admin");

		// Click On Login Button
		// driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		// click on login button using explicit wait
		WebElement btnLogin;
		btnLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		btnLogin.click();
		
		
		 
	        

		// Print a log in message in the screen
		System.out.println("succefully authentication");

		// Close Browser
		// driver.close();

		//driver.quit(); // kill session

	}

}
