package FrameProg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog5 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
			WebElement search = driver.findElement(By.xpath("//input[@id='s']"));
			search.sendKeys("Harry");
			Thread.sleep(2000);
			driver.switchTo().frame("globalSqa");
			WebElement search1 =
			driver.findElement(By.xpath("//input[@id='s']"));
			search1.sendKeys("Harry");
			Thread.sleep(2000);
			
			search1.clear();
			search1.sendKeys("Potter");
			driver.switchTo().parentFrame();
			search.sendKeys(" Potter");
			Thread.sleep(2000);
			WebElement searchBtn = driver.findElement(By.xpath("//button[@class='button_search']"));
			WebElement scrollUpto = 	driver.findElement(By.xpath("//div[@class='header_mail']"));
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", searchBtn);
			
			driver.close();
	}

}
