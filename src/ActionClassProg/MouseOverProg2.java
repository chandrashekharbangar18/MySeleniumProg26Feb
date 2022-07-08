package ActionClassProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverProg2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver  =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement primeLink = driver.findElement(By.xpath("//span[text()='Prime']"));
		Actions act = new Actions(driver);
		act.moveToElement(primeLink).build().perform();
		Thread.sleep(2000);
		
		WebElement joinPrimeLink = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
		joinPrimeLink.click();
		
		Thread.sleep(2000);
		driver.close();
	}

}
