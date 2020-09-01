package scriptsmodule01;

import java.io.IOException;

import org.testng.annotations.Test;
 
import basicOperations.LoginOperations;
import basicOperations.Screenshots;
import pom.ResumePage;

public class ProfileResume extends LoginOperations
{

	@Test
	public static void ResumeProfile() throws InterruptedException, IOException
	{
		 LoginOperations.LogIn();
		ResumePage rp = new ResumePage(driver);
		rp.ResumeMenu();
		Screenshots.screenshot();
		Thread.sleep(2000);
		rp.ResumeLogout();
		LoginOperations.LogOut();
	 
	}
}
