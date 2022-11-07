package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingIframeAndDragDropOperation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("Number of frames: "+frames.size());
		
		// Handling iframe -> 1. webElement 2. index 3. text
//		driver.findElement(By.id("draggable")); // NoSuchElementException -> without switching to iframe
		WebElement singleFrame = frames.get(0);
//		String singleFrameTxt = singleFrame.getText();
//		driver.switchTo().frame(0);
		driver.switchTo().frame(singleFrame);
//		driver.switchTo().frame(singleFrameTxt);
		WebElement dragElement = driver.findElement(By.id("draggable"));
		WebElement dropLocation = driver.findElement(By.id("droppable"));
		
		// Drag & Drop
		Actions action = new Actions(driver);
		
		// #1
		Thread.sleep(3000);
//		action.moveToElement(dragElement).clickAndHold().build().perform();
//		Thread.sleep(3000);
//		action.moveToElement(dropLocation).release().build().perform();
		
		// #2
//		action.clickAndHold(dragElement).build().perform();
//		Thread.sleep(3000);
//		action.release(dropLocation).build().perform();
		
		// #3 
//		action.clickAndHold(dragElement).release(dropLocation).build().perform();
		
		// #4
		action.dragAndDrop(dragElement, dropLocation).build().perform();
		
		Thread.sleep(3000);
		driver.close();
	}

}
