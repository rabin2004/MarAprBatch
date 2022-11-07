package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertAndWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://demo.guru99.com/test/delete_customer.php");
//		
//		WebElement customerIdTxtField = driver.findElement(By.name("cusid"));
//		customerIdTxtField.sendKeys("test12");
//		WebElement submitBtn = driver.findElement(By.name("submit"));
//		submitBtn.click(); // alert/pop-up/java pop-up opens up
//		Thread.sleep(3000);
		
		// before handling alert -> UnhandledAlertException: unexpected alert open: {Alert text : Do you really want to delete this Customer?}
//		driver.findElement(By.name("res")).click();
		
		// handling alert
//		String alertMsg1 = driver.switchTo().alert().getText();
//		System.out.println("Alert 1: "+alertMsg1);
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
//		String alertMsg2 = driver.switchTo().alert().getText();
//		System.out.println("Alert 2: "+alertMsg2);
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
		
//		customerIdTxtField.sendKeys("test12"); // StaleElementReferenceException: stale element reference: element is not attached to the page document
//		driver.findElement(By.name("cusid")).sendKeys("test");
//		Thread.sleep(3000);
//		driver.findElement(By.name("res")).click();
		
		//Handling windows
		driver.get("http://the-internet.herokuapp.com/windows");	
		String parentWindowHandle = driver.getWindowHandle();
		driver.findElement(By.linkText("Click Here")).click(); // parent window
		String expectedWindowHandle = driver.getWindowHandle();
		System.out.println("Is driver's control on same window? "+
		parentWindowHandle.equals(expectedWindowHandle));
		System.out.println(parentWindowHandle);
		System.out.println(expectedWindowHandle);
		
		// before switching to child window
//		driver.findElement(By.xpath("//h3[text()='New Window']")); // NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":"//h3[text()='New Window']"}
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println("Number of open windows: "+handles.size());
		Iterator<String> it = handles.iterator();
//		String parentWindowHanlde1 = it.next();
//		System.out.println("Is driver's control on same window? "+
//				parentWindowHandle.equals(parentWindowHanlde1));
//		String childWindowHandle = it.next();
//		System.out.println("Child window handle: "+childWindowHandle);
//		
//		// after switching to child window
//		driver.switchTo().window(childWindowHandle);
//		WebElement header = driver.findElement(By.xpath("//h3[text()='New Window']"));
//		System.out.println(header.getText());
//		
//		
//		
//		Thread.sleep(3000);
//		driver.close(); // close() -> will close window, driver controls
////		driver.quit(); // quit() -> close all window opened driver instance
//		
//		// to fall back to parent window -> need explicit switch though only one window left
//		driver.switchTo().window(parentWindowHanlde1);
//		driver.close();
		
		while(it.hasNext()) {
			String handle = it.next();
			driver.switchTo().window(handle);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.close();
		}
	}

}
