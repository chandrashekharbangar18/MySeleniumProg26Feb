package Auto_Selen_Prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog6 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://is.rediff.com/signup/register");
		Thread.sleep(2000);
		
		WebElement yourFullNameTextbox = driver.findElement(By.xpath("//input[@name='fullname']"));
		yourFullNameTextbox.sendKeys("Vidya Balan");
		Thread.sleep(2000);

		WebElement dayListBox = driver.findElement(By.xpath("//select[@name='date_day']"));
		
		//Select s = new Select(dayListBox);
		Select s = new Select(dayListBox);
		Thread.sleep(2000);

		s.selectByIndex(12); 		
		Thread.sleep(2000);

		s.selectByValue("21");	
		Thread.sleep(2000);

		s.selectByVisibleText("25");		// Mostly Used Method
		Thread.sleep(2000);

		driver.close();
	}

}
