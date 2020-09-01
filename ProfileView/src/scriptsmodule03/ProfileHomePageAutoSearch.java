package scriptsmodule03;

import java.io.IOException;
import org.testng.annotations.Test;
import basicOperations.ActionClass;
import basicOperations.ChildBrowser;
 import basicOperations.LoginOperations;
import basicOperations.Screenshots;
import basicOperations.SearchFunction;
import pom.HomeAutoSearch;
import pom.HomePage;
 
public class ProfileHomePageAutoSearch extends LoginOperations

{

	@Test
	public  void ProfileHomeAutoSearch() throws InterruptedException, IOException
	{
		//LoginOperations.LogIn();
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

} 




