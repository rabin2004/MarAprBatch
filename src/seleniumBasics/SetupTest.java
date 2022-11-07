package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupTest {

	public static void main(String[] args) {
		
		// 1. Setting property -> browser, driver path
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe"); // windows -> file extension needs to be provided | mac -> path capture enough, no need extension
		
		// 2. Instance/object of driver (ChromeDriver) class -> Polymorphism - WebDriver
		WebDriver driver = new ChromeDriver();
		
		// maximize window size
		driver.manage().window().maximize();
		
		// 3. load application
		driver.get("https://www.ebay.com/");
		
		// Automation testing code
		
		// 4. close browser
		driver.close();
	}

}
