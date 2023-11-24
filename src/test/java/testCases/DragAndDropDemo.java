package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		String url = "https://demoqa.com/droppable/";
		driver.get(url);
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		action.dragAndDrop(from, to).perform();
		
		//Verify text changed to Dropped!
		String textTo = to.getText();
		if (textTo.equals("Dropped!")) {
			System.out.println("Pass : source is dropped to target as expected ");
		} else {
			System.out.println("Fail : source could not be dropped to target as expected ");
		}
        // driver.quit();
	}

}
