package ListBoxProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog2 {

	// is our list is multi selectable
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		Thread.sleep(2000);
		
		driver.switchTo().frame("iframeResult");
		
		WebElement cars = driver.findElement(By.xpath("//select[@id='cars']"));
		Select s1 = new Select(cars);
		
		System.out.println(s1.isMultiple());
		
		s1.selectByVisibleText("Volvo");
		s1.selectByVisibleText("Audi");
		Thread.sleep(3000);

		s1.deselectByVisibleText("Volvo");
		
		
		Thread.sleep(2000);
		driver.close();
	}

}
