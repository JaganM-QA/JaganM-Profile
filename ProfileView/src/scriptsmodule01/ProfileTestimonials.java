package scriptsmodule01;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import basicOperations.LoginOperations;
import basicOperations.Screenshots;
import basicOperations.SearchFunction;
import pom.TestimonialsPage;

public class ProfileTestimonials extends LoginOperations
{

	@Test
	public static void TestimonialsSearch() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		LoginOperations.LogIn();
		TestimonialsPage tp = new TestimonialsPage(driver);
		SearchFunction.TestimonialsSearch();
		 Screenshots.screenshot();
		 tp.TestimonialLogout();
		 LoginOperations.LogOut();
}
	

}
