package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) {

		// Create a new instance of the ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Navigate to the URL
		driver.get("https://demoqa.com/select-menu");

		// Find and click on the Multiselect dropdown
		WebElement multiselectDropdown = driver.findElement(By.xpath("//div[@class='select-menu-container']//div[@class='row']//div[contains(@class,'css-1hwfws3')]"));
		multiselectDropdown.click();


        // Select Black from the dropdown
        WebElement blackOption = driver.findElement(By.xpath("//div[@class='select-menu-container']//div[@class='row']//div[contains(@class,'css-1hwfws3')] //div[contains(text(),'Green')]"));
        blackOption.click();

        // Select Red from the dropdown
        WebElement redOption = driver.findElement(By.xpath("//div[@class='select-menu-container']//div[@class='row']//div[contains(@class,'css-1hwfws3')] //div[contains(text(),'Red')]"));
        redOption.click();

        // Wait for a few seconds to observe the changes (you may replace this with explicit wait)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
       // driver.quit();
    }
}