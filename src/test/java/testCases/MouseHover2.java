package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		String url = "https://demoqa.com/slider/";
		driver.get(url);
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		WebElement slider = driver.findElement(By.id("sliderContainer"));
		action.moveToElement(slider, 20, 0).click().build().perform();
		System.out.println("moved slider in horizontal direction");
		
		//driver.quit();
	}
   
}
