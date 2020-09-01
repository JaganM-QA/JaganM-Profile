package pom;

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage
{

	//Declaration of Elements
	static WebDriver driver;
	@FindBy(xpath="//a[contains(.,'Contact')]")
	private WebElement contact;
	
	@FindBy(xpath="//a[contains(.,'Post Your Enquries Here!')]")
	private WebElement enquiries;
	 
	@FindBy(id="Logout")
	private WebElement logout;
	
	@FindBy(id="Re-login")
	private WebElement relogin;
	
	@FindBy(id="Cancel")
	private WebElement cancel;
	
	//Initialization of Elements
	public ContactPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization of Elements
	
	public void ContactMenu() throws InterruptedException
	{
		contact.click();
		Thread.sleep(2000);
		
	}
	
	public void ContactEnquiry() throws InterruptedException
	{
		enquiries.click();
		Thread.sleep(2000);
	}
	
	public void ContactLogout() throws InterruptedException
	{
		 logout.click();
		Thread.sleep(2000);
	}
	
}
