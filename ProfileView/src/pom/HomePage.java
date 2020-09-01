package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	
	//Declaration of Elements
	 
  @FindBy(xpath="//a[contains(text(),'Autosearch')]")
  private WebElement autosearch;
  
  @FindBy(xpath="//a[contains(text(),'Buttons')]")
  private WebElement buttons;
  
  @FindBy(xpath="//a[contains(text(),'Disabled Fields')]")
  private WebElement disabledfield;
  
  @FindBy(xpath="//a[contains(text(),'Elements')]")
  private WebElement elements;
  
  @FindBy(xpath="//a[contains(text(),'File Upload')]")
  private WebElement fileupload;
  
  @FindBy(xpath="//a[contains(text(),'Tutorials')]")
  private WebElement tutorials;
  
  @FindBy(id="Logout")
	private WebElement logout;
	
	@FindBy(id="Re-login")
	private WebElement relogin;
   
	//Initialization of Elements
	
	public HomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilizations of Elements
	 
		 
		public  void  HomepageAutosearch() throws InterruptedException
		{
			autosearch.click();
			Thread.sleep(2000);
		}
		
		public  void  HomepageButtons() throws InterruptedException
		{
			buttons.click();
			Thread.sleep(2000);
		}
		
		
		public  void  HomepageDisabledFields() throws InterruptedException
		{
			disabledfield.click();
			Thread.sleep(2000);
		}
		
		public  void  HomepageElements() throws InterruptedException
		{
			elements.click();
			Thread.sleep(2000);
		}
		
		public  void  HomepageFileUpload() throws InterruptedException
		{
			fileupload.click();
			Thread.sleep(2000);
		}
		
		public  void  HomepageTutorials() throws InterruptedException
		{
			tutorials.click();
			Thread.sleep(2000);
		}
		
		public void HomePageLogout() throws InterruptedException, IOException
		{
			logout.click();
			Thread.sleep(2000);
		}
	}
 
