package testCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		String url = "https://demoqa.com/browser-windows";
		driver.get(url);
		driver.manage().window().maximize();
		
		//Store and print the name of the first window 
		String handle = driver.getWindowHandle();
		System.out.println(handle);

		WebElement newWindowMessage = driver.findElement(By.id("messageWindowButton"));

		newWindowMessage.click();
		
		//Store and print the name of all the windows open
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		
		// Pass a window handle to other window
		for (String handle1 : driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
			System.out.println(handle1);
		}
		
		// Pass a window handle to other window
//				for (String handle1 : handles) {
//					driver.switchTo().window(handle1);
//					System.out.println(handle1);
//				}

	}

}