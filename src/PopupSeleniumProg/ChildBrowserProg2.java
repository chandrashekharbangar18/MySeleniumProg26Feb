package PopupSeleniumProg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserProg2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		
		WebElement newWindowBtn = driver.findElement(By.xpath("//input[@name='NewWindow']"));
		newWindowBtn.click();
		
		Set<String> wids = driver.getWindowHandles();
		
		Iterator<String> itr = wids.iterator();
		
		String win []  =  new String[10];
		System.out.println("Total Windows = " + wids.size());
		
		for(int i=0;i<  wids.size();i++)
		{
				win[i] =  itr.next();
				System.out.println(win[i]);
		}
 		
		driver.switchTo().window(win[0]);
		System.out.println("Title of Window 0 = " + driver.getTitle());
		Thread.sleep(1000);
		driver.close();

		driver.switchTo().window(win[1]);
		System.out.println("Title of Window 1 = " + driver.getTitle());
		driver.manage().window().maximize();
		
		WebElement searchBtn = driver.findElement(By.xpath("//i[@class=' mw-icon the7-mw-icon-search-bold']"));
		searchBtn.click();
		Thread.sleep(1000);

		WebElement searchBox1 = driver.findElement(By.xpath("//input[@class='field searchform-s']"));
		searchBox1.sendKeys("Shree");
		Thread.sleep(1000);

		WebElement searchBtn1 = driver.findElement(By.xpath("//a[@class='search-icon']"));
		searchBtn1.click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		WebElement searchBox2 = driver.findElement(By.xpath("//input[@id='the7-search']"));
		searchBox2.sendKeys("Ganesh");
		Thread.sleep(1000);

		WebElement searchBtn2 = driver.findElement(By.xpath("//a[@class='submit']"));
		searchBtn2.click();
		Thread.sleep(1000);
		
		driver.navigate().back();

		WebElement youtubeBtn = driver.findElement(By.xpath("(//i[@class='fa-fw fab fa-youtube'])[1]"));
		youtubeBtn.click();
		Thread.sleep(1000);
   
		driver.close();



	}

}
