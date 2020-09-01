package basicOperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class ActionClass extends LoginOperations

{
	//	public static void ActionClassHome() throws InterruptedException
	//	{
	//		WebElement menu = driver.findElement(By.xpath("//button[contains(.,'Home')]"));
	//		Thread.sleep(2000);
	//		Actions act = new Actions(driver);
	//		act.moveToElement(menu).perform();
	//		Thread.sleep(1000);
	//	}


	public static void ActionClassHome() throws InterruptedException
	{
		
		List<WebElement> menu  = driver.findElements(By.xpath("//button[contains(.,'Home')]"));
		WebElement m1 = menu.get(0);
		m1.click();
	}

	public static void ActionClassVideo() throws InterruptedException
	{

		List<WebElement> video = driver.findElements(By.xpath("//video[@width='400']"));

		WebElement v1  = video.get(0);
		v1.click();
		Thread.sleep(10000);


		WebElement v2  = video.get(1);
		v1.click();
		Thread.sleep(10000);
		v2.click();
		Thread.sleep(10000);


		WebElement v3  = video.get(2);
		v2.click();
		Thread.sleep(10000);
		v3.click();
		Thread.sleep(10000);


		WebElement v4  = video.get(3);
		v3.click();
		Thread.sleep(10000);
		v4.click();
		Thread.sleep(10000);
		v4.click();

		int count = video.size();
		System.out.println(count);



	}	

}     



//		WebElement video = driver.findElement(By.xpath("//video[@width='400']"));
//		Thread.sleep(2000);
//		Actions act = new Actions(driver);
//		act.moveToElement(video).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.ENTER);

//		String ss = driver.findElement(By.xpath("//div[@class='column']")).getText();
// 		System.out.println(ss);

//WebElement xyaxis = driver.findElement(By.xpath("//div[@class='column']"));
//		List<WebElement> movehere = driver.findElements(By.xpath("//video[@width='400']"));
//		 
//		Thread.sleep(2000);
//		Actions act = new Actions(driver);
//		act.moveToElement((WebElement) movehere)
//		.clickAndHold()
//		.release()
//		.perform();
//		Thread.sleep(10000);

//driver.close();

