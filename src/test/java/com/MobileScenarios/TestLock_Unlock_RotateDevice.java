package com.MobileScenarios;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import comUtilities.DriverUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TestLock_Unlock_RotateDevice {
  @Test
  public void testDeviceFeatures() throws InterruptedException
  {
	  //create  driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  ((AndroidDriver)driver).lockDevice();
	  
	  System.out.println("Device Lock....");
	  
	  Thread.sleep(3000);
	  
	  ((AndroidDriver)driver).unlockDevice();
	  
	  System.out.println("Device UnLock....");
	  
	  
	  //rotate
	    
	  ((AndroidDriver)driver).rotate(ScreenOrientation.LANDSCAPE);
	  Thread.sleep(2000);
	  ((AndroidDriver)driver).rotate(ScreenOrientation.PORTRAIT);
	  
  }
}
