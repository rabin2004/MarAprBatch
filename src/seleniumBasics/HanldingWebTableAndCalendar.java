package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HanldingWebTableAndCalendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://demo.guru99.com/test/newtours/index.php");
//		
//		for(int i=1; i<=5; i++) {
//			WebElement offerDestination = driver.findElement(By.xpath("//table[@width='270']"
//					+ "/tbody/tr["+String.valueOf(i)+"]/td[1]/font"));
//			WebElement offerPrice = driver.findElement(By.xpath("//table[@width='270']"
//					+ "/tbody/tr["+String.valueOf(i)+"]/td[2]/div/font"));
//			System.out.println("Destination: "+offerDestination.getText());
//			System.out.println("Price: "+offerPrice.getText());
//		}
//		
//		System.out.println("---------------------------");
//		
//		WebElement offerTable = driver.findElement(By.xpath("//table[@width='270']/tbody"));
//		for(int i=1; i<=5; i++) {
//			WebElement offerDestination = offerTable.findElement(By.xpath
//					("//tr["+String.valueOf(i)+"]/td[1]/font"));
//			WebElement offerPrice = offerTable.findElement(By.xpath
//					("//tr["+String.valueOf(i)+"]/td[2]/div/font"));
//			System.out.println("Destination: "+offerDestination.getText());
//			System.out.println("Price: "+offerPrice.getText());
//		}
		
		driver.get("https://www.timeanddate.com/calendar/");
		WebElement august = driver.findElement(By.xpath("//table[@id='mct1']/tbody/tr[10]/td[3]"
				+ "/table/tbody"));
		for(int i=2; i<=7; i++) { // to traverse through row in a month
			for(int j=1; j<=7; j++) {
				WebElement days = august.findElement(By.xpath("//tr["+String.valueOf(i)+"]"
						+ "/td["+String.valueOf(j)+"]"));
				System.out.println(days.getText());
			}	
		}
		driver.close();
	}

}
