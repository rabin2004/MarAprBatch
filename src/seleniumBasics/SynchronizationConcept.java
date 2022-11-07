package seleniumBasics;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationConcept {
	// Synchronization -> synch between application loading and automation execution
	
		// Types of synchronization:
			// 1. Static wait -> pause in execution, Thread.sleep(5000);
		
			// 2. Dynamic wait -> pause execution for defined amount of time until element is found, if found continue execution
					// a. Implicit wait: -> global wait, defined once applicable for all elements where action is going to be performed -> implicitlyWait()
					// b. Explicit wait: -> defined for a specific element -> WebDriverWait class
							
							// Fluent wait: -> polling/frequency of search can be adjusted -> FluentWait class
	// 0-5-10-15-20
	// 90 -> Implicit 10sec
	// 10 -> Explicit 20sec -> loaded 1sec - 4sec waste
	// 0-2-4-6-8..... -> 1sec waste
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); // implicitlyWait(15, TimeUnit.SECONDS) -> Selenium4 -> implicitlyWait(Duration.ofSeconds(15))
		driver.get("https://amazon.com");
		
		Actions action = new Actions(driver);
		WebElement searchTxtbox = driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(searchTxtbox).click().sendKeys("apple").build()
		.perform();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		action.sendKeys(Keys.PAGE_UP).build().perform();
		
		// explicit wait
		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		WebDriverWait explicitWait = new WebDriverWait(driver, 20);
		explicitWait.until(ExpectedConditions.visibilityOf(searchBtn));
		searchBtn.click();
		
		// fluent wait
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);
		WebElement languageChangeIcon = driver.findElement(By.id("icp-nav-flyout"));
		fluentWait.until(ExpectedConditions.invisibilityOf(languageChangeIcon));
		
		driver.close();
	}

}
