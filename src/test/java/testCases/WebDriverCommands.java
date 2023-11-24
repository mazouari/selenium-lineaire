package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		driver.manage().window().maximize();
		
		String titlePage = driver.getTitle();
		int titleLength = titlePage.length();
		System.out.println("Title of the page is : " + titlePage );
		System.out.println("Lenght Title of the page is : " + titleLength );
		String actualurl = driver .getCurrentUrl();
		if (actualurl.equals(url)) {
			System.out.println("Successful : The correct url is opened");
			
		}else {
			System.out.println("Failed : an incorrect url is opened");
		}
		System.out.println("Actual url is : " + actualurl);
		System.out.println("Expected url is : " + url);
		
		String sourcepage = driver.getPageSource();
		int lengthsourcepage = sourcepage.length();
		System.out.println("Lenght of source page is : " + lengthsourcepage );
		
		//driver.quit();
				
	}

}
