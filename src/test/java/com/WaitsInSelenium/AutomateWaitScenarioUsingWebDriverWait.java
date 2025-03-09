package com.WaitsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class AutomateWaitScenarioUsingWebDriverWait {
  @Test
  public void testExplicitWait()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  
	  
	  By startBtn=By.tagName("button");
	  By ele=By.xpath("(//h4)[2]");
	  
	  driver.findElement(startBtn).click();
	  WebElement textEle=Utility.waitForVisibilityOfElement(driver,ele);
	  System.out.println("Result text is: "+textEle.getText());
	  
//	  String text=driver.findElement(ele).getText();
//	  System.out.println(text);
	  
	  
	  
	  
	  
	  
  }
}
