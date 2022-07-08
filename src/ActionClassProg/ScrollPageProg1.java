package ActionClassProg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPageProg1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver  =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(1000);
		
		WebElement topstoriesLink = driver.findElement(By.xpath("//span[text()='Top Stories']")); 
		
//		WebElement paymentLink = driver.findElement(By.xpath("//a[text()='Payments']")); 
//		paymentLink.click();
		
		JavascriptExecutor jse = ((JavascriptExecutor)driver);
//		jse.executeScript("window.scrollBy(0,1000)");
		
//		jse.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//a[text()='Corporate Information']")));
		
		jse.executeScript("arguments[0].scrollIntoView();",topstoriesLink);
		
//		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		Thread.sleep(5000);
		driver.close();
		
	
	}
}

