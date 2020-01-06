package seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadFile{

WebDriver driver;
@BeforeMethod
public void Init()
{
String Url="www.google.com";
System.setProperty("webdriver.chrome.driver","G:\\Java\\seleniumProject\\Data\\driver\\chromedriver.exe");
driver=new ChromeDriver();
driver.get(Url); 
}
@Test
public void Test()
{
System.out.println("Hi");
}
@AfterMethod
public void AfterMethod()
{
	driver.quit();
}
}
