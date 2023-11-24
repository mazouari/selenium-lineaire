package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class ToDo_VerifyColor1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		String url = "https://ants.gouv.fr/";
		driver.get(url);
		driver.manage().window().maximize();

		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Tout accepter']"));

		button.click();

		String color = driver.findElement(By.xpath("//a[normalize-space()='Se connecter']"))
				.getCssValue("background-color");

		Color color1 = Color.fromString(color);
		String actualColor = color1.asHex();

		Assert.assertEquals("#000091", actualColor);
		System.out.println("the background color button is : " + actualColor);
		
		 driver.quit();

	}

}
