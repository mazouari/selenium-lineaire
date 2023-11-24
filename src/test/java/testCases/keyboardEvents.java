package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboardEvents {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		String url = "https://demoqa.com/text-box";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement fullName = driver.findElement(By.id("userName"));
		WebElement email = driver.findElement(By.id("userEmail"));
		WebElement currentAdress = driver.findElement(By.id("currentAddress"));
		WebElement permanentAdress = driver.findElement(By.id("permanentAddress"));
		
		fullName.sendKeys("Mohamed-Ali");
		email.sendKeys("mohamed.ali.zouari@gmail.com");
		currentAdress.sendKeys("96 Bd du Marechal Joffre Bourg la reine");
		
		currentAdress.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		currentAdress.sendKeys(Keys.chord(Keys.CONTROL, "c"));
		
		permanentAdress.sendKeys(Keys.chord(Keys.CONTROL, "v"));
		
		//JavaScript executor click on submit button
		WebElement btnSubmit = driver.findElement(By.id("submit"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", btnSubmit);
		
		//driver.quit();
		

	}

}
