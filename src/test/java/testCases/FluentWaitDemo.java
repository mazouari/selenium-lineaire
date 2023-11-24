package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import java.time.Duration;
import java.util.function.Function;

public class FluentWaitDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.fr");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[normalize-space()='Tout accepter']")).click();

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("selenium");
		searchBox.submit();

		FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(2))
				.ignoring(NoSuchElementException.class);

		WebElement searchLink = fluentWait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				// Scroll down
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

				WebElement link = driver.findElement(By.xpath("(//span[@class='VuuXrf'][normalize-space()='Selenium'])[1]"));
				if (link.isDisplayed()) {
					return link;
				}
				return null;
			}
		});

		searchLink.click();

	}
}
