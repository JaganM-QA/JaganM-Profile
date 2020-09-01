package scriptstestingpurpose;

import java.io.IOException;
 import org.testng.annotations.Test;
import basicOperations.ActionClass;
import basicOperations.AlertMessages;
import basicOperations.ChildBrowser;
 import basicOperations.LoginOperations;
import basicOperations.Screenshots;
import basicOperations.SearchFunction;
import pom.HomeAutoSearch;
import pom.HomeButtons;
import pom.HomePage;
 

public class ChildbrowserDebugging extends LoginOperations
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
		HomeAutoSearch has = new HomeAutoSearch(driver);
		has.AutosearchHome();
		ChildBrowser.ChildBrowserClose();
		hp.HomePageLogout();
		LoginOperations.LogOut();
	}

	@Test
	public static void ProfileHomeButton() throws InterruptedException, IOException
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
	   ChildBrowser.ChildBrowserClose();
		hp.HomePageLogout();
		//LoginOperations.LogOut();
	}

}
