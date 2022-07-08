package ActionClassProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverProg3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver  =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);

		WebElement loginBtnlink = driver.findElement(By.xpath("//a[text()='Login']"));
		
		Actions act  =  new Actions(driver);
		act.moveToElement(loginBtnlink).build().perform();
		Thread.sleep(2000);

		WebElement giftCardLink = driver.findElement(By.xpath("//div[text()='Gift Cards']"));
		giftCardLink.click();
		
		Thread.sleep(2000);
		driver.close();
	}

}
