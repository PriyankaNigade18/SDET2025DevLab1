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
	  
	  //Locator 2: className
	  WebElement ele2=driver.findElements(AppiumBy.className("android.widget.TextView")).get(3);
	  System.out.println("Text of Element2: "+ele2.getText());
	  ele2.click();
	  
	  Thread.sleep(2000);
	  
	  //back
	  driver.navigate().back();
	  
	  //Locator 3: xpath
	  WebElement ele3=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"App\"]"));
	  System.out.println("Text of Element3: "+ele3.getText());
	  ele3.click();
	  
	  Thread.sleep(2000);
	  
	  //back
	  driver.navigate().back();
	  
	  
	  //Locator 4: id/resource-id
	  
	  WebElement ele4=driver.findElements(AppiumBy.id("android:id/text1")).get(4);
	  System.out.println("Text of Element4: "+ele4.getText());
	  ele4.click();
	  
	  Thread.sleep(2000);
	  
	  //back
	  driver.navigate().back();
	  
	  //Locator 5: -android uiautomator
	  WebElement ele5=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Views\")"));
	  System.out.println("Text of Element5: "+ele5.getText());
	  ele5.click();
	  
	  Thread.sleep(2000);
	  
	  //back
	  driver.navigate().back();
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
