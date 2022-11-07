package testNGbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UsingPrePostAnnotations {
	WebDriver driver;
	
	@BeforeMethod
	public void initilization() {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.get("https://amazon.com");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@Test
	public void positiveSearchFunctionalityTest() {		
		Actions action = new Actions(driver);
		WebElement searchTxtbox = driver.findElement(By.id("twotabsearchtextbox"));
		String productForSearch = "apple";
		action.moveToElement(searchTxtbox).click().sendKeys(productForSearch).build()
		.perform();
		
		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		searchBtn.click();
		Assert.assertTrue(!driver.getTitle().contains(productForSearch));
	}
	
	@Test
	public void negativeSearchFunctionalityTest() {
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
	}
	
	// Assignment: Any app | Any 3-4 features | Create automation script as many for each feature in separate class using TestNG format, use assertions | Share execution report
}
