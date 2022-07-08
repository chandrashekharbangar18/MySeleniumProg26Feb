package Auto_Selen_Prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog8 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://is.rediff.com/signup/register");
		Thread.sleep(2000);
		
		WebElement yourFullNameTextbox = driver.findElement(By.xpath("//input[@name='fullname']"));
		yourFullNameTextbox.sendKeys("Chandrashekhar Bangar");
//		Thread.sleep(2000);
		
		WebElement yourEmail_ID_Textbox = driver.findElement(By.xpath("//input[@name='emailid']"));
		yourEmail_ID_Textbox.sendKeys("csbangar75@gmail.com");
	//	Thread.sleep(2000);
		
		WebElement New_Password_Textbox = driver.findElement(By.xpath("//input[@id='pass']"));
		New_Password_Textbox.sendKeys("Admin123@");
	//	Thread.sleep(2000);
		
		WebElement Retype_Password_Textbox = driver.findElement(By.xpath("//input[@id='repass']"));
		Retype_Password_Textbox.sendKeys("Admin123@");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='m']")).click();
	//	Thread.sleep(2000);
		
		WebElement daylistBox = driver.findElement(By.xpath("//select[@id='date_day']"));
		
		Select s1 = new Select(daylistBox);
		s1.selectByVisibleText("18");
		
		WebElement monthlistBox = driver.findElement(By.xpath("//select[@id='date_mon']"));
		
		Select s2 = new Select(monthlistBox);
		s2.selectByVisibleText("JUN");
		
		WebElement yearlistBox = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		
		Select s3 = new Select(yearlistBox);
		s3.selectByVisibleText("1993");
	//	Thread.sleep(2000);

		WebElement Location_Textbox = driver.findElement(By.xpath("//input[@name='city']"));
		Location_Textbox.sendKeys("Kopargaon");
		
		WebElement School_Textbox = driver.findElement(By.xpath("//input[@id='school']"));
		School_Textbox.sendKeys("Sou Sushilamai Kale Vidyalaya Bhojade");
		
		WebElement College_Textbox = driver.findElement(By.xpath("//input[@id='college']"));
		College_Textbox.sendKeys("SRES COE Kopargaon");
		
		WebElement Captcha_Textbox = driver.findElement(By.xpath("//input[@id='fld_captcha']"));
		Captcha_Textbox.sendKeys("762220");
		
		 WebElement SignUpButton = driver.findElement(By.xpath("//input[@value='Sign up']"));
		 SignUpButton.click();
		
		 Thread.sleep(2000);
		 
		driver.close();
	}

}
