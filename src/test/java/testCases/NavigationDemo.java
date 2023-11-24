package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		String url = "https://demoqa.com/automation-practice-form";
		driver.get(url);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.navigate().forward();
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		//scroll down
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 700)", "");
		
		driver.quit();

	}

}
