package seleniumBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenshotConcept {
	static Properties prop;

	public static void main(String[] args) throws IOException {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(new File("C:\\Users\\User\\eclipse-workspace"
					+ "\\MarAprBatch\\src\\seleniumBasics\\config.properties"));
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.setProperty(prop.getProperty("chromeKey"), prop.getProperty("chromePath"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Long.valueOf(prop.getProperty("pageLoadTimeOut"))
				, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Long.valueOf(prop.getProperty("implicitWait"))
				, TimeUnit.SECONDS); 
		driver.get(prop.getProperty("testAppUrl"));
		
		driver.findElement(By.id("nav-link-accountList")).click();
		
		// Taking screenshot -> common IO jar files(https://commons.apache.org/proper/commons-io/download_io.cgi) -> of page or of an element -> 1. getScreenshotAs()	2. copy raw file into an image
		File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file1, new File("C:\\Users\\User\\eclipse-workspace\\MarAprBatch"
				+ "\\src\\seleniumBasics\\signInPage.png"));
		
		driver.findElement(By.id("ap_email")).sendKeys("test@gmail.com");
		
		driver.findElement(By.id("continue")).click();
		File file2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file2, new File("C:\\Users\\User\\eclipse-workspace\\MarAprBatch"
				+ "\\src\\seleniumBasics\\enterPasswordPage.png"));
		
		driver.findElement(By.id("ap_password")).sendKeys("test12");
		
		driver.findElement(By.id("signInSubmit")).click();
		File file3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file3, new File("C:\\Users\\User\\eclipse-workspace\\MarAprBatch"
				+ "\\src\\seleniumBasics\\OTPmessagePage.png"));
		
//		WebElement signInErrorMessage = driver.findElement(By.className("a-list-item"));
		WebElement OTPmessage = driver.findElement(By.className("a-text-normal"));
		
		if(OTPmessage.isDisplayed()) {
			System.out.println("Negative Sign-in functionality test: Passed");
			System.out.println("Actual error message: "+OTPmessage.getText());
			File file4 = OTPmessage.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file4, new File("C:\\Users\\User\\eclipse-workspace\\MarAprBatch"
					+ "\\src\\seleniumBasics\\OTPmessageElement.png"));
		}else {
			System.err.println("Negative Sign-in functionality test: Failed");
		}

		driver.close();
	}

}
