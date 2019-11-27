package seleniumProject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SeleniumFunctionalities extends BasePack {

	@Test(enabled = false)
	public void DragNDrop()
	{
		//-----------------------Drag And Drop--------------------------------------------//
		
		//Element Which  to be Dragged
		
		WebElement From = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		
		//Element on Which need to Drop
		
		WebElement To =driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		//Using Action Class For Drag & Drop 
		
		Actions act = new Actions(driver);
		act.dragAndDrop(From, To);
		
		//Dragged and Dropped
		act.dragAndDrop(From,To).build().perform();
		
		
	}
	
	@Test(enabled = false)
	public void findBrokenLinks() throws MalformedURLException, IOException
	{
   		
		
		//Collect  Url
		  
		  List<WebElement> links  =driver.findElements(By.tagName("a"));
		  Iterator<WebElement> it=links.iterator();
		//Verify Each Url Whether its A Domain Specific or Third Party
		  String url=it.next().getAttribute("href");
		  String Null = null;
		if(url==Null || url.isEmpty())
		  {
			  System.out.println();
		  }
			  
		//Collect Each Response 
		HttpURLConnection  huc= null;
		huc=(HttpURLConnection)(new URL(url).openConnection());
		huc.setRequestMethod("HEAD");	
		//Validate Each Response
		int responsecode=huc.getResponseCode();
        if(responsecode>=400)  
        {
        	System.out.println(url+" is Broken Link");
        	
        }
        else
        {
        	System.out.println(url+"is a Valid Link");
        }
	}

	@Test(priority = 1)
	public void TestBrokenLink() {
       					
		String underConsTitle = "Under Construction: Mercury Tours";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		String[] linkTexts = new String[linkElements.size()];
		int i = 0;

		// extract the link texts of each link element
		for (WebElement e : linkElements) {
			linkTexts[i] = e.getText();
			i++;
		}

		// test each link
		for (String t : linkTexts) {
			driver.findElement(By.linkText(t)).click();
			if (driver.getTitle().equals(underConsTitle)) {
				System.out.println("\"" + t + "\"" + " is under construction.");
			} else {
				System.out.println("\"" + t + "\"" + " is working.");
			}
			//driver.navigate().back();
		}			
}		
}
	
	
