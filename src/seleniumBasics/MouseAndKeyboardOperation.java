package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeyboardOperation {
	
	// Mouse & Keyboard operation -> Actions class
		// 1. Create instance of Actions class - pass driver in the constructor
		// 2. Define webElement
		// 3. action/s
		// 4. build and perform

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		Actions action = new Actions(driver);
		
		// Mouse operation
//		WebElement accountsList = driver.findElement(By.id("nav-link-accountList"));
//		Thread.sleep(3000);
//		action.moveToElement(accountsList).build().perform();
//		Thread.sleep(3000);
//		action.moveToElement(driver.findElement(By.linkText("Account")))
//		.click().build().perform();
//		System.out.println(driver.getTitle());
//		
//		Thread.sleep(3000);
//		WebElement flagIcon = driver.findElement(By.id("icp-nav-flyout"));
//		action.moveToElement(flagIcon).build().perform();
//		action.moveToElement(driver.findElement(By.linkText("español - ES")))
//		.click().build().perform();
//		System.out.println(driver.getTitle());
		
		WebElement searchTxtbox = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(3000);
		action.moveToElement(searchTxtbox).click().sendKeys("apple").build()
		.perform();
		Thread.sleep(3000);
		action.doubleClick().build().perform();
		Thread.sleep(3000);
		action.click().build().perform();
		Thread.sleep(3000);
		
		// Keyboard operation
		action.sendKeys(Keys.ENTER).build().perform();
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.id("twotabsearchtextbox")))
		.click().doubleClick().sendKeys(Keys.DELETE).sendKeys("samsung")
		.build().perform();
		Thread.sleep(3000);
		action.doubleClick().build().perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.DELETE).build().perform();
		
		Thread.sleep(3000);
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.PAGE_UP).build().perform();
		
		Thread.sleep(3000);
		driver.close();
	}

}
