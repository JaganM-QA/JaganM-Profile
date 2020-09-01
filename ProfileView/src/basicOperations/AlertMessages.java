package basicOperations;
 
import org.openqa.selenium.Alert;
  
public class AlertMessages extends LoginOperations
{
	 
	public static void ReloginAlert () throws InterruptedException
	{
		 
		 Alert a1 = driver.switchTo().alert();
		 Thread.sleep(1000);
		String text = a1.getText();
		 System.out.println(text);
		 a1.accept();
		 Thread.sleep(1000);
	}
	
	public static void CancelAlert () throws InterruptedException
	{
		 
		 Alert a2 = driver.switchTo().alert();
		 Thread.sleep(1000);
		String text = a2.getText();
		 System.out.println(text);
		 a2.dismiss();
		 Thread.sleep(1000);
	}
	 
	public static void AcceptAlert() throws InterruptedException
	{
		Alert a3 = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = a3.getText();
		System.out.println(text);
		a3.accept();
		Thread.sleep(2000);
	}
	
	}
 
