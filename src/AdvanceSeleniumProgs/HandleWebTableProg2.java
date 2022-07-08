package AdvanceSeleniumProgs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTableProg2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/indices?src=moneyhome_bseIndices_more");
		
		Thread.sleep(2000);
		
		WebElement showMoreBtn = driver.findElement(By.xpath("//a[@id='showMoreLess']"));
		showMoreBtn.click();
			
//		WebElement tableName = driver.findElement(By.xpath("//b[text()='BSE INDICES']"));
//		System.out.println("Table Name =  "  +  tableName.getText());
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
		
		List<WebElement> column = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]//th"));
		
		System.out.println("Total No of Rows : =" + row.size());
		System.out.println("Total No of Columns : =" + column.size());

		System.out.println("==========================================================================");
		
		// Printing Table
		
		System.out.println("Table == >>>");
		
		for(int i=0;i<row.size();i++)
		{
				
					System.out.println(row.get(i).getText());
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
