package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBoxUsingTagName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		// Using class
//		WebElement accountList = driver.findElement(By.className("nav-a nav-a-2   nav-progressive-attribute")); // org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element:
		
//		WebElement accountList = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
//		accountList.click();
//		
//		driver.findElement(By.cssSelector("#ap_email")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[2]/span/span/input"))
//		.click();
		
		// Handle checkbox
//		WebElement rememberMeCheckBox = driver.findElement(By.name("rememberMe"));
//		Thread.sleep(3000);
//		rememberMeCheckBox.click();
//		if(rememberMeCheckBox.isSelected()) {
//			System.out.println("Remember me checkbox test: Pass");
//		}else {
//			System.out.println("Remember me checkbox test: Fail");
//		}
//			
//		Thread.sleep(3000);
//		rememberMeCheckBox.click();
//		if(!rememberMeCheckBox.isSelected()) {
//			System.out.println("Remember me checkbox test: Pass");
//		}else {
//			System.out.println("Remember me checkbox test: Fail");
//		}
		
		// Using TagName -> findElements()
		List<WebElement> selectDropDowns = driver.findElements(By.tagName("select"));
		System.out.println("Number of select type drop down: "+selectDropDowns.size());
		List<WebElement> homePagelinks = driver.findElements(By.tagName("a"));
		System.out.println("Number of links in home page: "+homePagelinks.size());
		System.out.println("21th link: "+homePagelinks.get(20).getAttribute("href"));
		System.out.println("101th link: "+homePagelinks.get(100).getAttribute("href"));
		List<WebElement> inputTypeElement = driver.findElements(By.tagName("input"));
		System.out.println("Number of input type elements: "+inputTypeElement.size());
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Number of images: "+images.size());
		
		Thread.sleep(3000);
		driver.close();
	}
	
	// Assignment: Any application -> 5-6 features -> create automation script with verification point

}
