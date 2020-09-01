package pom;
 
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class ResumePage
{
	//Declaration of Elements
	
			static WebDriver driver;
			@FindBy(xpath="//a[contains(.,'Resume')]")
			private WebElement resume;
			
			@FindBy(id="Logout")
			private WebElement logout;
			
			@FindBy(id="Re-login")
			private WebElement relogin;
			
			@FindBy(id="Cancel")
			private WebElement cancel;
			
			
			//Initialization of Elements
			public ResumePage (WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			
			//Utilization of Elements
			public void ResumeMenu() throws InterruptedException
			{
				resume.click();
				Thread.sleep(2000);
//				JavascriptExecutor js = (JavascriptExecutor)driver;
//				Thread.sleep(2000);
//				js.executeScript("window.scrollBy(0,5000)");
//				Thread.sleep(2000);
				
			}
			
			public void ResumeLogout() throws InterruptedException
			{
				 
				logout.click();
				Thread.sleep(2000);
			}
			
		 
}
