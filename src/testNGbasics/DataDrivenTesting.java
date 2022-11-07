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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {
//Data driven in TestNG -
	// Keeping test method and data providing method in same class
		// 1. @DataProvider - to store data inside data providing method -> data providing method will store data in Array
		// 2. keyword -> "dataProvider" in test method -> to locate data providing method
		// 3. parameters in test method -> parameters can use used in code
	// Keeping Test method and data providing method in separate class - but in same package
		// 1. @DataProvider
		// 2. keyword -> "dataProviderClass" then only "dataProvider" method
		// 3. parameters in test method
	// Keeping data providing method in separate package
		// 1. @DataProvider
		// 2. keyword -> "dataProviderClass" (package name as well) then only "dataProvider" method
		// 3. parameters in test method

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

	@Test(enabled=true, dataProviderClass=SearchFunctionalityTestData.class, 
			dataProvider="positiveSearchFunctionalityData")
	public void positiveSearchFunctionalityTest(String product) {		
		Actions action = new Actions(driver);
		WebElement searchTxtbox = driver.findElement(By.id("twotabsearchtextbox"));
		String productForSearch = product;
		action.moveToElement(searchTxtbox).click().sendKeys(productForSearch).build()
		.perform();
		
		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		searchBtn.click();
		Assert.assertTrue(!driver.getTitle().contains(productForSearch));
	}
	
	@Test(enabled=true, dataProvider="negativeLoginData")
	public void negativeLoginFunctionalityTestByClickingAccountListLink(String username, 
			String password) {
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
	
	@DataProvider
	public String[][] negativeLoginData() {
		String[][] data = {	{"test12@gmail.com","test@12"},
							{"test1@gmail.com","test@1"},
							{"test123@gmail.com","test@123"}};
		return data;
	}
	
	@Test(dataProviderClass=testPkg.SearchFunctionalityData.class, 
			dataProvider="negativeSearchData")
	public void negativeSearchFunctionalityTest(String product) {
		Actions action = new Actions(driver);
		WebElement searchTxtbox = driver.findElement(By.id("twotabsearchtextbox"));
		String productForSearch = product;
		action.moveToElement(searchTxtbox).click().sendKeys(productForSearch).build()
		.perform();
		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		searchBtn.click();
		
		WebElement noResultErrorMsg = driver.findElement(By.
				xpath("//div[@class='a-row']/span[1]"));
		Assert.assertTrue(!noResultErrorMsg.isDisplayed());
	}
}
