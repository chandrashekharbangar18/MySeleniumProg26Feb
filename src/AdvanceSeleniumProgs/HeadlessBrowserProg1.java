package AdvanceSeleniumProgs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowserProg1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeOptions abc1 =  new ChromeOptions();
		abc1.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(abc1);
		
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		WebElement searchBox =driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.sendKeys("nare");
		Thread.sleep(1000);
		
		List<WebElement> autoSuggests = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		System.out.println("Total search Results = "  +  autoSuggests.size());
		
		System.out.println("Searched Results : " );
		for(int i=0;i<autoSuggests.size();i++)
		{
				System.out.println(autoSuggests.get(i).getText());
		}
		
		// Click on perticular result

		for(int i=0;i<autoSuggests.size();i++)
		{
			String expt = "Narendra Modi\n"
					+ "Prime Minister of India";
			
			String act = autoSuggests.get(i).getText();
			if(expt.equals(act))
			{
					Thread.sleep(1000);	
					JavascriptExecutor jse = ((JavascriptExecutor)driver);
					jse.executeScript("arguments[0].click()",autoSuggests.get(i));
		//			autoSuggests.get(i).click();
					break;
			}
			
		}
//		Thread.sleep(4000);
		driver.close();
	}

}
