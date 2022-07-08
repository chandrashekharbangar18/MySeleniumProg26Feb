package FrameProg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog3 {			// This prog same as Prog2 but in this prog we use ExcelSheet for entering the text

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
			
		
		
		WebElement searchtextBox1 = driver.findElement(By.xpath("(//input[@name='s'])[1]"));
		WebElement searchButton1 = driver.findElement(By.xpath("(//button[@class='button_search'])[1]"));
		
		FileInputStream file = new FileInputStream("C:\\Users\\Centium-Rahul\\eclipse-workspace\\Automation_Selenium_26Feb_Prog\\TestDataExcel\\TestExcelFile.xlsx");
		Sheet testData = WorkbookFactory.create(file).getSheet("Sheet5");
	
		searchtextBox1.sendKeys(testData.getRow(0).getCell(0).getStringCellValue());
		
		searchButton1.click();
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);

		driver.switchTo().frame("globalSqa");
		
		WebElement searchBox2 = driver.findElement(By.xpath("(//input[@name='s'])[1]"));
		WebElement searchButton2 = driver.findElement(By.xpath("(//button[@class='button_search'])[1]"));

		searchBox2.sendKeys(testData.getRow(0).getCell(1).getStringCellValue());

		searchButton2.click();
		Thread.sleep(3000);
		
		driver.close();
	}

}
