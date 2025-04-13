package com.MobileScenarios;

import java.time.Duration;

import org.testng.annotations.Test;

import comUtilities.DriverUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TestAppMaangement 
{
  @Test
  public void testApp() throws InterruptedException 
  {
	  //create a driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	 String packageName=((AndroidDriver)driver).getCurrentPackage();
	  
	 
	 //current application status
	System.out.println("Current status is: "+((AndroidDriver)driver).queryAppState(packageName));
	  
	//terminate app
	((AndroidDriver)driver).terminateApp(packageName);
	
	//current application status
	System.out.println("After Terminate status is: "+((AndroidDriver)driver).queryAppState(packageName));
		  
	Thread.sleep(2000);
	
	//activate App
	((AndroidDriver)driver).activateApp(packageName);
	//current application status
	System.out.println("After Activate status is: "+((AndroidDriver)driver).queryAppState(packageName));
		
	Thread.sleep(2000);
	//uninstall app
	((AndroidDriver)driver).removeApp(packageName);
	//current application status
	System.out.println("After Remove status is: "+((AndroidDriver)driver).queryAppState(packageName));
			
	Thread.sleep(2000);
	
	//install it
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";

	((AndroidDriver)driver).installApp(path);
	
	//current application status
	System.out.println("After Installation status is: "+((AndroidDriver)driver).queryAppState(packageName));
	
	//activate
	((AndroidDriver)driver).activateApp(packageName);
	
	Thread.sleep(2000);
	
	
	//baground
	
	((AndroidDriver)driver).runAppInBackground(Duration.ofMillis(5000));
	
	
	
	  
	 
	  
	  
  }
}
