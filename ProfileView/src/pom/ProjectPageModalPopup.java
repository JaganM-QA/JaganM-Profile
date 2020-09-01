package pom;

import java.io.IOException;

import org.openqa.selenium.By;

import basicOperations.LoginOperations;

public class ProjectPageModalPopup extends LoginOperations
{

	public static void ProjectList () throws InterruptedException, IOException
	{
		 
		ProjectsPage pp = new ProjectsPage(driver);
		pp.ProjectMenu();
		pp.ProjectITESCMS();
		Thread.sleep(2000);
		 driver.findElement(By.cssSelector("#cms .btn")).click();
		 Thread.sleep(2000);
	 	pp.ProjectITESTDS();
	 	Thread.sleep(2000);
	 	 driver.findElement(By.cssSelector("#tds .btn")).click();
	 	Thread.sleep(2000);
		pp.ProjectITESIMG();
	 	driver.findElement(By.cssSelector("#img .btn")).click();
	 	Thread.sleep(2000);
		pp.ProjectBTTHTS();
	 	driver.findElement(By.cssSelector("#hts .btn")).click();
	 	Thread.sleep(2000);
		pp.ProjectBTTIMS();	
	 	driver.findElement(By.cssSelector("#imt .btn")).click();
	 	Thread.sleep(2000);
 
		}
}
