package Auto_Selen_Prog;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	String a = 	driver.getTitle();																// Get title of the Web
///		System.out.println("Title =  " + driver.getTitle());  	// Print Title
	
	System.out.println("Title =  "  +  a);
		
		String exptTitle = "Facebook – log in or sign up";  		// Expected result
		
		String actTitle = driver.getTitle();
		
		if(exptTitle.equals(actTitle))
		{
					System.out.println("Passed");
		}
		else
		{	
					System.out.println("Failed");
		}
		
	String currenrURL = driver.getCurrentUrl();
	System.out.println("Currenr URL of the Page =  "  +  currenrURL);
		
		driver.close();

		
		// Cricbuzz.com	
	}

}
