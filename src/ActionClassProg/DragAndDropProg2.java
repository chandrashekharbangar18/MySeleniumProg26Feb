package ActionClassProg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropProg2 {

	public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement element5000_a = driver.findElement(By.xpath("//li[@class='block13 ui-draggable']//a[@class='button button-orange']"));
		WebElement bank = driver.findElement(By.xpath("//li[@class='block14 ui-draggable']//a[@class='button button-orange']"));	
		WebElement accountDebitSide = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		WebElement amountDebitSide = driver.findElement(By.xpath("//ol[@class='field13 ui-droppable ui-sortable' and @id='amt7']"));

		WebElement element5000_b = driver.findElement(By.xpath("(//li[@data-id='2']//a[@class='button button-orange'])[2]"));
		WebElement sales = driver.findElement(By.xpath("//li[@id='credit1']"));
		WebElement accountCreditSide = driver.findElement(By.xpath("//ol[@id='loan']"));
		WebElement amountCreditSide = driver.findElement(By.xpath("//ol[@id='amt8']"));

		Actions a = new Actions(driver);
		
		a.dragAndDrop(element5000_a, amountDebitSide).build().perform();
		a.dragAndDrop(element5000_b, amountCreditSide).build().perform();
	
		Thread.sleep(3000);		

		a.dragAndDrop(bank, accountDebitSide).build().perform();
		a.dragAndDrop(sales, accountCreditSide).build().perform();
		
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);		
		
		WebElement result = driver.findElement(By.xpath("//div[@class='table4_result' and @id='equal']"));
		
		String exptRes = "Perfect!";
		String actualRes = result.getText();
		
		if(exptRes.equals(actualRes))
//		if(exptRes == actualRes)
		{
				System.out.println("Test case Pass");
		}
		else
		{
			System.out.println("Test case Fail");
		}
		driver.close();
	}

}
