package Auto_Selen_Prog;

			// How to create Screenshot in Selenium

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import javax.swing.text.DefaultEditorKit.CopyAction;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File dest = new File("C:\\Users\\Centium-Rahul\\eclipse-workspace\\Automation_Selenium_26Feb_Prog\\Screenshot Imgs/photo1.jpg");
		
		org.openqa.selenium.io.FileHandler.copy(source, dest);
		//FileHandler.copy(source,dest);
		
		driver.close();
	}
}
