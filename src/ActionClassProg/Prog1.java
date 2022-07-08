package ActionClassProg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prog1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		
		WebElement dropDown = driver.findElement(By.xpath("//button[normalize-space( text())='Select']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(dropDown).click().build().perform();
		Thread.sleep(3000);

		for(int i=0;i<8;i++)
		{
				Thread.sleep(1000);
				act.sendKeys(Keys.DOWN).build().perform();
		}

		act.sendKeys(Keys.ENTER).build().perform();	
		
	//	act.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
	
		System.out.println("Elements = " + dropDown.getText());
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
