package scriptsmodule05;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import basicOperations.ActionClass;
import basicOperations.ChildBrowser;
import basicOperations.LoginOperations;
import basicOperations.Screenshots;

import pom.HomePage;

public class ProfileHomePageDisabledField extends LoginOperations

{ 

	@Test 
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
		 ChildBrowser.ChildBrowserClose();
		hp.HomePageLogout();
		LoginOperations.LogOut();
	}

}



