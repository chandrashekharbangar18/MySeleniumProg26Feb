package Auto_Selen_Prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog5 {

	public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver =  new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://is.rediff.com/signup/register");
			Thread.sleep(2000);
			
			// Locator ==>  Xpath
			driver.findElement(By.xpath("//input[@name='fullname']")).sendKeys("Hari Bhau Patil");
			
			// Locator ==>  TagName  (By.tagName)
	//		driver.findElement(By.tagName("input")).sendKeys("Professor Snape");
	//		Thread.sleep(2000);

			// Locator ==>  ID  (By.id)
	//		driver.findElement(By.id("fullname")).sendKeys("Albus DumbleDore");
	//		Thread.sleep(2000);
			
			// Locator ==>  Class Name  (By.className)
	//		driver.findElement(By.className("txtbox1")).sendKeys("Velocity Institute");
	//		Thread.sleep(2000);

		/*	
			// Locator ==>  Name  (By.className)
			driver.findElement(By.name();
		
			//Locator ==> linktext
			driver.findElement(By.linkText("CompleteLinkText"));
			
			//Locator ==>  partiallinktext
			driver.findElement(By.partialLinkText("Complete"));
*/			
			
			driver.close();
					
	}

}
