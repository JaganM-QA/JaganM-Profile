package pom;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElements

{
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="pwd")
	private WebElement password;
	
	@FindBy(id="loc")
	private WebElement location;
	
	@FindBy(id="course1")
	private WebElement checkbox;
	
	@FindBy(id="online")
	private WebElement radio;
	
	@FindBy(id="add1")
	private WebElement paddress;
	
	@FindBy(id="add2")
	private WebElement caddress;
	
	@FindBy(partialLinkText="Profile")
	private WebElement link;;
	
	@FindBy(id="home")
	  private WebElement home;
	
	//Initialization of Elements
	public HomePageElements (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	 
	//Utilization of Elements
	public void ElementUserName(String un) throws InterruptedException
	{
		username.sendKeys(un);
		Thread.sleep(2000);
	}
	
	public void ElementPassword(String pass) throws InterruptedException
	{
		password.sendKeys(pass);
		Thread.sleep(2000);
	}
	
	public void ElementLocation() throws InterruptedException
	{
		 String loc= location.getAttribute("value");
		 System.out.println(loc);
		 Thread.sleep(2000);
		 
	}
	
	public void ElementCheckbox() throws InterruptedException
		{
			checkbox.click();
			Thread.sleep(2000);
			Thread.sleep(2000);
	 
		}
	
	public void ElementRadio() throws InterruptedException
	{
		radio.click();
		Thread.sleep(2000);
 
	}
	
	public void ElementPAddress(String padd) throws InterruptedException
	{
		paddress.sendKeys(padd);
		Thread.sleep(2000);
	}
	public void ElementCAddress(String cadd) throws InterruptedException
	{
		caddress.sendKeys(cadd);
		Thread.sleep(2000);
	}
	
	public void ElementProfile() throws InterruptedException
	{
		 link.click();
		 Thread.sleep(2000);
	}
	
	public  void  ElementHome() throws InterruptedException
	{
		home.click();
		Thread.sleep(2000);
	}
}
