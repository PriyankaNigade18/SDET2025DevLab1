package com.TestNG.Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B 
{
  @Test
  public void testCase11()
  {
	  System.out.println("Test 11");
  }
  
  @Test
  public void testCase12()
  {
	  System.out.println("Test 12");
  }
 
  @BeforeTest
  public void btest()
  {
	  System.out.println("BeforeTest executes Before first Class");
  }
  
  @AfterTest
  public void atest()
  {
	  System.out.println("AfterTest executes After last Class");
  }
}
