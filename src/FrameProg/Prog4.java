package FrameProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		
		driver.switchTo().frame("globalSqa");
		
		WebElement searchBox2 = driver.findElement(By.xpath("(//input[@id='s'])[1]"));
		searchBox2.sendKeys("Zomato");
		
		WebElement button2 = driver.findElement(By.xpath("(//button[@class='button_search'])[1]"));
		button2.click();
		
		driver.switchTo().defaultContent();
		
		WebElement searchbox1 = driver.findElement(By.xpath("(//input[@name='s'])[1]"));
		searchbox1.sendKeys("Swiggy");
		
		WebElement button1 = driver.findElement(By.xpath("(//button[@class='button_search'])[1]"));
		button1.click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
