package AdvanceSeleniumProgs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionProg1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.sendKeys("Arij");
		Thread.sleep(1000);

		List<WebElement> autoSuggest = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		System.out.println("Total Results for searched elements = " + autoSuggest.size());
		
		System.out.println("Printing Results = ");
		for(int i=0;i<autoSuggest.size();i++)
		{
					System.out.println(autoSuggest.get(i).getText());
		}
		
		// Click on perticular result
		
		for(int i=0;i<autoSuggest.size();i++)
		{
			String expt = "arijit singh age";
			String act = autoSuggest.get(i).getText();
			if(expt.equals(act))
			{
					autoSuggest.get(i).click();
					break;
			}
			
		}
		
		Thread.sleep(4000);
		driver.close();
	}

}
