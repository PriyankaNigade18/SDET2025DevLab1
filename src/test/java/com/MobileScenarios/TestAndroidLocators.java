package com.MobileScenarios;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import comUtilities.DriverUtil;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class TestAndroidLocators {
  @Test
  public void testLocators() throws InterruptedException 
  {
	  //create driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  //Locator 1: AccessibilityId
	  WebElement ele=driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
	  System.out.println("Text of Element1: "+ele.getText());
	  ele.click();
	  
	  //static wait
	  Thread.sleep(2000);
	  
	  //back
	  driver.navigate().back();
	  
	  
	  
	  
	  
	  
  }
}
