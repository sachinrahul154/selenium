package seleniumProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CheapAirTestCase extends BasePack {

	public WebDriver driver;
	@Test
	public void DemoTest() throws InterruptedException, IOException {

		WebElement element = driver.findElement(By.xpath("//*[@id=\"footerContainer\"]/div/div/p/a[2]"));
		// Explicit Wait
		WebDriverWait ExplicitWait = new WebDriverWait(driver, 20);
		ExplicitWait.until(ExpectedConditions.elementToBeClickable(element));
		// Scroll Bar to End
		// document.body.scrollHeight - command to Get Last Coordinates
		((JavascriptExecutor) driver).executeScript("scroll(0,5000)");
		// Vice-Versa
		((JavascriptExecutor) driver).executeScript("scroll(5000,0)");
		// Check Whether Radio Button Are Working (Round Trip,One Way,MultiCity) With
		// ScreenShot

		// Enter From Details
		WebElement from = driver.findElement(By.xpath("//*[@id=\"from1\"]"));
		from.clear();
		from.clear();
		from.sendKeys("NYC");
		from.sendKeys(Keys.TAB);
		// Enter To deatils
		WebElement To = driver.findElement(By.xpath("//*[@id=\"to1\"]"));
		To.clear();
		To.click();
		To.sendKeys("atl");
		Thread.sleep(500);
		To.sendKeys(Keys.TAB);
		// Enter Depart Date 
		WebElement Depart = driver.findElement(By.xpath("//*[@id=\"dates\"]/span[1]/span"));
		Depart.findElement(By.xpath("//*[@id=\"datePickerContainer\"]/div/div[1]/table/tbody/tr[3]/td[6]/a")).click();
		// Enter Return Date
		WebElement Returns = driver.findElement(By.xpath("//*[@id=\"dates\"]/span[2]/span"));
		Returns.findElement(By.xpath("//*[@id=\"datePickerContainer\"]/div/div[2]/table/tbody/tr[3]/td[4]")).click();
		// select Adults
		Thread.sleep(200);
		driver.findElement(By.xpath("//*[@id=\"optionsContainer\"]/div/div/div[1]/button[2]")).click();
		// select economy
		((JavascriptExecutor) driver).executeScript("scroll(0,500000)");
		driver.findElement(By.xpath("//*[@id=\"cabin\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"cabin\"]/option[2]")).click();
		// Search Flight
		driver.findElement(By.xpath("//*[@id=\"fltSearchForm\"]/button")).click();
		Thread.sleep(1000);
		// ChechWhether Any Popops Are There & Close Popups
		if(driver.findElement(By.xpath("//span[@class='link fltactmdl-signup-no-thanks']")).isDisplayed())
		{    driver.findElement(By.xpath("//span[@class='link fltactmdl-signup-no-thanks'] ")).click();
			System.out.println("PopOps Closed");
		}
		else
			System.out.println(" No Pops Are There");
		 // Check Any FLight is Available if Yes Get the Flight Fares & Flight Details
        driver.findElement(By.xpath("//div[@class='btn btn-primary bordered small fltrt-brands-grid-link fltrt-opt-shortcuts-details'])[2]")).getScreenshotAs(OutputType.FILE);
        File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
        File  destScreenshot = new File("C:\\ABP.jpeg"); 
        FileUtils.moveFile(screenshot,destScreenshot);	
}

	@AfterMethod
	public void afterMethod() {
		// driver.quit();
		 
	}
	
}






