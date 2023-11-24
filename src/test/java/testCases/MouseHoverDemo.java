package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		String url = "https://demoqa.com/menu/";
		driver.get(url);
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement mouseHover = driver.findElement(By.xpath("//*[@id='nav']/li[2]/a"));
		action.moveToElement(mouseHover).perform();
		
		//driver.quit();

	}

}
