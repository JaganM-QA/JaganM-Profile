package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basicOperations.LoginOperations;

public class HomeDisableFields  extends LoginOperations
{

	//Declaration of Elements
	 
	@FindBy(id="name")
	private WebElement name;
	
	@FindBy(id="mob")
	private WebElement mobile;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="home")
	private WebElement home;
	
	//Initialization of Elements
	
	public HomeDisableFields (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization of Elements
	
	public HomeDisableFields(String nm) throws InterruptedException
	{
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("document.getElementById('name')");
		 name.sendKeys(nm);
		Thread.sleep(2000);
	}
	public void DisabledMobile(String mob) throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("document.getElementById('mob')");
		mobile.sendKeys(mob);
		Thread.sleep(2000);
	}
	
	public void DisabledEmail(String em) throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("document.getElementById('em')");
		email.sendKeys(em);
		Thread.sleep(2000);
	}
	
	public void DisabledHome() throws InterruptedException
	{
		home.click();
		Thread.sleep(2000);
	}

	public void DisabledName(String nm) {
		 
		name.sendKeys(nm);
	}

	 
}
