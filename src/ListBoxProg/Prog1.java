package ListBoxProg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

			// Get All Options Present on List Box	 

public class Prog1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://is.rediff.com/signup/register");
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='date_mon']"));
		Select s1 = new Select(month);
		List<WebElement> options = s1.getOptions();  // getOptions()  this metod returns all the elements present in the list 
		
		System.out.println();
	
		// Month List Print
		for (int i=0;i<=12;i++)
		{
				System.out.print(options.get(i).getText() + "   ");
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		// For each Loop
		for(WebElement value : options)
		{
				System.out.print(value.getText() + "    ");
		}
		
		// Year List Print
		WebElement yearlist = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		Select s2 = new Select(yearlist);
		List<WebElement> opt2 = s2.getOptions();
		
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		for(WebElement val1 : opt2)
		{
					System.out.print(val1.getText() + "   ");
		}
		
		// Day List Print
		WebElement daylist = driver.findElement(By.xpath("//select[@id='date_day']"));
				Select s3 = new Select(daylist);
				List<WebElement> opt3 = s3.getOptions();
				
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------------------------");
				for(WebElement val3 : opt3)
				{
							System.out.print(val3.getText() + "   ");
				}
	
		driver.close();
	}

}
