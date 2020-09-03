package basicOperations;

import java.util.Set;
 
 
public class ChildBrowser extends LoginOperations

	{
	
	public static String id = driver.getWindowHandle();
	public static Set<String> id1 = driver.getWindowHandles();
	public static void ChildBrowserOpen ( ) throws InterruptedException
	{
		 
	 	int count = id1.size();
		System.out.println(count);
		
		for (String wh : id1)
		{
			System.out.println(wh);
			driver.switchTo().window(wh)	;
			
			String title = driver.getTitle();
			System.out.println(title);
		 
		}
 
	}
	
	public static void ChildBrowserClose()
	{
		id1.remove(id);
		driver.close();
		driver.switchTo().window(id); 
	}
	
	
	
	public static void ParentBrowserClose ( ) throws InterruptedException
	{
		 
		int count = id1.size();
		System.out.println(count);
		
		for (String wh : id1)
		{
			System.out.println(wh);
			driver.switchTo().window(wh)	;
			String title = driver.getTitle();
			System.out.println(title);
			 
			if(id.equals(wh))
			{
				
			 driver.close();
			 
			}
			 
	 	}
	}
}







//public class ChildBrowser extends LoginOperations
//{
//	String mainWindow = driver.getWindowHandle();
//	Set<String> set = driver.getWindowHandles();
//	Iterator<String> itr = set.iterator();
//	while (itr.hasNext())
//	{
//		String childWindow = itr.next();
//		if(!mainWindow.equals(childWindow))
//		{
//			driver.switchTo().window(childWindow);
//			System.out.println(driver.switchTo().window(childWindow).getTitle());
//			driver.close();
//			
//		}
//		driver.switchTo().window(mainWindow);
//	}
//}
 
 