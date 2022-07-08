package AdvanceSeleniumProgs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleMultipleEleProg1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("Total Elements = " + links.size());
		
		System.out.println("Available Link Names :  ");
		for(int i=0;i<links.size();i++)
		{
					System.out.println(links.get(i).getText());
		}

		
//		links.get(0).click();				// click on zero th location link
		
		for(int i=0;i<links.size();i++)
		{
			String expected = "Business";	
			String actual = links.get(i).getText();
			
			if(expected.equals(actual))
			{
						links.get(i).click();
						break;
			}
		}
		System.out.println("Title = " +  driver.getTitle());

		
		
		Thread.sleep(2000);
		driver.close();
	}

}
