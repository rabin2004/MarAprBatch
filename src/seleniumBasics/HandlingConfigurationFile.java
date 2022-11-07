package seleniumBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingConfigurationFile {
	static String productForSearch = "apple";

	public static void main(String[] args) throws IOException {
		// Handling Configuration file:
		// 1. Create instance Properties class
		Properties prop = new Properties();
		
		// 2. To read file -> FileInputStream class
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\User\\eclipse-workspace"
				+ "\\MarAprBatch\\src\\seleniumBasics\\config.properties"));
		
		// 3. Load config data read to Properties class
		prop.load(fis);
		
		System.setProperty(prop.getProperty("chromeKey"), prop.getProperty("chromePath"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Long.valueOf(prop.getProperty("pageLoadTimeOut"))
				, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Long.valueOf(prop.getProperty("implicitWait"))
				, TimeUnit.SECONDS); // implicitlyWait(15, TimeUnit.SECONDS) -> Selenium4 -> implicitlyWait(Duration.ofSeconds(15))
		driver.get(prop.getProperty("testAppUrl"));
		
		Actions action = new Actions(driver);
		WebElement searchTxtbox = driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(searchTxtbox).click().sendKeys(productForSearch).build()
		.perform();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		action.sendKeys(Keys.PAGE_UP).build().perform();
		
		// explicit wait
		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		WebDriverWait explicitWait = new WebDriverWait(driver, 
				Long.valueOf(prop.getProperty("explicitWait")));
		explicitWait.until(ExpectedConditions.visibilityOf(searchBtn));
		searchBtn.click();
		
		if(driver.getTitle().contains(productForSearch)) {
			System.out.println("Search functionality test: Passed");
		}else {
			System.err.println("Search functionality test: Failed");
		}
		
		driver.close();
	}

}
