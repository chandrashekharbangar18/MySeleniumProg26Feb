package Auto_Selen_Prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog9 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://is.rediff.com/signup/register");
		Thread.sleep(2000);
		
		String title =  driver.getTitle();
		System.out.println("Website Title = "  + title);
		
		String expt_Title = "Rediff.com";
		String act_Title = driver.getTitle();
		 if(expt_Title.equals(act_Title))
		 {
			 		System.out.println("Test Case Passed");
		 }
		 else
		 {
			 System.out.println("Test Case Failed");
		 }
	
		WebElement rediffLink = driver.findElement(By.xpath("//a[@title='Rediff.com Home']"));
		WebElement rediffLogo = driver.findElement(By.xpath("//a[@class='ft11']"));
		WebElement NewUserLable = driver.findElement(By.xpath("//b[text()='New User? Register here']"));
		WebElement TellusLable = driver.findElement(By.xpath("//p[@class='grey1']"));
		
		WebElement YourFullnameLable = driver.findElement(By.xpath("//div[text()='Your Full name']"));
		WebElement YourFullnameTextBox = driver.findElement(By.xpath("//input[@id='fullname']"));
		YourFullnameTextBox.sendKeys("Vidya Balan");
		WebElement PlsEnterYourNameMsgTip = driver.findElement(By.xpath("//span[@id='msgtip1']"));

		WebElement YourcurrentEmailIDLable = driver.findElement(By.xpath("//div[text()='Your current email ID']"));
		WebElement YourcurrentEmailIDTextBox = driver.findElement(By.xpath("//input[@name='emailid']"));
		YourcurrentEmailIDTextBox.sendKeys("vbalan123@gmail.com");
		WebElement EmailIdFormatlable = driver.findElement(By.xpath("//p[@class='sm1 grey1']"));
		
		WebElement NewPasswordLable = driver.findElement(By.xpath("//div[text()='New password']"));
		WebElement NewPasswordTextBox = driver.findElement(By.xpath("//input[@id='pass']"));
		NewPasswordTextBox.sendKeys("Admin@123");
		
		WebElement RetypePasswordLable = driver.findElement(By.xpath("//div[text()='Retype password']"));
		WebElement RetypePasswordTextBox = driver.findElement(By.xpath("//input[@id='repass']"));
		RetypePasswordTextBox.sendKeys("Admin@123");
	
		WebElement GenderLable = driver.findElement(By.xpath("//div[text()='Gender:']"));
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@value='m']"));
		maleRadioButton.click();
		WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@value='f']"));
		femaleRadioButton.click();
		
		WebElement DateofBirthLable = driver.findElement(By.xpath("//div[text()='Date of Birth']"));
		
		WebElement DayList = driver.findElement(By.xpath("//select[@id='date_day']"));
		Select s1 = new Select(DayList);
		s1.selectByVisibleText("18");
		
		WebElement MonthList = driver.findElement(By.xpath("//select[@id='date_mon']"));
		Select s2 = new Select(MonthList);
		s2.selectByVisibleText("MAR");
		
		WebElement YearList = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		Select s3 = new Select(YearList);
		s3.selectByVisibleText("1993");
		
	
		WebElement LocationLable = driver.findElement(By.xpath("//div[text()='Location']"));
		WebElement LocationLableTextBox = driver.findElement(By.xpath("//input[@name='city']"));
		
		WebElement SchoolLable = driver.findElement(By.xpath("//div[text()='School']"));
		WebElement SchoolLableTextBox = driver.findElement(By.xpath("//input[@name='school']"));
		
		WebElement CollegeLable = driver.findElement(By.xpath("//div[text()='College']"));
		WebElement CollegeLableTextBox = driver.findElement(By.xpath("//input[@name='college']"));
		
		WebElement CaptchaLable = driver.findElement(By.xpath("//div[text()='Enter the code given in the above image']"));
		WebElement CaptchaLableTextBox = driver.findElement(By.xpath("//input[@name='fld_captcha']"));
		
		WebElement SignUpButton = driver.findElement(By.xpath("//input[@id='btn_register']"));

		
		WebElement FooterLineBox = driver.findElement(By.xpath("//div[@class='footer']"));
		
		WebElement rediffImg = driver.findElement(By.xpath("//img[@alt='rediff on the net']"));
		
		WebElement InvestorInformationLink = driver.findElement(By.xpath("//a[text()='Investor Information']"));
		WebElement AdvertisewithusLink = driver.findElement(By.xpath("//a[text()='Advertise with us']"));
		WebElement DisclaimerLink = driver.findElement(By.xpath("//a[text()='Disclaimer']"));
		WebElement PrivacyPolicyLink = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
		WebElement FeedbackLink = driver.findElement(By.xpath("//a[text()='Feedback']"));
		WebElement TermsofUseLink = driver.findElement(By.xpath("//a[text()='Terms of Use']"));
		/*
		WebElement rediffLink = driver.findElement(By.xpath(""));
		WebElement rediffLink = driver.findElement(By.xpath(""));
		WebElement rediffLink = driver.findElement(By.xpath(""));
		
	*/	
		
		int count = 0;
		
		// RediffLink
		if(rediffLink.isDisplayed())
		{
				count++;
				System.out.println("Rediff Link Element is Available");
		}
		else
		{
			System.out.println("Rediff Link Element is Unavailable");
		}
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");			

		// rediffLogo
		if(rediffLogo.isDisplayed())
		{
				count++;
				System.out.println("Rediff Logo Element is Available");
		}
		else
		{
			System.out.println("Rediff Logo Element is Unavailable");
		}
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");			

		// NewUserLable
		if(NewUserLable.isDisplayed())
		{
				count++;
				System.out.println("New User Lable Element is Available");
		}
		else
		{
			System.out.println("New User Lable Element is Unavailable");
		}	
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");			

				// TellusLable
				if(TellusLable.isDisplayed())
				{
						count++;
						System.out.println("Tell us LableElement is Available");
				}
				else
				{
					System.out.println("Rediff Link Element is Unavailable");
				}
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");			
 
				// YourFullnameLable
				if(YourFullnameLable.isDisplayed())
				{
						count++;
						System.out.println("Your Full name Lable Element is Available");
				}
				else
				{
					System.out.println("Your Full name Lable Element is Unavailable");
				}
				
				// YourFullnameTextBox
				if(YourFullnameTextBox.isDisplayed())
				{
						count++;
						System.out.println("Your Full nameTextBox Element is Available");
				}
				else
				{
					System.out.println("Your Full name TextBox Element is Unavailable");
				}	
		
				//PlsEnterYourNameMsgTip
				if(PlsEnterYourNameMsgTip.isDisplayed())
				{
						count++;
						System.out.println("Pls Enter Your Name MsgTip Available");
				}
				else
				{
					System.out.println("Pls Enter Your Name MsgTip Unvailable");

				}
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");			

				// YourcurrentEmailIDLable
				if(YourcurrentEmailIDLable.isDisplayed())
				{
						count++;
						System.out.println("Your current Email ID Lable Element is Available");
				}
				else
				{
					System.out.println("Your current Email ID Lable Element is Unavailable");
				}		
				
				//YourcurrentEmailIDTextBox
				if(YourcurrentEmailIDTextBox.isDisplayed())
				{
						count++;
						System.out.println("Your current Email ID TextBox Element is Available");
				}
				else
				{
					System.out.println("Your current Email ID TextBox Element is Unavailable");
				}		
				
				//EmailIdFormatlable
				if(EmailIdFormatlable.isDisplayed())
				{
						count++;
						System.out.println("Email Id Format lable Element is Available");
				}
				else
				{
					System.out.println("Email Id Format Lable Element is Unavailable");
				}	
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");			

				//NewPasswordLable
				if(NewPasswordLable.isDisplayed())
				{
						count++;
						System.out.println("Retype Password lable Element is Available");
				}
				else
				{
					System.out.println("Retype Password Lable Element is Unavailable");
				}	
				
				//NewPasswordTextBox
				if(NewPasswordTextBox.isDisplayed())
				{
						count++;
						System.out.println("New Password TextBox Element is Available");
				}
				else
				{
					System.out.println("New Password TextBox Element is Unavailable");
				}	
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");			

				//RetypePasswordLable
				if(RetypePasswordLable.isDisplayed())
				{
						count++;
						System.out.println("Retype Password lable Element is Available");
				}
				else
				{
					System.out.println("Retype Password Lable Element is Unavailable");
				}	
				
				//RetypePasswordTextBox
				if(RetypePasswordTextBox.isDisplayed())
				{
						count++;
						System.out.println("Retype Password TextBox Element is Available");
				}
				else
				{
					System.out.println("Retype Password TextBox Element is Unavailable");
				}	
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");			

				//GenderLable
				if(GenderLable.isDisplayed())
				{
						count++;
						System.out.println("Gender Lable Element is Available");
				}
				else
				{
					System.out.println("Gender Lable Element is Unavailable");
				}
				
				//MaleRadioButton
				if(maleRadioButton.isDisplayed())
				{
						count++;
						System.out.println("Male Radio Button  Element is Available");
				}
				else
				{
					System.out.println("Male Radio Button  Element is Unavailable");
				}
				
				//FemaleRadioButton
				if(GenderLable.isDisplayed())
				{
						count++;
						System.out.println("Female Radio Button  Element is Available");
				}
				else
				{
					System.out.println("Female Radio Button  Element is Unavailable");
				}
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");			

			//DateofBirthLable
				if(DateofBirthLable.isDisplayed())
				{
						count++;
						System.out.println("Date of Birth Lable Element is Available");
				}
				else
				{
					System.out.println("Date of Birth Lable  Element is Unavailable");
				}
				
				//DayList
				if(DayList.isDisplayed())
				{
						count++;
						System.out.println("Day List Element is Available");
				}
				else
				{
					System.out.println("Day List  Element is Unavailable");
				}
				
				//MonthList
				if(MonthList.isDisplayed())
				{
						count++;
						System.out.println("Month List Element is Available");
				}
				else
				{
					System.out.println("Month List  Element is Unavailable");
				}
				
				//YearList
				if(YearList.isDisplayed())
				{
						count++;
						System.out.println("Year List Element is Available");
				}
				else
				{
					System.out.println("Year List  Element is Unavailable");
				}	
				
	System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");			
			
		//LocationLable
		if(LocationLable.isDisplayed())
		{
				count++;
				System.out.println("Location lable Element is Available");
		}
		else
		{
			System.out.println("Location lable Element is Unavailable");
		}	
		
		//LocationLableTextBox
		if(LocationLableTextBox.isDisplayed())
		{
				count++;
				System.out.println("Location Lable TextBox Element is Available");
		}
		else
		{
			System.out.println("Location Lable TextBox Element is Unavailable");
		}	
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");			
	
		//SchoolLable
				if(SchoolLable.isDisplayed())
				{
						count++;
						System.out.println("School  lable Element is Available");
				}
				else
				{
					System.out.println("School lable Element is Unavailable");
				}	
				
				//SchoolLableTextBox
				if(SchoolLableTextBox.isDisplayed())
				{
						count++;
						System.out.println("School Lable TextBox Element is Available");
				}
				else
				{
					System.out.println("School Lable TextBox Element is Unavailable");
				}	
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");			

		//CollegeLable
		if(CollegeLable.isDisplayed())
		{
				count++;
				System.out.println("College  lable Element is Available");
		}
		else
		{
			System.out.println("College lable Element is Unavailable");
		}	
		
		//CollegeLableTextBox
		if(CollegeLableTextBox.isDisplayed())
		{
				count++;
				System.out.println("College LableText Box Element is Available");
		}
		else
		{
			System.out.println("College LableText Box Element is Unavailable");
		}
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");			

		//CaptchaLable
				if(CaptchaLable.isDisplayed())
				{
						count++;
						System.out.println("Captcha  lable Element is Available");
				}
				else
				{
					System.out.println("Captcha lable Element is Unavailable");
				}	
				
				//CaptchaLableTextBox
				if(CaptchaLableTextBox.isDisplayed())
				{
						count++;
						System.out.println("Captcha Lable TextBox Element is Available");
				}
				else
				{
					System.out.println("Captcha Lable TextBox Element is Unavailable");
				}
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");			

				//SignUpButton
				if(SignUpButton.isDisplayed())
				{
						count++;
						System.out.println("SignUp Button Element is Available");
				}
				else
				{
					System.out.println("SignUp Button Element is Unavailable");
				}
				
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");			

				//FooterLineBox
				if(FooterLineBox.isDisplayed())
				{
						count++;
						System.out.println("Footer LineBox is Available");
				}
				else
				{
					System.out.println("Footer LineBox is Unavailable");
				}
				
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");			

				//rediffImg
				if(rediffImg.isDisplayed())
				{
						count++;
						System.out.println("Rediff Img Element is Available");
				}
				else
				{
					System.out.println("Rediff Img Element is Unavailable");
				}
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");	
				
				//InvestorInformationLink
				if(InvestorInformationLink.isDisplayed())
				{
						count++;
						System.out.println("Investor Information Link Element is Available");
				}
				else
				{
					System.out.println("Investor Information Link is Unavailable");
				}
				
				//AdvertisewithusLink
				if(AdvertisewithusLink.isDisplayed())
				{
						count++;
						System.out.println("Advertise with us Link Element is Available");
				}
				else
				{
					System.out.println("Advertise with us Link is Unavailable");
				}
				
				//DisclaimerLink
				if(DisclaimerLink.isDisplayed())
				{
						count++;
						System.out.println("Disclaimer Link Element is Available");
				}
				else
				{
					System.out.println("Disclaimer Link Element is Unavailable");
				}
				
				//PrivacyPolicyLink
				if(PrivacyPolicyLink.isDisplayed())
				{
						count++;
						System.out.println("Privacy Policy Link Element is Available");
				}
				else
				{
					System.out.println("Privacy Policy Link Element is Unavailable");
				}
				
				//FeedbackLink
				if(FeedbackLink.isDisplayed())
				{
						count++;
						System.out.println("Feedback Link Element is Available");
				}
				else
				{
					System.out.println("Feedback Link  Element is Unavailable");
				}
				
				//TermsofUseLink
				if(TermsofUseLink.isDisplayed())
				{
						count++;
						System.out.println("Terms of Use Link Element is Available");
				}
				else
				{
					System.out.println("Terms of Use Link Element is Unavailable");
				}
				
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");	

				System.out.println("No of Elements Present on Rediff.com Web = " + count );

				driver.close();
	}

}
