package scriptsmodule04;

import java.io.IOException;

import org.testng.annotations.Test;

import basicOperations.ActionClass;
import basicOperations.AlertMessages;
import basicOperations.ChildBrowser;
import basicOperations.LoginOperations;
import basicOperations.Screenshots;
import pom.HomeButtons;
import pom.HomePage;

public class ProfileHomePageButtons extends LoginOperations

{ 

	@Test
	public void ProfileHomeButton() throws InterruptedException, IOException
	{
		LoginOperations.LogIn();
		ActionClass.ActionClassHome();
		HomePage hp = new HomePage(driver);
		hp.HomepageButtons();
		ChildBrowser.ChildBrowserOpen();
		Thread.sleep(2000);
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
}

