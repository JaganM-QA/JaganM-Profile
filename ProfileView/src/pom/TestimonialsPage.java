package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestimonialsPage
{
	//Declaration of Elements
	
	static WebDriver driver;
	@FindBy(xpath="//a[contains(.,'Testimonials')]")
	private WebElement test;
	
	
	@FindBy(id="q")
	private WebElement searchtext;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	
	@FindBy(id="Logout")
	private WebElement logout;
	
	@FindBy(id="Re-login")
	private WebElement relogin;
	
	@FindBy(id="Cancel")
	private WebElement cancel;
	
	
	//Initialization of Elements
	public TestimonialsPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Utilization of Elements
	public void TestimonialMenu() throws InterruptedException
	{
		test.click();
		Thread.sleep(2000);
  
	}
	
	public void SearchText(String stxt)
	{
		searchtext.sendKeys(stxt);
	}
	
	public void SearchSubmit()
	{
		if(searchtext!=null)
		{
			submit.click();
		}
		else
		{
			System.out.println("Search Field is Blank");
		}
	}
	
	public void TestimonialLogout() throws InterruptedException
	{
		 
		logout.click();
		Thread.sleep(2000);
	}
}
