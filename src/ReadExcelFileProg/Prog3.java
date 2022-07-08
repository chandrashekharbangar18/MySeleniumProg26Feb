package ReadExcelFileProg;

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
import org.openqa.selenium.support.ui.Select;

public class Prog3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver  driver =  new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://is.rediff.com/signup/register");
						
			WebElement fName = driver.findElement(By.xpath("//input[@name= 'fullname']"));
			WebElement emailID = driver.findElement(By.xpath("//input[@name= 'emailid']"));
			WebElement pass = driver.findElement(By.xpath("//input[@name= 'pass']"));
			WebElement rPass = driver.findElement(By.xpath("//input[@name= 'repass']"));
			WebElement genderMale = driver.findElement(By.xpath("//input[@value= 'm']"));
	//		WebElement genderFemale = driver.findElement(By.xpath("//input[@value= 'f']"));

			WebElement day = driver.findElement(By.xpath("//select[@name= 'date_day']"));
			WebElement month = driver.findElement(By.xpath("//select[@name= 'date_mon']"));
			WebElement year = driver.findElement(By.xpath("//select[@name= 'Date_Year']"));
			
			WebElement location = driver.findElement(By.xpath("//input[@id= 'signup_city']"));
			WebElement school = driver.findElement(By.xpath("//input[@id= 'school']"));
			WebElement college = driver.findElement(By.xpath("//input[@id= 'college']"));
			
			WebElement captcha = driver.findElement(By.xpath("//input[@id= 'fld_captcha']"));
			
			WebElement signInButton = driver.findElement(By.xpath("//input[@type= 'submit']"));

			FileInputStream file =  new FileInputStream("C:\\Users\\rahul\\eclipse-workspace\\Automation_Selenium_26Feb_Prog\\TestDataExcel1\\TestExcelFile.xlsx");
			Sheet testData = WorkbookFactory.create(file).getSheet("Sheet4");
			
			fName.sendKeys(testData.getRow(0).getCell(0).getStringCellValue());
			emailID.sendKeys(testData.getRow(0).getCell(1).getStringCellValue());
			pass.sendKeys(testData.getRow(0).getCell(2).getStringCellValue());
			rPass.sendKeys(testData.getRow(0).getCell(3).getStringCellValue());
	//		Thread.sleep(3000);
			
			genderMale.click();
			
			Select s1 = new Select(day);
			s1.selectByVisibleText(testData.getRow(1).getCell(0).getStringCellValue());
			
			Select s2 = new Select(month);
			s2.selectByVisibleText(testData.getRow(1).getCell(1).getStringCellValue());
			
			Select s3 = new Select(year);
			s3.selectByVisibleText(testData.getRow(1).getCell(2).getStringCellValue());
			Thread.sleep(2000);

			location.sendKeys(testData.getRow(1).getCell(3).getStringCellValue());
			school.sendKeys(testData.getRow(2).getCell(0).getStringCellValue());
			college.sendKeys(testData.getRow(2).getCell(1).getStringCellValue());
			Thread.sleep(2000);

			captcha.sendKeys(testData.getRow(2).getCell(2).getStringCellValue());
			signInButton.click();
			
			Thread.sleep(2000);
			driver.close();
			
	}

}
