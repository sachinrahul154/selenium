package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheapAir extends BasePack {

	@Test
	public void MYtest() throws InterruptedException {

		// FROM ORIGIN
		WebElement from = driver.findElement(By.xpath("//input[@placeholder='Enter a city or airport']"));
		from.sendKeys("LAS");
		/*
		 * // Wait to load suggestion list WebDriverWait explicit = new
		 * WebDriverWait(driver, 500);
		 * explicit.until(ExpectedConditions.attributeContains(By.xpath(
		 * "//section[@class='suggestion-box']"),"class","visible"));
		 * from.sendKeys(Keys.ENTER);
		 */
		Thread.sleep(2000);
		from.sendKeys(Keys.TAB);
		System.out.println("Origin Selected");
		// TO Destination
		WebElement TO = driver.findElement(By.xpath("(//input[@class='form-control pr-4'])[2]"));
		TO.sendKeys("NYC");
		// TO.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		TO.sendKeys(Keys.TAB);
		System.out.println("Destination Selected");
		// FROM Date Selected
        ((JavascriptExecutor)driver).executeScript("scroll(0, 500)");
		WebElement datefrom = driver.findElement(By.xpath("//div[@class=' month-date  is--today']"));
		datefrom.isEnabled();
		Thread.sleep(2000);
		datefrom.click();
		// datefrom.sendKeys(Keys.TAB);
		System.out.println("Date Selected");
		/*
		 * // Click on next button WebElement next =
		 * driver.findElement(By.id("sv_arwr")); next.sendKeys(Keys.ENTER);
		 */// To Date Selected
		 ((JavascriptExecutor)driver).executeScript("scroll(0, 500)");
		WebElement dateto = driver.findElement(By.xpath("(//div[@data-date=5])[2]"));
		dateto.click();
		System.out.println("return Date Selected");
		// dateto.getAttribute("data-date").valueOf("5");
		//dateto.sendKeys(Keys.ENTER);
		//System.out.println("Date Again Selected");
		/*
		 * // Select Dropdown Select travelclass = new
		 * Select(driver.findElement(By.name("Class"))); travelclass.selectByValue("5");
		 * System.out.println("Travel Class Selected");
		 */	// SEarch Button Click
		WebElement searchnutton = driver.findElement(By.xpath("//input[@type='button']"));
		searchnutton.click();
		System.out.println("Clicked on search button");

	}

}
