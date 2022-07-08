package PopupSeleniumProg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupProg1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(2000);
		
		WebElement SignBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		SignBtn.click();
		Thread.sleep(2000);

		Alert alt1 = driver.switchTo().alert();
		
		String str = alt1.getText();
		System.out.println("Msg = " + str);
		
		alt1.accept();
		
		
		Thread.sleep(2000);
		driver.close();
	}

}
