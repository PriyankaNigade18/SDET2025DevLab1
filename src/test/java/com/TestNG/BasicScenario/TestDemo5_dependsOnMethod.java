package com.TestNG.BasicScenario;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo5_dependsOnMethod
{
  @Test(priority=1)
  public void resgisterTest() 
  {
	  System.out.println("This is register test!");
	  Assert.assertEquals(true,true);
	  System.out.println("Assertion Pass!");
  }
  
  @Test(priority=2,dependsOnMethods = "resgisterTest")
  public void loginTest() 
  {
	  System.out.println("This is login test!");
	  Assert.assertEquals(false,true,"Assertion Fail!");
	  System.out.println("Assertion Pass!");
  }
  
  @Test(priority=3,dependsOnMethods = "loginTest")
  public void logoutTest() 
  {
	  System.out.println("This is logout test!");
  }
}
