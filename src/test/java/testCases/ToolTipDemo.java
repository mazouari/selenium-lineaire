package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		String url = "https://demoqa.com/tool-tips/";
		driver.get(url);
		driver.manage().window().maximize();

		WebElement toolTipBtn = driver.findElement(By.id("toolTipButton"));
		String toolTipText = toolTipBtn.getText();
		if (toolTipText.equals("Hover me to see")) {
			System.out.println("Pass : tool tip matching expected value ");
		} else {
			System.out.println("Failed : Tool tip not matching expected value");
		}

	}

}
