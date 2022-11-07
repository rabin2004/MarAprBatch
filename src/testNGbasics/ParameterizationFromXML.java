package testNGbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationFromXML {
	// Passing parameter from XML:
		// 1. define parameters in XML file -> parameter keyword -> name="" value=""
		// 2. @Parameters -> use annotation on method where parameter is being used
		// 3. define parameters in method to handle it
	
	// parameterized testNG class can't be run directly
	
	WebDriver driver;
	
	@Parameters({"chrome path", "test url"})
	@BeforeMethod
	public void initilization(String chromePath, String url) {
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.get(url);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	@Parameters({"invalid username","invalid password"})
	@Test
	public void negativeLoginFunctionalityTestByClickingAccountListLink(
			String username, String password) {
		driver.findElement(By.id("nav-link-accountList")).click();
		Assert.assertEquals(driver.getTitle(), "Amazon Sign-In");
		driver.findElement(By.id("ap_email")).sendKeys(username);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(password);
		driver.findElement(By.id("signInSubmit")).click();
		WebElement loginErrorMsg = driver.findElement(By.xpath("//span[@class='a-list-item']"));
		Assert.assertTrue(loginErrorMsg.isDisplayed());
		System.out.println(loginErrorMsg.getText());
	}
}
