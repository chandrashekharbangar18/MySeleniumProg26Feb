package AdvanceSeleniumProgs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class MultipleBrowserProg1 {

	public static void main(String[] args) {

/*		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
*/		
		// FireFox Driver i.e.  Gecko Driver
		
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");

		
		// Microsoft Edge Driver
/*		
		System.setProperty("webdriver.msedge.driver","Edgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
*/		
		
/*	
		// Opera Driver
		
		System.setProperty("webdriver.opera.driver","operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
*/
		driver.close();
		
	
	}

}
