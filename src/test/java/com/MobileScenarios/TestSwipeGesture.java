package com.MobileScenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import comUtilities.DriverUtil;
import comUtilities.ElementUtil;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class TestSwipeGesture {
  @Test
  public void swipeGesture() throws InterruptedException
  {
	  //Create driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  
	  //gallery
	  driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	  
	  //photos
	  
	  driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
	  
	  //area
	  
	  WebElement area=driver.findElement(AppiumBy.id("io.appium.android.apis:id/gallery"));
	 
	  //swipe
	  driver.executeScript("mobile:swipeGesture",ImmutableMap.of(
			  
			  "elementId",((RemoteWebElement)area).getId(),
			  "direction","left",
			  "percent",1.0
			    
			  ));
	  
	  Thread.sleep(2000);
	  
	  ElementUtil.swipeRight(driver,area);
	  
  }
}
