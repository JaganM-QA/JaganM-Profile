package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicTable
{
	
	//Declaration of Elements
	static WebDriver driver;
	@FindBy(xpath="//a[contains(.,'Dynamic Table')]")
	private WebElement dtable;
	
	@FindBy(id="addRow")
	private WebElement addrow;
	
	@FindBy(xpath="//table[@id='empTable']/tbody/tr[2]/td[2]/input")
	private WebElement empname;
	
	@FindBy(xpath="//table[@id='empTable']/tbody/tr[2]/td[3]/input")
	private WebElement empdesig;
	
	@FindBy(xpath="//table[@id='empTable']/tbody/tr[2]/td[4]/input")
	private WebElement empexp;

	@FindBy(xpath="(//input[@value='Remove'])[2]")
	private WebElement remove;
	
	@FindBy(xpath="//input[@id='bt']")
	private WebElement submit;
	
	@FindBy(xpath="//input[@id='clr']")
	private WebElement clear;
	
	@FindBy(id="Logout")
	private WebElement home;
	
	//Initialization of Elements
	public DynamicTable (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization of Elements
	public void DynamicTableHome() throws InterruptedException
	{
		dtable.click();
		Thread.sleep(2000);
	}
	
	public void DynamicTableAddEmp() throws InterruptedException
	{
		 addrow.click();
		 Thread.sleep(2000);
	}
	
	public void DynamicTableRemEmp() throws InterruptedException
	{
		remove.click();
		Thread.sleep(2000);
	}
	
	public void DynamicTableAddEmpName(String ename) throws InterruptedException
	{
		 empname.sendKeys(ename);
		 Thread.sleep(2000);
	}
	
	public void DynamicTableAddEmpDesig(String edesig) throws InterruptedException
	{
		 empdesig.sendKeys(edesig);
		 Thread.sleep(2000);
	}
	
	public void DynamicTableAddEmpExp(String eexp) throws InterruptedException
	{
		 empexp.sendKeys(eexp);
		 Thread.sleep(2000);
	}
	
	public void DynamicTableSubmit() throws InterruptedException
	{
		 submit.click();
		 Thread.sleep(2000);
	}
	
	public void DynamicTableClear() throws InterruptedException
	{
		 clear.click();
		 Thread.sleep(2000);
	}
	
	
	public void DynamicTableLogout() throws InterruptedException
	{
		home.click();
		Thread.sleep(2000);
	}
} 

