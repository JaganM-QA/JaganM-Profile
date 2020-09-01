package scriptstestingpurpose;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import basicOperations.ActionClass;
import basicOperations.AlertMessages;
import basicOperations.ChildBrowser;
import basicOperations.FileUpload;
import basicOperations.LoginOperations;
import basicOperations.Screenshots;
import basicOperations.SearchFunction;
import pom.FileUploadForm;
import pom.HomeButtons;
import pom.HomePage;
import pom.HomePageElements;
import pom.Tutorials;

public class ProfileHomePageMultipleMethods extends LoginOperations
{
	@Test
	public void ProfileHomeAutoSearch() throws InterruptedException, IOException
	{
		LoginOperations.LogIn();
		ActionClass.ActionClassHome();
		HomePage hp = new HomePage(driver);
		hp.HomepageAutosearch();
		ChildBrowser.ChildBrowserOpen();
		SearchFunction.AutoSearching();
		Screenshots.screenshot();
		ChildBrowser.ChildBrowserClose();
		hp.HomePageLogout();
		//LoginOperations.LogOut();
	}
	
	@Test(enabled = false)
 	public void ProfileHomeButton() throws InterruptedException, IOException
 	{
		 LoginOperations.LogIn();
		 ActionClass.ActionClassHome();
		 HomePage hp = new HomePage(driver);
		  hp.HomepageButtons();
		 ChildBrowser.ChildBrowserOpen();
		 
		 HomeButtons hbs = new HomeButtons(driver);
		 hbs.HomeButtonCheckButton1(); 
		 AlertMessages.AcceptAlert();
		 hbs.HomeButtonCheckBox();
		 hbs.HomeButtonCheckButton2();
		 AlertMessages.AcceptAlert();
		 hbs.HomeButtonRadio();
		 Screenshots.screenshot();
		 hbs.ButtonHome();
		// ChildBrowser.ChildBrowserClose();
		 hp.HomePageLogout();
		 LoginOperations.LogOut();
 	}
	
	@Test(enabled = false)
	public  void ProfileHomeDisabledText() throws EncryptedDocumentException, IOException, InterruptedException
			{
			  
			LoginOperations.LogIn();
			 ActionClass.ActionClassHome();
			 HomePage hp = new HomePage(driver);
			 hp.HomepageDisabledFields();
			 ChildBrowser.ChildBrowserOpen();
			 
			 JavascriptExecutor js = (JavascriptExecutor)driver;
		     js.executeScript("document.getElementById('name').value='Jagan'");
		     Thread.sleep(2000);
		     js.executeScript("document.getElementById('mob').value='9945382213'");
		     Thread.sleep(2000);
		     js.executeScript("document.getElementById('email').value='jagan14gee@gmail.com'");
		     Thread.sleep(2000);
		     Screenshots.screenshot();
		      js.executeScript("document.getElementById('name').value=' '");
		     Thread.sleep(2000);
		     
		     js.executeScript("document.getElementById('mob').value=' '");
		     Thread.sleep(2000);
		     
		     js.executeScript("document.getElementById('email').value=' '");
		     Thread.sleep(2000);
		     Screenshots.screenshot();
		   //ChildBrowser.ChildBrowserClose();
		     hp.HomePageLogout();
		     LoginOperations.LogOut();
	       }
	
	@Test(enabled = false)
	 public   void ProfileHomeElementsText() throws EncryptedDocumentException, IOException, InterruptedException
		{
		 
		 LoginOperations.LogIn();
		 ActionClass.ActionClassHome();
		 HomePage hp = new HomePage(driver);
		 hp.HomepageElements();
		 ChildBrowser.ChildBrowserOpen();
		 SearchFunction.ElementText();
		 HomePageElements hpe = new HomePageElements(driver);
		 hpe.ElementHome();
	  ChildBrowser.ChildBrowserClose();
		 hp.HomePageLogout();
		 LoginOperations.LogOut();
     }
	
	@Test(enabled = false)
	public  void ProfileHomeFileUploading() throws EncryptedDocumentException, IOException, InterruptedException
	{
	 
		LoginOperations.LogIn();
		ActionClass.ActionClassHome();
		HomePage hp = new HomePage(driver);
		hp.HomepageFileUpload();
		ChildBrowser.ChildBrowserOpen();
		FileUpload.FileUploadCancel();
		Screenshots.screenshot();
		FileUpload.FileUploadAccept();
		Screenshots.screenshot();
		FileUploadForm fu = new FileUploadForm(driver);
		fu.FileHome();
	ChildBrowser.ChildBrowserClose();
		hp.HomePageLogout();
		LoginOperations.LogOut();
	}
	@Test(enabled = false)
	public  void ProfileVideoTutorials() throws InterruptedException, IOException
	{
		LoginOperations.LogIn(); 
		ActionClass.ActionClassHome();
		HomePage hp = new HomePage(driver);
		hp.HomepageTutorials();
		ChildBrowser.ChildBrowserOpen();
		ActionClass.ActionClassVideo();
		Tutorials tv = new Tutorials(driver);
		tv.TutorialVideoHome();
	   ChildBrowser.ChildBrowserClose();
	   	hp.HomePageLogout();
		//LoginOperations.LogOut();

	}

}
