package scriptsmodule02;

import java.io.IOException;
import org.testng.annotations.Test;
import basicOperations.LoginOperations;
import basicOperations.Screenshots;
import pom.ProjectPageModalPopup;
import pom.ProjectsPage;

public class ProfileProjects extends LoginOperations
{
	@Test
	public static void ProjectList() throws InterruptedException, IOException
	{

		LoginOperations.LogIn();
		ProjectsPage pp = new ProjectsPage(driver);
		ProjectPageModalPopup.ProjectList(); 
		Screenshots.screenshot();
		pp.ProjectLogout();
		LoginOperations.LogOut();

	}

}
