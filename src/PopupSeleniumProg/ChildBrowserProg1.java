package PopupSeleniumProg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserProg1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.aspsnippets.com/demos/1102/");
		
		WebElement openPopupBtn = driver.findElement(By.xpath("//input[@value='Open Popup']"));
		openPopupBtn.click();
		
		Set<String> windows= driver.getWindowHandles();		// Storing window addresses in collection
		
		Iterator<String> itr = windows.iterator();				// Use of Cursor
		
		String win []  =  new String [10];
		
//		int  win []  =  new int [10];

		System.out.println("Total Windows = "  +  windows.size());
		
		for(int i=0;i<  windows.size();i++)
		{
				win[i] =  itr.next();
				System.out.println(win[i]);
		}
		
		driver.switchTo().window(win[0]);
		System.out.println("Title of Window 0 = " + driver.getTitle());
		Thread.sleep(3000);
		driver.close();

		driver.switchTo().window(win[1]);
		System.out.println("Title of Window 1 = " + driver.getTitle());
		
		WebElement fn = driver.findElement(By.xpath("//td[contains(text(),'Fir')]"));
		WebElement ln = driver.findElement(By.xpath("//td[contains(text(),'Las')]"));
		
		System.out.println("First Name = "		+ fn.getText());
		System.out.println("Last Name = "		+ ln.getText());

		
		Thread.sleep(3000);
		driver.close();

	
		//		driver.quit();
	}

}
