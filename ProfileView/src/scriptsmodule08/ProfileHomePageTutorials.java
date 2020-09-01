package scriptsmodule08;

import java.io.IOException;

import org.testng.annotations.Test;

import basicOperations.ActionClass;
import basicOperations.ChildBrowser;
import basicOperations.LoginOperations;
import pom.HomePage;
import pom.Tutorials;

public class ProfileHomePageTutorials extends LoginOperations
{

	@Test
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
		LoginOperations.LogOut();

	}

}
