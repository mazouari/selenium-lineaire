package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));

		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));

		WebElement btnlogin = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		userName.clear();
		userName.sendKeys("Admin");
		password.clear();
		password.sendKeys("admin123");
		//btnlogin.click();

		String attValue = userName.getAttribute("name");
		System.out.println("The attribute value is : " + attValue);

		Dimension dimensions = password.getSize();
		System.out.println("Height : " + dimensions.height);
		System.out.println("widht : " + dimensions.width);

		Point point = userName.getLocation();
		System.out.println(" X coordinate is : " + point.x);
		System.out.println(" Y coordinate is : " + point.y);

		// Vérifier si l'élement est affiché oui / non
		boolean res1 = btnlogin.isDisplayed();
		System.out.println(res1);

		// Vérifier si l'élement activé oui / non
		boolean res2 = btnlogin.isEnabled();
		System.out.println(res2);

		// Vérifier si l'élement existe oui /non
		List<WebElement> login = driver.findElements(By.xpath("//button[normalize-space()='Login']"));
		if (login.size() != 0) {
			System.out.println("Element is exist");
		} else {
			System.out.println("Element dos not exist");
		}

	}

}
