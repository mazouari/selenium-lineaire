package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) {

		// Open chrome browser
		WebDriver driver = new ChromeDriver();

		// Maximize browser
		driver.manage().window().maximize();

		// Open NopCommerce Application
		driver.get("https://demoqa.com/buttons");

		// instantiate action class
		Actions action = new Actions(driver);

		// Retrieve webelement to perform double click
		WebElement btnDoubleClick = driver.findElement(By.id("doubleClickBtn"));
		action.doubleClick(btnDoubleClick).perform();
		// System.out.println("button is double clicked");

		String messageDoubleClick = driver.findElement(By.id("doubleClickMessage")).getText();
		Assert.assertEquals(messageDoubleClick, "You have done a double click");
		// driver.quit(); // kill session

	}

}
