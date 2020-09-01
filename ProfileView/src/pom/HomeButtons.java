package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeButtons
{
	
	//Declaration of Elements
			
			@FindBy(xpath="(//input[@type='checkbox'])[2]")
			private WebElement checkbox;
			
			@FindBy(id="chkbtn1")
			private WebElement checkbutton1;
			
			@FindBy(xpath="(//input[@type='radio'])[2]")
			private WebElement radiobtn;
			
			@FindBy(id="chkbtn2")
			private WebElement checkbutton2;
			
			 @FindBy(id="home")
			  private WebElement home;
			
			//Initialization of Elements
			public HomeButtons (WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//Utilization of Elements
			 
	  		public void HomeButtonCheckBox() throws InterruptedException
	  		{
	  			checkbox.click();
	  			Thread.sleep(2000);
	  				 
	  		}
	  		
	  		public void HomeButtonCheckButton1() throws InterruptedException
	  		{
	  			checkbutton1.click();
	  			Thread.sleep(2000);
			 
	  		}
	  		
	  		public void HomeButtonRadio() throws InterruptedException
	  		{
	  			radiobtn.click();
	  			Thread.sleep(2000);
			 
	  		}
	  		
	  		public void HomeButtonCheckButton2() throws InterruptedException
	  		{
	  			checkbutton2.click();
	  			Thread.sleep(2000);
			 
	  		}
	  		
	  		public  void  ButtonHome() throws InterruptedException
			{
	  			home.click();
				Thread.sleep(2000);
			}
}
