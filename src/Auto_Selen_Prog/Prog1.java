package Auto_Selen_Prog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {

	public static void main(String[] args) throws InterruptedException {

	//	System.setProperty("webdriver.chrome.driver ", "chromedriver.exe");
		WebDriver driver =  new ChromeDriver();   // Opening chrome driver	
		Thread.sleep(2000);		
		
		driver.manage().window().maximize();  		// maximize the chrome driver
		Thread.sleep(3000);		
		
//		driver.manage().window().minimize();  		// minimize the chrome driver
//		Thread.sleep(3000);	
	
		
		driver.get("https://www.amazon.in/");  		// URL opening
		Thread.sleep(3000);										//  After opening URL wait upto 3 secs...

/*		driver.navigate().to("https://www.amazon.in/");
    	Thread.sleep(3000);	
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);	
*/
		driver.navigate().to("https://www.google.co.in/");  		// navigate from one url to another
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.youtube.com/");			// navigate from one url to another
		Thread.sleep(3000);
		
		driver.navigate().back();			// Going back to previous URL
		Thread.sleep(3000);
		
		driver.navigate().forward(); 			 //Going back to original URL
		Thread.sleep(3000);
		
		driver.navigate().refresh();   			// refresh URL
		Thread.sleep(3000);

    driver.close();													// Close chrome driver
    	
	}

}
