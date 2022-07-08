package ActionClassProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropProg1 {

	public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
			
			WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
			driver.switchTo().frame(frame);
			
			WebElement img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
			WebElement img2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
//			WebElement img3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
//			WebElement img4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
						
			WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
			
			Actions act = new Actions(driver);
/*			
			// traditional way to move element
			
			act.moveToElement(img1).clickAndHold().moveToElement(trash).release().build().perform();
//			act.moveToElement(img1).clickAndHold().release(trash).build().perform();
			Thread.sleep(3000);

			act.moveToElement(img2).clickAndHold().moveToElement(trash).release().build().perform();
//			act.moveToElement(img2).clickAndHold().release(trash).build().perform();
			Thread.sleep(3000);
*/
			// short method to move element
			
			act.dragAndDrop(img1, trash).build().perform();
			act.dragAndDrop(img2, trash).build().perform();
			
			Thread.sleep(3000);
			driver.close();
	}

}
