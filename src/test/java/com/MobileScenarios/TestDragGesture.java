package com.MobileScenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import comUtilities.DriverUtil;
import comUtilities.ElementUtil;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class TestDragGesture {
  @Test
  public void testDrag() 
  {
	//create driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  ElementUtil.getScreenshot(driver,"HomePage");
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  ElementUtil.getScreenshot(driver,"Viewage");
	  
	  //drag and drop
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  ElementUtil.getScreenshot(driver,"DragPage");
	  
	  //dot1
	  WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
	  
	  //866 1295
	  
	  
	  //gesture
	  driver.executeScript("mobile:dragGesture",ImmutableMap.of(
			  
			  "elementId",((RemoteWebElement)ele).getId(),
			  "endX",866,
			  "endY",1295
			  ));
	  
	  
	  ElementUtil.getScreenshot(driver,"dropped");
	  //message
	  String resultText=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
	  
	  System.out.println("ResultText is: "+resultText);
	  
	  
	  
  }
}
