package com.WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class WaitScenarioUsingFluentWaitClass {
  @Test
  public void testFluentWait() 
   
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  
	  
	  By startBtn=By.tagName("button");
	  By ele=By.xpath("(//h4)[2]");
	  
	  driver.findElement(startBtn).click();
	  
	  //wait
	  
	  Wait<WebDriver> wait =new FluentWait<WebDriver>(driver)
		            .withTimeout(Duration.ofSeconds(5))
		            .pollingEvery(Duration.ofMillis(300))
		            .ignoring(ElementNotInteractableException.class);
	  
	  String text=wait.until(ExpectedConditions.visibilityOfElementLocated(ele)).getText();
	  
	  System.out.println("Result text: "+text);
	  
  }
}
