package basicOperations;

import java.io.IOException;

import org.openqa.selenium.By;
 

public class FileUpload extends LoginOperations
{
	public static void FileUploadAccept () throws InterruptedException, IOException
	{
 
	driver.findElement(By.xpath("//button[@id='custom-button']")).sendKeys("E:\\Javaprograms\\Profile\\Upload\\TestNG.pptx");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id='custom-button1']")).click();
	Thread.sleep(1000);
	AlertMessages.ReloginAlert();
	Thread.sleep(1000);
	Screenshots.screenshot();
	Thread.sleep(1000);
	//ChildBrowser.ChildBrowserClose();
	 
  }
 
	public static void FileUploadCancel() throws InterruptedException, IOException
	{
 
	driver.findElement(By.xpath("//button[@id='custom-button']")).sendKeys("D:\\Users\\Administrator\\Desktop\\Profile\\Test.txt");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id='custom-button1']")).click();
	Thread.sleep(1000);
	AlertMessages.CancelAlert();
	Thread.sleep(1000);
	Screenshots.screenshot();
	Thread.sleep(1000);
	
  }
}
