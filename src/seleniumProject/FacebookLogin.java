package seleniumProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FacebookLogin extends BasePack {
  @Test
  public void ClickSignIn() throws IOException 
  {
  driver.findElement(By.xpath("//a[@class='nav__button-secondary']")).click();
	  
	 FileInputStream fis = new FileInputStream("C:\\selenium_Projects\\seleniumProject\\src\\TestData\\data.properties");
	  Properties properties = new Properties();
	  properties.load(fis);
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys(properties.getProperty("username"));
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(properties.getProperty("password"));
      driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']")).click();
      String CurrentUrl=driver.getCurrentUrl();
      System.out.println("Current Url=" +CurrentUrl );
}
}