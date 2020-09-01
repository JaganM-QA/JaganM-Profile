package scriptstestingpurpose;

import org.testng.annotations.Test;

import basicOperations.ActionClass;
import basicOperations.LoginOperations;
import pom.Tutorials;
 
public class ProfileTutorials extends LoginOperations

{
	@Test
	public static void ProfileVideoTutorials() throws InterruptedException
	{
		
		ActionClass.ActionClassHome();
		Tutorials vt = new Tutorials(driver);
		vt.TutorialVideo();
 		ActionClass.ActionClassVideo();
		 
	}
 
}
