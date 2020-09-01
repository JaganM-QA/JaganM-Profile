package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 

public class AboutMe
{
	//Declaration of Elements
	
		static WebDriver driver;
		@FindBy(xpath="//a[contains(.,'About Me')]")
		private WebElement aboutme;
		
		@FindBy(id="Logout")
		private WebElement logout;
		
		@FindBy(id="Re-login")
		private WebElement relogin;
		
		@FindBy(id="Cancel")
		private WebElement cancel;
		
		
		//Initialization of Elements
		public AboutMe (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		
		//Utilization of Elements
		public void AboutMeMenu() throws InterruptedException, IOException
		{
			aboutme.click();
			Thread.sleep(2000);
		}
		
		public void AboutMeLogout() throws InterruptedException, IOException
		{
			logout.click();
			Thread.sleep(2000);
		}
		
	 
}
