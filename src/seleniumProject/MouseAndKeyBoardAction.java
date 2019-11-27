package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseAndKeyBoardAction extends BasePack {

 @Test
 public void MouseOverEvent()
 {
	 
	 /* Right Click   */
	 
	 Actions act= new Actions(driver);
	 act.contextClick();
	 
	 /*  Drag and Drop   */
 
    //Element Which Should be Dragged
	 
	 WebElement from=driver.findElement(By.id("From"));
	 
	// Element On Which to be Draggged
	 WebElement To=driver.findElement(By.id("To"));
	  
	 //Using Action Class For Drag and Dropped
	 act.dragAndDrop(from,To).build().perform();
	 
  }

}
