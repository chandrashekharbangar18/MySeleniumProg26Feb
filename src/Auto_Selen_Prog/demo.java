package Auto_Selen_Prog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.get("https://en.wikipedia.org/");
		Thread.sleep(3000);
		
//		driver.get("https://google.com/");
//		Thread.sleep(3000);
/*		
		driver.navigate().to("https://news.google.com/");
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);

		driver.navigate().forward();
		Thread.sleep(3000);

		driver.navigate().refresh();
		Thread.sleep(3000);
*/
		
		driver.close();
	}

}
