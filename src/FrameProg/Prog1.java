package FrameProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {

	public static void main(String[] args) throws InterruptedException {

		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		WebElement homeIcon = driver.findElement(By.xpath("//a[@id='tryhome']"));

				driver.switchTo().frame("iframeResult");			// Handle iframe using iframe name
/*		
				driver.switchTo().frame(0);		// Handle iframe using index
		
			WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));		// Handle iframe using xpath id
			driver.switchTo().frame(iframe);
			
				WebElement iframe1 = driver.findElement(By.xpath("//iframe[@name='iframeResult']"));		// Handle iframe using xpath name
				driver.switchTo().frame(iframe1);
*/	
		WebElement button = driver.findElement(By.xpath("//button[@type='button']"));
		
		button.click();
		Thread.sleep(3000);
//		homeIcon.click();
		
		
//		Thread.sleep(3000);
	driver.close();
//	driver.quit();
	}

}
