package Auto_Selen_Prog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	//	Thread.sleep(2000);
		
		driver.get("https://www.google.co.in/");
	//	Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
/*
		System.out.println("Title =  "  +  driver.getTitle());
		
		String a = "Googlea";
		 String b = driver.getTitle();
		
		if(a.equals(b))
		{
				System.out.println("PAssed");
		}
		else 
		{
				System.out.println("Failed");
		}
		*/
		driver.close();
		
	}

}
