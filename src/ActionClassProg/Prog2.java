package ActionClassProg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prog2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
		// handling right click

		WebElement rightClickBtn = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act = new Actions(driver);
		
		act.contextClick(rightClickBtn).build().perform();
		Thread.sleep(2000);
		
		WebElement copyBtn = driver.findElement(By.xpath("//span[text()='Copy']"));  // click on copy btn
		copyBtn.click();
		Thread.sleep(2000);

		// handling alert popup after clicking on copy btn
		
		Alert alt1 = driver.switchTo().alert();
		String txt1 = alt1.getText();
		System.out.println("Popup Msg after copy button click = " +  txt1);
		alt1.accept();
		
		// handling double click

		WebElement doubleClickBtn = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(doubleClickBtn).build().perform();
		Thread.sleep(3000);

		// handling alert popup after clicking on double click btn
		
				Alert alt2 = driver.switchTo().alert();
				String txt2 = alt2.getText();
				System.out.println("Popup Msg after clicking on double click btn= " +  txt2);
				alt2.accept();
				
				
		Thread.sleep(2000);
		driver.close();
	}

}
