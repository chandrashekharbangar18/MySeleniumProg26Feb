package ActionClassProg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RelyatriAssignProg1 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='username-id']"));
		WebElement pass = driver.findElement(By.xpath("//input[@id='usr_pwd']"));
		WebElement confirmPass = driver.findElement(By.xpath("//input[@id='cnfm_pass']"));
		WebElement mobNo = driver.findElement(By.xpath("//input[@id='user-number']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='email_id']"));
		
		WebElement list = driver.findElement(By.xpath("//button[normalize-space( text())='Select']"));
		
		FileInputStream file =  new FileInputStream("C:\\Users\\rahul\\eclipse-workspace\\Automation_Selenium_26Feb_Prog\\TestDataExcel1\\TestExcelFile.xlsx");
		Sheet testData = WorkbookFactory.create(file).getSheet("Sheet6");
		
		userName.sendKeys(testData.getRow(0).getCell(0).getStringCellValue());
		pass.sendKeys(testData.getRow(0).getCell(1).getStringCellValue());
		confirmPass.sendKeys(testData.getRow(0).getCell(2).getStringCellValue());
		mobNo.sendKeys(testData.getRow(0).getCell(3).getStringCellValue());
		email.sendKeys(testData.getRow(0).getCell(4).getStringCellValue());
		Thread.sleep(4000);

		String un = userName.getAttribute("value");
		System.out.println("UserName = " + un);
		
		String ps = pass.getAttribute("value");
		System.out.println("Password = " + ps);
		
		String cps = confirmPass.getAttribute("value");
		System.out.println("Confirmed Password = " + cps);
		
		String mn = mobNo.getAttribute("value");
		System.out.println("Mobile Number = " + mn);
		
		String el = email.getAttribute("value");
		System.out.println("Mobile Number = " + el);
		
		Actions act = new Actions(driver);
		
		act.moveToElement(list).click().build().perform();
		Thread.sleep(2000);

		for(int i=0;i<8;i++)
		{
				Thread.sleep(1000);
				act.sendKeys(Keys.DOWN).build().perform();
		}
		
		act.sendKeys(Keys.ENTER).build().perform();
		
		System.out.println("Elements = " + list.getText());

		Thread.sleep(2000);
		driver.close();		
	}

}
