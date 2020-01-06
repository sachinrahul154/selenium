package seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestDemo {

	public WebDriver driver;
	@BeforeTest
	public void beforeTest()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver=new ChromeDriver();
		
		System.out.println("BeforeTest");
	}
	@Test
	public void test()
	{
		
		System.out.println("TestData");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("TestData");
		
	}
}
