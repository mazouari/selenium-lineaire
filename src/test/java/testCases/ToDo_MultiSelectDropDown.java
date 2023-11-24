package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToDo_MultiSelectDropDown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		String url = "https://demoqa.com/select-menu";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement multiSelectDropDown = driver.findElement(By.xpath(
				"//div[@class='select-menu-container']//div[@class='row']//div[contains(@class,'css-1hwfws3')]"));

		multiSelectDropDown.click();

		WebElement colorBlack = driver.findElement(By.xpath("//div[@class='select-menu-container']//div[@class='row']//div[contains(@class,'css-1hwfws3')] //div[contains(text(),'Black')]"));
		//WebElement colorGreen = driver.findElement(By.xpath("//div[contains(text(),'Green')]"));
		//WebElement colorRed = driver.findElement(By.xpath("//div[contains(text(),'Red')]"));
	//	WebElement colorBlue = driver.findElement(By.xpath("//div[@class='css-12jo7m5']"));

		colorBlack.click();
		//colorGreen.click();
		//colorRed.click();
		//colorBlue.click();

	}

}