package basicOperations;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
  
public class Screenshots extends LoginOperations
{
	//static WebDriver driver;
	 public static String  screenshot() throws IOException, InterruptedException
	 {
		 	Date d = new Date();
			String date1 = d.toString();
			System.out.println(date1);
			
			String date2 =  date1.replaceAll(":", "_");
			System.out.println(date2);
			
			 
			TakesScreenshot ts = (TakesScreenshot) driver;
			 File srcFile = ts.getScreenshotAs(OutputType.FILE);
			 
			 File destFile = new File("E:\\Javaprograms\\Profile\\Screens\\"+date2+"_Profile.jpeg");
			 Thread.sleep(2000);
			 FileUtils.copyFile(srcFile, destFile);
			return date2;
			 
	 }
}
