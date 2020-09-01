package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadForm 
{

	//Declaration of Elements
			static WebDriver driver;
			
			@FindBy(id="custom-button")
			private WebElement file;
			
			//Windows explorer pop-up - select the file
			
			@FindBy(id="custom-button1")
			private WebElement submit;
			
			@FindBy(id="custom-button2")
			private WebElement home;
			
			public FileUploadForm	(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//Utilization of Elements
			
			public void ChooseFileButton() throws InterruptedException
			{
				file.click();
				Thread.sleep(2000);
				
			}
			
			public void FileSubmit() throws InterruptedException
			{
				submit.click();
				Thread.sleep(2000);
				
			}
			
			public void FileHome() throws InterruptedException
			{
				home.click();
				Thread.sleep(2000);
				
			}
	
}
