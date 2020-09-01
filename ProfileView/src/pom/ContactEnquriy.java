package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactEnquriy 
{
	//Declaration of Elements
		static WebDriver driver;
		
		@FindBy(id="fname")
		private WebElement fname;
		
		@FindBy(id="lname")
		private WebElement lname;
		
		@FindBy(id="country")
		private WebElement country;
		
		@FindBy(id="subject")
		private WebElement subject;
		
		@FindBy(id="Submit")
		private WebElement Submit;
		
		@FindBy(id="Cancel")
		private WebElement Cancel;
		
		@FindBy(id="Refresh")
		private WebElement Refresh;
		
		@FindBy(id="Upload")
		private WebElement Upload;
		
		//Initialization of Elements
		
		public ContactEnquriy (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Utilization of Elements
		
		public void EnquiryFname(String fn) throws InterruptedException
		{
			fname.sendKeys(fn);
			Thread.sleep(2000);
			
		}
		
		public void EnquiryLname(String ln) throws InterruptedException
		{
			lname.sendKeys(ln);
			Thread.sleep(2000);
			
		}
		
		public void EnquiryContry(String cou) throws InterruptedException
		{
			country.sendKeys(cou);
			Thread.sleep(2000);
			
		}
		
		public void EnquirySubject(String sub) throws InterruptedException
		{
			subject.sendKeys(sub);
			Thread.sleep(2000);
			
		}
		
		public void EnquirySubmit() throws InterruptedException
		{
			Submit.click();
			Thread.sleep(2000);
		 
		}
		
		public void EnquiryCancel() throws InterruptedException
		{
			Cancel.click();
			Thread.sleep(2000);
			
		}
		
		public void EnquiryRefresh() throws InterruptedException
		{
			Refresh.click();
			Thread.sleep(2000);
			
		}
		
		public void EnquiryFileUpload() throws InterruptedException
		{
			Upload.click();
			Thread.sleep(2000);
			
		}
		
		
		public void Alert()
		{
			driver.switchTo().alert().accept();
		}

}
