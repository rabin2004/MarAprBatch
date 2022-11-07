package testPkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Copy {
	
	@Test
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
		Assert.assertTrue(!driver.getTitle().contains(productForSearch));
		
		driver.close();
	}

}
