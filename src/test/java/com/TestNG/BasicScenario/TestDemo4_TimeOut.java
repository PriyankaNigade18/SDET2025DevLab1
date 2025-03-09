package com.TestNG.BasicScenario;

import org.testng.annotations.Test;

public class TestDemo4_TimeOut
{
  @Test(timeOut = 5000)
  public void testCase1() throws InterruptedException
  {
	 System.out.println("time started........");
	  Thread.sleep(4000);
	  System.out.println("Test Case 1 is executing.....");
  }
  
  
  @Test(timeOut = 5000)
  public void testCase2() throws InterruptedException
  { 
	  System.out.println("time started........");
	  Thread.sleep(6000);
	  System.out.println("Test Case 2 is executing.....");
  }
}
