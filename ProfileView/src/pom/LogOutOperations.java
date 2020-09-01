package pom;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
import basicOperations.LoginOperations;
  
public class LogOutOperations extends LoginOperations
{

	//Declaration of Elements
	
	@FindBy(xpath="//button[contains(.,'Re-Login')]")
	private WebElement relogin;
	 
	//Initialization of Elements
	
	public LogOutOperations (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization of Elements
	
	public void LogoutRelogin() throws InterruptedException
	{
		relogin.click();
		 
		Thread.sleep(3000);
		
		
		 
	}
	
	 
}
