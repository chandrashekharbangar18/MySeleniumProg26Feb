package Auto_Selen_Prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog7 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("http://megrecruitment.nic.in/rpa/register.htm");
		driver.get("https://ssc.nic.in/Registration/Home");
//		Thread.sleep(2000);
		
		WebElement Email_ID_textbox = driver.findElement(By.xpath("//input[@id='EmailID']"));
//		Email_ID_textbox.sendKeys("ronaldwhisley18@gmail.com");
		Thread.sleep(2000);
		
		System.out.println("Is Displayed = "  + Email_ID_textbox.isDisplayed());
		System.out.println("Is Enabled = "  + Email_ID_textbox.isEnabled());
		System.out.println("Is Selected = "  + Email_ID_textbox.isSelected());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Email_ID_textbox.sendKeys("ronaldwhisley18@gmail.com");
		System.out.println("Is Displayed = "  + Email_ID_textbox.isDisplayed());
		System.out.println("Is Enabled = "  + Email_ID_textbox.isEnabled());
		System.out.println("Is Selected = "  + Email_ID_textbox.isSelected());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		
		WebElement New_Name_OR_Changed_Name = driver.findElement(By.xpath("//input[@id='NewName']"));
		System.out.println("Is Displayed = "  + New_Name_OR_Changed_Name.isDisplayed());
		System.out.println("Is Enabled = "  + New_Name_OR_Changed_Name.isEnabled());
		System.out.println("Is Selected = "  + New_Name_OR_Changed_Name.isSelected());
		
		
//		Email_ID_textbox.is
//		driver.close();
	}

}
