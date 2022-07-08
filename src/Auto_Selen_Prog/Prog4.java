package Auto_Selen_Prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog4 {

	public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.get("https://is.rediff.com/signup/register");
			Thread.sleep(2000);

			// Xpath by Attribute
			 driver.findElement(By.xpath("//input[@name='fullname']")).sendKeys("Albus Severus Potter");
			Thread.sleep(2000);

			// Xpath by Text
			String LableName = driver.findElement(By.xpath("//div[text()='Date of Birth']")).getText();
			System.out.println("Lable Name  =  "  + LableName);
		
			// Xpath by contains method
			driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("albus123@gmail.com");
					//	Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Admin123@");
					//		Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name='repass']")).sendKeys("Admin123@");
					//		Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[contains(@id,'signup_city')]")).sendKeys("Pune");
					//	Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[contains(@id,'school')]")).sendKeys("SSSKMV");
					//		Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[contains(@id,'college')]")).sendKeys("SRES COE KOPARGAON");
			Thread.sleep(4000);
 
			// Xpath by Index
		//	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Rohit Beriwala");
					//	Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@type='submit']")).click();
//			Thread.sleep(2000);
			
			Thread.sleep(5000);

//			driver.findElement(By.xpath("//a[text()='Privacy Policy']")).click();
//			Thread.sleep(2000);
				
			driver.close();
	}

}
