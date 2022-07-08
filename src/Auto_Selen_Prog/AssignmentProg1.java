package Auto_Selen_Prog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentProg1 {

	public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			
			WebElement usernameTextBox = driver.findElement(By.xpath("//input[@placeholder='Username']"));
			usernameTextBox.sendKeys("standard_user");
			
			WebElement passwordTextBox = driver.findElement(By.xpath("//input[@placeholder='Password']"));
			passwordTextBox.sendKeys("secret_sauce");
			Thread.sleep(3000);

			WebElement logInButton = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
			logInButton.click();
			
			WebElement dropList = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
	
			Select s1 = new Select(dropList);
			Thread.sleep(3000);
			s1.selectByVisibleText("Price (low to high)");
			Thread.sleep(2000);

			WebElement firstProductAddToCart = driver.findElement(By.xpath("(//button[@class='btn btn_primary btn_small btn_inventory'])[1]"));
			firstProductAddToCart.click();
			Thread.sleep(2000);

			WebElement cartButton = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
			cartButton.click();
			Thread.sleep(2000);

			WebElement removeButton = driver.findElement(By.xpath("//button[@class='btn btn_secondary btn_small cart_button']"));
			removeButton.click();
			Thread.sleep(2000);

			WebElement continueshopButton = driver.findElement(By.xpath("//button[@class='btn btn_secondary back btn_medium']"));
			continueshopButton.click();
		Thread.sleep(2000);

			WebElement dropList1 = driver.findElement(By.xpath("//select[@data-test='product_sort_container']"));
		Thread.sleep(2000);

			Select s2 = new Select(dropList1);
			Thread.sleep(3000);			
			s2.selectByVisibleText("Price (low to high)");
			Thread.sleep(2000);

			WebElement secondProductAddToCart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
			secondProductAddToCart.click();
		Thread.sleep(2000);
			
			WebElement cartButton1 = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
			cartButton1.click();
		Thread.sleep(2000);
			WebElement checkoutButton = driver.findElement(By.xpath("//button[@id='checkout']"));
			checkoutButton.click();
			
			WebElement firstNameTextBox = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
			firstNameTextBox.sendKeys("Glenn ");
			
			WebElement lastNameTextBox = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
			lastNameTextBox.sendKeys("Maxwell");
			
			WebElement postalCodeTextBox = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
			postalCodeTextBox.sendKeys("411027");
			Thread.sleep(3000);

			WebElement submitButton= driver.findElement(By.xpath("//input[@type='submit']"));
			submitButton.click();
			
			WebElement finishButton= driver.findElement(By.xpath("//button[@id='finish']"));
			finishButton.click();
		Thread.sleep(2000);

			WebElement menuButton= driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
			menuButton.click();
			Thread.sleep(2000);

			WebElement LoutBtn = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
//			abcBtn.click();
			
			JavascriptExecutor js1 = ( JavascriptExecutor)driver;
			js1.executeScript("arguments[0].click();",LoutBtn);
			
			Thread.sleep(2000);

			WebElement usernameTextBox1 = driver.findElement(By.xpath("//input[@placeholder='Username']"));
			usernameTextBox1.sendKeys("locked_out_user");
			
			WebElement passwordTextBox1 = driver.findElement(By.xpath("//input[@placeholder='Password']"));
			passwordTextBox1.sendKeys("secret_sauce");
			
			Thread.sleep(3000);

			WebElement logInButton1 = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
			logInButton1.click();
			
			WebElement errMsgs = driver.findElement(By.xpath("//h3[@data-test='error']"));
			System.out.println("Error Msgs = " + errMsgs.getText());
			
			Thread.sleep(3000);
			driver.close();
	}

}
