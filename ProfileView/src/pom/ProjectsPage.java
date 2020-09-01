package pom;
 
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
import basicOperations.Screenshots;

  
public class ProjectsPage 

{
	
		//Declaration of Elements
	 
	
		static WebDriver driver;
		@FindBy(xpath="//a[contains(.,'Projects')]")
		private WebElement project;
		
		
		@FindBy(xpath="//button[@type='cms']")
		private WebElement itescms;
		
		@FindBy(xpath="//button[@type='tds']")
		private WebElement itestds;
		
		@FindBy(xpath="//button[@type='img']")
		private WebElement itesimg;
		
		@FindBy(xpath="//button[@type='ddc']")
		private WebElement itesddc;
		
	 
		@FindBy(xpath="//button[@type='cp']")
		private WebElement itescp;
		
		@FindBy(xpath="//button[@type='hts']")
		private WebElement btthts;
		
		@FindBy(xpath="//button[@type='imt']")
		private WebElement bttimt;
		
		
		@FindBy(id="Logout")
		private WebElement logout;
		
		@FindBy(id="Re-login")
		private WebElement relogin;
		
		@FindBy(id="Cancel")
		private WebElement cancel;
	
		//Initialization of Elements
		
		public ProjectsPage  (WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
		
		
		//Utilization of Elements
		
		public void ProjectMenu() throws InterruptedException
		{
			project.click();
			Thread.sleep(2000);
		}
		
		public void ProjectITESCMS() throws InterruptedException, IOException
		{
			
			itescms.click();
			Thread.sleep(2000);
		 
			 Screenshots.screenshot();
			
			Thread.sleep(2000);
		}
		
		public void ProjectITESTDS() throws InterruptedException, IOException
		{
			 
			itestds.click();
			Thread.sleep(2000);
	 
			Thread.sleep(2000);
			Screenshots.screenshot();
			Thread.sleep(2000);
		}
		
		public void ProjectITESIMG() throws InterruptedException, IOException
		{
			itesimg.click();
			 
			Thread.sleep(2000);
			Screenshots.screenshot();
			Thread.sleep(2000);
		}
		
		public void ProjectITESDDC() throws InterruptedException, IOException
		{
			itesddc.click();
			Thread.sleep(2000);
			 
			Thread.sleep(2000);
			Screenshots.screenshot();
			Thread.sleep(2000);
		}
		
		public void ProjectITESCP() throws InterruptedException, IOException
		{
			itescp.click();
			Thread.sleep(2000);
			 
			Thread.sleep(2000);
			Screenshots.screenshot();
			Thread.sleep(2000);
		}
		
		public void ProjectBTTHTS() throws InterruptedException, IOException
		{
			btthts.click();
			Thread.sleep(2000);
			 
			Thread.sleep(2000);
			Screenshots.screenshot();
			Thread.sleep(2000);
		}
		
		public void ProjectBTTIMS() throws InterruptedException, IOException
		{
			bttimt.click();
			Thread.sleep(2000);
		 
			Thread.sleep(2000);
			Screenshots.screenshot();
			Thread.sleep(2000);
		}
		
		public void ProjectLogout() throws InterruptedException
		{
			logout.click();
			Thread.sleep(2000);
		}
		
		
}
