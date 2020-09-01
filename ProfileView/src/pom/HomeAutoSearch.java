package pom;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 

public class HomeAutoSearch
{

		//Declaration of Elements
	@FindBy(id="myInput")
		private WebElement searchtext;
		
	  @FindBy(xpath="//input[@type='submit']")
	  private WebElement submit;
	  
	  @FindBy(id="home")
	  private WebElement home;
	  
	//Initialization of Elements
	  public HomeAutoSearch (WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
 //Utilization of Elements
		 
	  		public void HomeAutoSearchText(String stxt)
	  		{
			searchtext.sendKeys(stxt);
			 
	  		}
 
			public  void  AutosearchSubmit() throws InterruptedException
			{
				submit.click();
				Thread.sleep(2000);
			}
			
			public  void  AutosearchHome() throws InterruptedException
			{
				home.click();
				Thread.sleep(2000);
			}
}
