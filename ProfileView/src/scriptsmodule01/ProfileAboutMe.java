package scriptsmodule01;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

 
import basicOperations.LoginOperations;
import basicOperations.Screenshots;
import pom.AboutMe;


public class ProfileAboutMe extends LoginOperations
{

	@Test
	public static void AboutMeProfile() throws EncryptedDocumentException, IOException, InterruptedException
	{
		AboutMe am = new AboutMe(driver);
		am.AboutMeMenu();
		Screenshots.screenshot();
		 am.AboutMeLogout();
		 LoginOperations.LogOut();
 
		 
	}
}
