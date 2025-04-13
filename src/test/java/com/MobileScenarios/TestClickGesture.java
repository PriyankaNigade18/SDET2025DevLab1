package com.MobileScenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import comUtilities.DriverUtil;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class TestClickGesture {
  @Test
  public void testClickGesture() 
    {
	  
	  //create a driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  //click on view-address
	  WebElement ele=driver.findElement(AppiumBy.accessibilityId("Views"));
	  
	  
	  //gesture
	  driver.executeScript("mobile:clickGesture",ImmutableMap.of(
			  "elementId",((RemoteWebElement)ele).getId()
			  
			  ));
	  
	  System.out.println("Click Gesture is comepleted!");
	  
	  
	  
  }
}
