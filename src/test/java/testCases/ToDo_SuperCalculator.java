package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class ToDo_SuperCalculator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		String url = "https://juliemr.github.io/protractor-demo/";
		driver.get(url);
		driver.manage().window().maximize();

		String firstNumber = "9";
		String secondNumber = "3";

		WebElement firstNumberField = driver.findElement(By.xpath("//input[@ng-model='first']"));
		firstNumberField.sendKeys(firstNumber);

		WebElement secondNumberField = driver.findElement(By.xpath("//input[@ng-model='second']"));
		secondNumberField.sendKeys(secondNumber);

		WebElement goButton = driver.findElement(By.id("gobutton"));
		goButton.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait 10 seconds

		// Wait until the text is present
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h2"),
				String.valueOf(Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber))));

		WebElement result = driver.findElement(By.tagName("h2"));

		System.out.println("Result is : " + result.getText());

		// Close the browser
		driver.quit();
	}
}
