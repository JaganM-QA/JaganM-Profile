package scriptstestingpurpose;

import java.io.IOException;

import org.testng.annotations.Test;

import basicOperations.ActionClass;
import basicOperations.LoginOperations;
import basicOperations.Screenshots;
import pom.Tutorials;
 
public class ProfileTutorials extends LoginOperations

{
	@Test
	public static void ProfileVideoTutorials() throws InterruptedException, IOException
	{
		
		ActionClass.ActionClassHome();
		Tutorials vt = new Tutorials(driver);
		vt.TutorialVideo();
 		ActionClass.ActionClassVideo();
		 Screenshots.screenshot();
	}
 
}
