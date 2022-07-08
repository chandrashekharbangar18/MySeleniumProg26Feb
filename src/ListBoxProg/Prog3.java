package ListBoxProg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		Thread.sleep(2000);
		
		driver.switchTo().frame("iframeResult");
		
		WebElement cars = driver.findElement(By.xpath("//select[@name='cars']"));
//		driver.findElement(By.xpath("NULL"));
		Select s1 = new Select(cars);
		
		s1.selectByVisibleText("Volvo");
		s1.selectByVisibleText("Opel");
	//	Thread.sleep(3000);

		 List<WebElement> selectedopts = s1.getAllSelectedOptions();
		// For each loop for printing selected options
		System.out.println("===================================");
		for(WebElement value : selectedopts)
		{
				System.out.println(value.getText());
		}
		System.out.println();
		System.out.println("===================================");

		// or another for loop
		
		for(int i = 0;i<selectedopts.size();i++)
		{
				System.out.println(selectedopts.get(i).getText());
		}
		System.out.println();
		System.out.println("===================================");
		
		
		WebElement firstselectedElement = s1.getFirstSelectedOption();
		System.out.println(firstselectedElement.getText());
		driver.close();
	}

}
