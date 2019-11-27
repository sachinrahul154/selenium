package seleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleWindows {
	
	WebDriver driver;
	@BeforeMethod
	public void DriverInitailization()
	{
		System.getProperty("driver.chrome.google","C:\\ChromeDriver.exe");
	    driver=new ChromeDriver();
		driver.get("http:\\www.naukri.com");
	    driver.manage().timeouts().implicitlyWait(3,TimeUnit.MILLISECONDS);
	}
		
	@Test
	public void handleMultipleWindow() 
	{
		//return Parent Window Name
		
		
		
		//Return No of Windows Opened by WebDriver	
		
		
		
		//Using Iterator to Iterate With in Windows
		
		
		
		//Compare Whether the Main Windows is Not Equal to Child Window.If not Equal,We WIll Close
		
		
		//This is to Switch Between the Main Windows.
		
	}
	
	@AfterMethod
	public void AfterTest() 
	{
		
	}

}
