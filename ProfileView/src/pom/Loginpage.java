package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage
{
//Declaration of Elements
	
	static WebDriver driver;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//a[contains(.,'SHOW')]")
	private WebElement show;
	
	
	@FindBy(xpath="//a[contains(.,'Forgot Password?')]")
	private WebElement forgot;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	
	@FindBy(xpath="//div[@class='facebook']")
	private WebElement facebook;
	
	@FindBy(xpath="//span[contains(.,'Linkedin')]")
	private WebElement linkedin;
	
	@FindBy(xpath="//a[contains(.,'Signup Now')]")
	private WebElement signup;
	
	@FindBy(xpath="//a[contains(.,'jagan14gee@gmail.com')]")
	private WebElement mail;
	 
	@FindBy(id="Logout")
	private WebElement logout;
	
	//Initialization of Elements
	
	public Loginpage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
 //Utilization of Elements
	
	public  void ProfileLogin(String un) throws InterruptedException
	{		
			if(username.isEnabled()) 
			{
			username.sendKeys(un);
			Thread.sleep(2000);
			}
			else
			{
				System.out.println("Email or Phone Number Field is Disabled");
			}
			
			 
	}
	
	public  void ProfilePassword(String pwd) throws InterruptedException
	{		
		if(password.isEnabled())
		{
			password.sendKeys(pwd);
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("Password Field is Disabled");
		}
		
	}
	
	public void Show() throws InterruptedException
	{
		
		show.click();
		Thread.sleep(2000);
		String s = show.getAttribute("value");
		Thread.sleep(2000);
		System.out.println(s);
		Thread.sleep(2000);
	}
	
	public  void ForgotPassword(String fpwd) throws InterruptedException
	{		forgot.sendKeys(fpwd);
			Thread.sleep(2000);
	}
	 
	public void Sumbit() throws InterruptedException 
	{
		  		submit.click();
				Thread.sleep(2000);
		 
	}

	public void Facebook() throws InterruptedException
	{
		facebook.click();
		Thread.sleep(2000);
	}
	
	public void Linkedin() throws InterruptedException
	{
		 linkedin.click();
		Thread.sleep(2000);
	}
	
	public void Mail() throws InterruptedException
	{
		 mail.click();
		Thread.sleep(2000);
	}
	
	public void Logout() throws InterruptedException
	{
		  logout.click();
		  Thread.sleep(2000);
	}
	
	 
}


