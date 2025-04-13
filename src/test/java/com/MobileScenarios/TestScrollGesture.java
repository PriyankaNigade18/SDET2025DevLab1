package com.MobileScenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import comUtilities.DriverUtil;
import comUtilities.ElementUtil;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class TestScrollGesture {
  @Test
  public void scrollTest() 
  {
	  //create driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //page-area address
	  WebElement pageArea=driver.findElement(AppiumBy.id("android:id/list"));
	  
	  //scroll
	  
	  ElementUtil.scrollDownUpToCount(driver,pageArea,2);
	  
	  
	  /*
	  driver.executeScript("mobile:scrollGesture",ImmutableMap.of(
			  "elementId",((RemoteWebElement)pageArea).getId(),
			  "direction","down",
			  "percent",1.0
			  	  
			  ));
	  
	  System.out.println("Page is Scrolling Down!");
	  
	  */
	  
	  
	  
	  
	  
  }
}
