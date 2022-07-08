package AdvanceSeleniumProgs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadProg1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		WebElement uploadBtn = driver.findElement(By.xpath("//input[@type='file']"));
		WebElement pressBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		
		uploadBtn.sendKeys("C:\\Users\\rahul\\OneDrive\\Desktop\\abc.txt");
//		Thread.sleep(5000);
	
		pressBtn.click();
		Thread.sleep(2000);

		driver.close();
	}

}
