package Waits_in_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitProg1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait");
/*		
		WebElement btn1 = driver.findElement(By.xpath("//button[@id='alert']"));
		btn1.click();
//		Thread.sleep(5000);
		
		WebDriverWait w1 = new WebDriverWait(driver, 5);
		w1.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
*/
/*		
		WebElement btn2 = driver.findElement(By.xpath("//button[@id='populate-text']"));
		btn2.click();
		
		WebElement changedLabel = driver.findElement(By.xpath("//h2[@id='h2']"));
		
		WebDriverWait w2 = new WebDriverWait(driver, 15);
		w2.until(ExpectedConditions.textToBePresentInElement(changedLabel, "Selenium Webdriver"));
*/
/*		
		WebElement btn3 = driver.findElement(By.xpath("//button[@id='display-other-button']"));
		btn3.click();
		
		WebElement hiddenBtn = driver.findElement(By.xpath("//button[@id='hidden']"));
		
		WebDriverWait w3 = new WebDriverWait(driver, 15);
		w3.until(ExpectedConditions.visibilityOfAllElements(hiddenBtn));
*/	
/*	
		WebElement btn4 = driver.findElement(By.xpath("//button[@id='enable-button']"));
		btn4.click();
		
		WebElement disableBtn = driver.findElement(By.xpath("//button[@id='disable']"));
		
		WebDriverWait w4 = new WebDriverWait(driver, 100);
		w4.until(ExpectedConditions.elementToBeClickable(disableBtn));
*/				
		WebElement btn5 = driver.findElement(By.xpath("//button[@id='checkbox']"));
		btn5.click();
		
		WebElement checkBtn = driver.findElement(By.xpath("//input[@id='ch']"));
		
		WebDriverWait w5 = new WebDriverWait(driver, 100);
		w5.until(ExpectedConditions.elementToBeSelected(checkBtn));
			
		driver.close();
}
}