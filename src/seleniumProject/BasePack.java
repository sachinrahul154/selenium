package seleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasePack {

	public static  WebDriver driver;

	
	@BeforeMethod
	  public void BeforeTest()
	  {
		System.setProperty("Webdriver.chrome.driver","G:\\SeleniumData\\Driver\\ChromeDriver.exe");
		driver=new ChromeDriver();
		driver.get("http://localhost/hrms/hrms/admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

	public void Click(By byLocator)
	{
		driver.findElement(byLocator).click();
		assert true;
	}

	public void Type(By byLocator,String Key)
	{
		driver.findElement(byLocator).sendKeys(Key);
		assert true;
	}
	public void IsDisplayed(By byLocator)
	{
		driver.findElement(byLocator).isDisplayed();
	   assert true;
	}
	

	@Test
	public void test()
	{
		
	}
}
