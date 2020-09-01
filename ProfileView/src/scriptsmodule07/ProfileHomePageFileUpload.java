package scriptsmodule07;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import basicOperations.ActionClass;
import basicOperations.ChildBrowser;
import basicOperations.FileUpload;
import basicOperations.LoginOperations;
import basicOperations.Screenshots;
import pom.FileUploadForm;
import pom.HomePage;

public class ProfileHomePageFileUpload extends LoginOperations
{
	@Test
	public void ProfileHomeFileUploading() throws EncryptedDocumentException, IOException, InterruptedException
	{

		LoginOperations.LogIn();
		ActionClass.ActionClassHome();
		HomePage hp = new HomePage(driver);
		hp.HomepageFileUpload();
		ChildBrowser.ChildBrowserOpen();
		FileUpload.FileUploadCancel();
		Screenshots.screenshot();
		FileUpload.FileUploadAccept();
		Screenshots.screenshot();
		FileUploadForm fu = new FileUploadForm(driver);
		fu.FileHome();
		ChildBrowser.ChildBrowserClose();
		hp.HomePageLogout();
		LoginOperations.LogOut();
	}
}

