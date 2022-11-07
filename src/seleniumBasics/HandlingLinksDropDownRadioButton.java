package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingLinksDropDownRadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		
		//Handling links
//		WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
//		registerLink.click();
//		String actualRegisterPageUrl = driver.getCurrentUrl();
//		String expectedRegisterPageUrl = "https://demo.guru99.com/test/newtours/register.php";
//		// Verification
//		if(actualRegisterPageUrl.equals(expectedRegisterPageUrl)) {
//			System.out.println("Register link Test: Passed");
//		}else {
//			System.out.println("Register link test: Failed");
//			System.out.println("Actual: "+actualRegisterPageUrl);
//			System.out.println("Expected: "+expectedRegisterPageUrl);
//		}
//		
//		WebElement flightLink = driver.findElement(By.linkText("Flights"));
//		Thread.sleep(2000);
//		flightLink.click();
//		String actualFlightPageUrl = driver.getCurrentUrl();
//		String expectedFlightPageUrl = "https://demo.guru99.com/test/newtours/flights.php";
//		// Verification
//		if(actualFlightPageUrl.equals(expectedFlightPageUrl)) {
//			System.out.println("Flight link Test: Passed");
//		}else {
//			System.out.println("Flight link test: Failed"); // Defect
//			System.out.println("Actual: "+actualFlightPageUrl);
//			System.out.println("Expected: "+expectedFlightPageUrl);
//		}
		
//		WebElement businessTravelLink = driver.findElement(By.partialLinkText("Business Travel"));
//		Thread.sleep(2000);
//		businessTravelLink.click();
//		String actualBusinessTravelPageUrl = driver.getCurrentUrl();
//		String expectedBusinessTravelPageUrl = "http://businesstravel.about.com/mbody.htm?PM=78_101_T&cob=home";
//		// Verification
//		if(actualBusinessTravelPageUrl.equals(expectedBusinessTravelPageUrl)) {
//			System.out.println("BusinessTravel link Test: Passed");
//		}else {
//			System.out.println("BusinessTravel link test: Failed"); // Defect
//			System.out.println("Actual: "+actualBusinessTravelPageUrl);
//			System.out.println("Expected: "+expectedBusinessTravelPageUrl);
//		}
		
		WebElement flightLink = driver.findElement(By.linkText("Flights"));
		flightLink.click();
		Thread.sleep(5000);
		
		// Handling static drop down: -> Select class - drop element will have to have "select" as tagname -> 1. visible txt 2. index 3. value
//		WebElement passengerCount = driver.findElement(By.name("passCount"));
//		Select select = new Select(passengerCount);
//		select.selectByVisibleText("4");
//		Thread.sleep(2000);
//		select.selectByIndex(2);
//		Thread.sleep(2000);
//		select.selectByValue("1");
//		
//		Select select1 = new Select(driver.findElement(By.name("airline")));
//		select1.selectByVisibleText("Pangea Airlines");
//		Thread.sleep(2000);
//		select1.selectByIndex(1);
		
		// Handling Radio buttons
		// Using copied Xpath & Css selector as a locator
		WebElement oneWayRadioBtn = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td"
				+ "/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"));
		WebElement roundTripRadioBtn = driver.findElement(By.cssSelector("body > div:nth-child(5) > table > tbody > tr > "
				+ "td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > "
				+ "tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > b > font > "
				+ "input[type=radio]:nth-child(1)"));
		Thread.sleep(2000);
		oneWayRadioBtn.click();
		Thread.sleep(2000);
		roundTripRadioBtn.click();
		
		WebElement firstClassRadioBtn = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody"
				+ "/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]"));
		WebElement businessClassRadioBtn = driver.findElement(By.cssSelector("body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) "
				+ "> table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5)"
				+ " > td > form > table > tbody > tr:nth-child(9) > td:nth-child(2) > font > font > input[type=radio]:nth-child(2)"));
		WebElement economyClassRadioBtn = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/"
				+ "table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/input"));
		Thread.sleep(2000);
		firstClassRadioBtn.click();
		Thread.sleep(2000);
		economyClassRadioBtn.click();
		Thread.sleep(2000);
		businessClassRadioBtn.click();
		
		Thread.sleep(2000);
		driver.close();
	}

}
