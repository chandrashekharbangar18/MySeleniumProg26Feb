package FrameProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2 {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
			
		
		WebElement searchtextBox1 = driver.findElement(By.xpath("(//input[@name='s'])[1]"));
		searchtextBox1.sendKeys("What is Unit Testing ???");
		Thread.sleep(4000);
		
		WebElement searchButton1 = driver.findElement(By.xpath("(//button[@class='button_search'])[1]"));
		searchButton1.click();
		Thread.sleep(4000);

		driver.navigate().back();
		Thread.sleep(4000);

		driver.switchTo().frame("globalSqa");
		WebElement searchBox2 = driver.findElement(By.xpath("(//input[@name='s'])[1]"));
		searchBox2.sendKeys("What is Integration Testing ???");

		WebElement searchButton2 = driver.findElement(By.xpath("(//button[@class='button_search'])[1]"));
		searchButton2.click();
		
		Thread.sleep(4000);
		driver.close();
	}
}
