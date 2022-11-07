package testNGbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgSetup {
	
	@Test // A test automation method/case
	public void positiveSearchFunctionalityTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("https://amazon.com");
		
		Actions action = new Actions(driver);
		WebElement searchTxtbox = driver.findElement(By.id("twotabsearchtextbox"));
		String productForSearch = "apple";
		action.moveToElement(searchTxtbox).click().sendKeys(productForSearch).build()
		.perform();
		
		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		searchBtn.click();
		
		// Verification point
//		if(driver.getTitle().contains(productForSearch)) {
//			System.out.println("Search functionality test: Passed");
//		}else {
//			System.err.println("Search functionality test: Failed");
//		}
		
		// Validation point - Assertions -> 
			// 1. assertEquals(actual, expected)
			// 2. assertTrue(condition)
			// 3. assertFalse(condition)
		
		Assert.assertTrue(!driver.getTitle().contains(productForSearch));
		
		driver.close();
	}
	
	@Test
	public void negativeSearchFunctionalityTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("https://amazon.com");
		
		Actions action = new Actions(driver);
		WebElement searchTxtbox = driver.findElement(By.id("twotabsearchtextbox"));
		String productForSearch = "#*&#*()$KFNLKDFNDLKFNDLKFNLKNq092472834723894738924732894";
		action.moveToElement(searchTxtbox).click().sendKeys(productForSearch).build()
		.perform();
		
		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		searchBtn.click();
		
		WebElement noResultErrorMsg = driver.findElement(By.
				xpath("//div[@class='a-row']/span[1]"));
		Assert.assertTrue(!noResultErrorMsg.isDisplayed());
		
		driver.close();
	}

}
