package com.DriverSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class DriverSessionWithDesiredCapabilitiesClass {
  @Test
  public void testDriverSession() throws MalformedURLException 
  {
	  //session info which need to send to server-set the capabilities
	  DesiredCapabilities cap=new DesiredCapabilities();
	  cap.setCapability("platformName","Android");
	  cap.setCapability("appium:automationName","uiautomator2");
	  cap.setCapability("appium:udid","emulator-5554");
	  cap.setCapability("appium:deviceName","pixel_5");
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  cap.setCapability("appium:app",path);
	  
	  
	  //server address
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  //create AppiumDriver session
	  
	  AppiumDriver driver=new AndroidDriver(url,cap);
	  System.out.println("Session Id is: "+driver.getSessionId());
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
