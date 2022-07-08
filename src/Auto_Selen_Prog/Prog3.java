package Auto_Selen_Prog;




import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog3 {

	public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.google.co.in/");
			Thread.sleep(2000);
			
			
			Dimension d =  new Dimension(500, 700)		;	// Change the dimension of web page as per arg value
			driver.manage().window().setSize(d);
			
			Thread.sleep(5000);
			
			Point p  =  new Point(200, 400)			;	// Change the Position of web page as per arg value
			driver.manage().window().setPosition(p);
			
			Thread.sleep(5000);

			driver.close();
			
			
	}

}
