package scriptsmodule01;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import basicOperations.AlertMessages;
import basicOperations.ChildBrowser;
import basicOperations.Excel;
import basicOperations.LoginOperations;
import basicOperations.Screenshots;
import pom.ContactEnquriy;
import pom.ContactPage;
 
//import pom.FileUploadForm;

public class ProfileContact extends LoginOperations
{

	@Test
	public static void ContactDetails() throws InterruptedException, EncryptedDocumentException, IOException
	{
		 
		 LoginOperations.LogIn();
		
		Thread.sleep(5000);
		ContactPage cp = new ContactPage(driver);
		cp.ContactMenu();
		cp.ContactEnquiry();
		ChildBrowser.ChildBrowserOpen();
		
		Screenshots.screenshot();
		Thread.sleep(2000);
		
		ContactEnquriy ce = new ContactEnquriy(driver);
		String fn = Excel.excelData("EnquiryForm", 1, 0);
		String ln = Excel.excelData("EnquiryForm", 1, 1);
		String cou = Excel.excelData("EnquiryForm", 1, 2);
		String sub = Excel.excelData("EnquiryForm", 1, 3);
		ce.EnquiryRefresh();
		ce.EnquiryCancel();
		AlertMessages.CancelAlert();
		ce.EnquiryFname(fn);
		ce.EnquiryLname(ln);
		ce.EnquiryContry(cou);
		ce.EnquirySubject(sub);
		Screenshots.screenshot();
		Thread.sleep(2000);
		ce.EnquirySubmit();
		 AlertMessages.AcceptAlert();
		 ChildBrowser.ChildBrowserClose();
		 Thread.sleep(2000);
		 cp.ContactLogout();
		 Thread.sleep(2000);
		 LoginOperations.LogOut();
		 
	}
}
