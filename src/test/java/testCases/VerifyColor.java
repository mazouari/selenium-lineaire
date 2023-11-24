package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyColor {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		String url = "https://demoqa.com/buttons";
		driver.get(url);
		driver.manage().window().maximize();
		String color = driver.findElement(By.id("doubleClickBtn")).getCssValue("background-color");

		//Object
		Color  color1 = Color.fromString(color);
		String actualColor = color1.asHex();

		Assert.assertEquals("#007bff", actualColor);
		System.out.println("the background color button is : " +actualColor);

		driver.quit();


	}

}
