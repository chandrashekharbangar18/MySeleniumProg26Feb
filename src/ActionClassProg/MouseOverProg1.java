package ActionClassProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverProg1 {

	public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			WebDriver driver  =  new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.americangolf.com/");
			
			WebElement aboutUsLink = driver.findElement(By.xpath("//a[text()='About Us']"));
			
			Actions act  =  new Actions(driver);
			act.moveToElement(aboutUsLink).build().perform();

			Thread.sleep(3000);
			WebElement careerLink = driver.findElement(By.xpath("//li[@class='leaf']//a[text()='Careers']"));
			careerLink.click();
			
			driver.close();
	}

}
