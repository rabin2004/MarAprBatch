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

public class FewKeyWordsPriorityEnabled {
	WebDriver driver;
	
	@BeforeMethod(alwaysRun=true)
	public void initilization() {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.get("https://amazon.com");
	}
	
	@AfterMethod(alwaysRun=true)
	public void tearDown() {
		driver.close();
	}
	
	// Keywords -> 
	// 1. enabled (true->test case will run | false->test case will be ignored | default is true)
	// 2. priority -> beginning value 0 (executes first)
		// Note: if priority not mentioned -> execution will follow alphabetic order of test method name
	// 3. dataProvider -> for data driven testing
	// 4. groups -> groups={"group1","group2"} -> group execution through xml file
	// 5. alwaysRun -> if true (method will execute no matter what) 
	
	@Test(enabled=true, priority=2, groups=("Smoke"))
	public void negativeLoginFunctionalityTestByClickingAccountListLink() {
		driver.findElement(By.id("nav-link-accountList")).click();
		Assert.assertEquals(driver.getTitle(), "Amazon Sign-In");
		driver.findElement(By.id("ap_email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("test@12");
		driver.findElement(By.id("signInSubmit")).click();
		WebElement loginErrorMsg = driver.findElement(By.xpath("//span[@class='a-list-item']"));
		Assert.assertTrue(loginErrorMsg.isDisplayed());
		System.out.println(loginErrorMsg.getText());
	}
	
	@Test(enabled=true, priority=0, groups={"Regression","Release1.0","login functionality"})
	public void negativeLoginFunctionalityTestByClickingYourAccount() {
		Actions action = new Actions(driver);
		WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
		action.moveToElement(accountList).build().perform();
		action.moveToElement(driver.findElement(By.linkText("Account"))).click().build().perform();
		driver.findElement(By.xpath("//div[@data-card-identifier='YourOrders']")).click();
		Assert.assertEquals(driver.getTitle(), "Amazon Sign-In");
		driver.findElement(By.id("ap_email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("test@12");
		driver.findElement(By.id("signInSubmit")).click();
		WebElement loginErrorMsg = driver.findElement(By.xpath("//span[@class='a-list-item']"));
		Assert.assertTrue(loginErrorMsg.isDisplayed());
		System.out.println(loginErrorMsg.getText());
	}
	
	@Test(enabled=true, priority=1,groups= {"End to End", "Release1.0","login functionality"})
	public void negativeLoginFunctionalityTestByClickingSignInbutton() {
		Actions action = new Actions(driver);
		WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
		action.moveToElement(accountList).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//*[text()='Sign in']")))
		.click().build().perform();
		Assert.assertEquals(driver.getTitle(), "Amazon Sign-In");
		driver.findElement(By.id("ap_email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("test@12");
		driver.findElement(By.id("signInSubmit")).click();
		WebElement loginErrorMsg = driver.findElement(By.xpath("//span[@class='a-list-item']"));
		Assert.assertTrue(loginErrorMsg.isDisplayed());
		System.out.println(loginErrorMsg.getText());
	}
}
