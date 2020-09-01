package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tutorials
{

	//Declaration of Elements
	@FindBy(xpath="//video[@width='400']")
	private WebElement video;
	
	@FindBy(id="home")
	private WebElement home;
	
	//Initialization of Elements

	public Tutorials (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
 
	public void TutorialVideo() throws InterruptedException
	{
		video.click();
		Thread.sleep(2000);
	}
	
	public void TutorialVideoHome() throws InterruptedException
	{
		home.click();
		Thread.sleep(2000);
	}
}


