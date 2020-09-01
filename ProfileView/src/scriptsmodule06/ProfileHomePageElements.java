package scriptsmodule06;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import basicOperations.ActionClass;
import basicOperations.ChildBrowser;
import basicOperations.LoginOperations;
import basicOperations.SearchFunction;
import pom.HomePage;
import pom.HomePageElements;

public class ProfileHomePageElements extends LoginOperations

{

	@Test 
	public void ProfileHomeElementsText() throws EncryptedDocumentException, IOException, InterruptedException
	{

		//LoginOperations.LogIn();
		ActionClass.ActionClassHome();
		HomePage hp = new HomePage(driver);
		hp.HomepageElements();
		ChildBrowser.ChildBrowserOpen();
		SearchFunction.ElementText();
		HomePageElements hpe = new HomePageElements(driver);
		hpe.ElementHome();
		ChildBrowser.ChildBrowserClose();
		hp.HomePageLogout();
		//LoginOperations.LogOut();
	}
}

