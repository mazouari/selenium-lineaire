
package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchCommande {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		String url = "https://demo.guru99.com/test/guru99home/";
		driver.get(url);
		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.switchTo().frame("a077aa5e");

		WebElement iframebtn = driver.findElement(By.xpath("html/body/a/img"));

		System.out.println("we are switch to the ifram");
		iframebtn.click();
		System.out.println("We are done");
	}

}
