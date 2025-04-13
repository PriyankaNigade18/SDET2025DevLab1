package com.MobileScenarios;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import comUtilities.DriverUtil;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class TestAlerts {
  @Test
  public void testAlerts()
  {
	  //create driver session
	  
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  
	  //app
	  driver.findElement(AppiumBy.accessibilityId("App")).click();
	  
	  //alerts
	  driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
	  
	  //alert1
	  driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
	  
	  
	  //alert will open
	  
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Alert Text is: "+alt1.getText());
	  
	  //ok
	  alt1.accept();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
