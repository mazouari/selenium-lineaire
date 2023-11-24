package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String url = "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F";
		driver.get(url);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	//	driver.manage().deleteAllCookies();
		//Thread.sleep(3000);
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		//Thread.sleep(3000);
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		Thread.sleep(3000);
		// Click On Login Button
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//p[normalize-space()='Catalog']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//p[normalize-space()='Products']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		 

		// click on login button using explicit wait
		//WebElement btnLogin;
		//btnLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		//btnLogin.click();
		//System.out.println("succefully authentication");
	}
}
