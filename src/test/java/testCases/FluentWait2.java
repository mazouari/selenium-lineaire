package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;

public class FluentWait2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.sfr.fr");
		driver.manage().window().maximize();

		Wait<WebDriver> wait1 = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);

		WebElement button = wait1.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Tout accepter")));

		if (button.isDisplayed() && button.isEnabled()) {
			button.click();
			System.out.println("Le bouton 'Tout accepter' est cliquable.");
		} else {
			System.out.println("Le bouton 'Tout accepter' n'est pas cliquable.");
		}

		// Configuration of Fluent Wait Method with a maximum wait of 30 seconds and a
		// polling interval of 2 seconds

		Wait<WebDriver> wait2 = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(Exception.class); // Ignore exceptions while waiting

		// Using Fluent Wait to wait for the "Je m'équipe" button to appear

		WebElement button2 = wait2.until(ExpectedConditions.presenceOfElementLocated(By.linkText("J'en profite")));

		if (button2.isDisplayed() && button2.isEnabled()) {
			button2.click();
			System.out.println("Le bouton 'J'en profite' est cliquable.");
		} else {
			System.out.println("Le bouton 'J'en profite' n'est pas cliquable.");
		}

	}
}
