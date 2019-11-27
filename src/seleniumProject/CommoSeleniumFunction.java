package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommoSeleniumFunction {
	WebDriver driver;

	public void clickOn(By byLocator) {
		driver.findElement(byLocator).click();
	}

	public void sendKeys(By byLocator, String Text) {
		driver.findElement(byLocator).sendKeys(Text);
	}

	public void Display(By byLocator) {
		driver.findElement(byLocator).isDisplayed();
	}
}
