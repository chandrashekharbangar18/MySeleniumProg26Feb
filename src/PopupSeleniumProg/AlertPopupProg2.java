package PopupSeleniumProg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupProg2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
/*		
		 WebElement alertBoxBtn1 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		 alertBoxBtn1.click();
		 Thread.sleep(3000);

		Alert alt = driver.switchTo().alert();
		String txt1 = alt.getText();
		System.out.println("Alert Msg = " + txt1);
		alt.accept();
		
*/	

/*		
		WebElement alertWithOkCancelBtn1 = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		alertWithOkCancelBtn1.click();
		Thread.sleep(3000);

		 WebElement alertBoxBtn2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		 alertBoxBtn2.click();
		Thread.sleep(3000);

		Alert pop1 = driver.switchTo().alert();
		String popmsg = pop1.getText();
		System.out.println("Alert Msg = " + popmsg);
//		pop1.accept();
		pop1.dismiss();
*/
		
		WebElement alertWithTxtBoxBtn1 = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		alertWithTxtBoxBtn1.click();
		Thread.sleep(3000);

		WebElement promptBoxBtn1 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		promptBoxBtn1.click();
		Thread.sleep(3000);

		Alert popp1 = driver.switchTo().alert();
		String msgpop1 = popp1.getText();
		System.out.println("PopMsg= " +  msgpop1);
		
		popp1.sendKeys("Shree");
		Thread.sleep(3000);

		popp1.accept();

		WebElement printMsg = driver.findElement(By.xpath("//p[@id='demo1']"));
		String searchMsg = printMsg.getText();
		System.out.println("My Search Result = " + searchMsg);
		
		Thread.sleep(3000);
		driver.close();
	}

}
