package basicOperations;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
 
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pom.LogOutOperations;
import pom.Loginpage;

public class LoginOperations implements Constant_Values
{

	public static WebDriver driver;
	@BeforeTest
	public static void LogIn() throws EncryptedDocumentException, IOException, InterruptedException
	{
		System.setProperty(key, value);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	 
		String un = Excel.excelData("Login", 1, 0);
		String pwd = Excel.excelData("Login", 1, 1);
		//String fpwd = Excel.excelData("ForgotPassword", 1, 0);
 
		Loginpage lp = new Loginpage(driver);
		lp.ProfileLogin(un);
		lp.ProfilePassword(pwd);
		//lp.ForgotPassword(fpwd);
		//lp.Facebook();
		//lp.Linkedin();
		lp.Sumbit();
		//lp.Mail();
	  
	}
	
	@AfterTest
	public static void LogOut() throws InterruptedException, IOException
	{
		 
		Thread.sleep(3000);
		LogOutOperations lo = new LogOutOperations(driver);
		
		 lo.LogoutRelogin();
		 Thread.sleep(2000);
		 
		 AlertMessages.CancelAlert();
		 Thread.sleep(2000);
		 Screenshots.screenshot();
		Thread.sleep(2000);
		  
		 lo.LogoutRelogin();
		 Thread.sleep(2000);
		 
		 AlertMessages.ReloginAlert();
		 Thread.sleep(4000);
		 Screenshots.screenshot();
		Thread.sleep(2000);
	 
		//driver.quit();
		driver.close();
	}
	 
}
