package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementTypesAndLocationStrategy {
	
	// Selenium Automation:
		// 1. Specifically Locate the element(WebElement/WebObject/GUI(Graphical user Interface)object or element)
		// 2. Perform action
		// 3. Validate action performed
	
	// WebElements or WebObjects or GUI (Graphical User Interface) objects or elements:
				// Types:
					// 1. Text Box/Field: user can input some characters
					// 2. Button/Tab: user input to click on it
					// 3. Radio Button: user input to click to select, "Round button"
					// 4. Check box: user input to click to select, "check mark"
					// 5. Links: click takes user to different page or application
					// 6. Text: to provide informations
					// 7. Drop Down: clicking on it more options are visible -> Static or Dynamic
					// 8. Menu/Menu link: high value feature/product/flow
					// 9. Pictures/Videos:
			
			// Strategy to locate webElement:
				// Types:
					// 1. Name: value pointed mostly are unique, most commonly used
					// 2. ID: value pointed mostly are unique, most commonly used
					// 3. linkText: text of the link itself
					// 4. partial linkText: unique portion of the link
					// 5. className: mostly not unique value, mostly not helpful to identify an element alone
					// 6. tagName: generic name, not able to identify an element, but helps to identify group of element in that category
					// 7. Xpath: can be used when nothing works, copy or customizable
					// 8. Css selector: can be used when nothing works, copy or customizable

	// Understanding DOM:
	// <input type="text" name="userName" size="10" pb-role="username">
		// 1. tagName - input
		// 2. attribute - type/name/size/pb-role
		// 3. value - text/userName/10/username
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe"); // windows -> file extension needs to be provided | mac -> path capture enough, no need extension
		
		// 2. Instance/object of driver (ChromeDriver) class -> Polymorphism - WebDriver
		WebDriver driver = new ChromeDriver();
		
		// maximize window size
		driver.manage().window().maximize();
		
		// 3. load application
		driver.get("https://www.amazon.com/");
		
		// Automation testing code
		WebElement searchTxtBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchTxtBox.sendKeys("apple");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(3000);
		// 4. close browser
		driver.close();
	}
	
	// Assignment: setup -> setup test -> handle few feature in application

}
