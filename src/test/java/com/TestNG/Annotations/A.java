package com.TestNG.Annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class A {
  @Test
  public void testCase1()
  {
	  System.out.println("Test 1");
  }
  
  @Test
  public void testCase2()
  {
	  System.out.println("Test 2");
  }
  
  @BeforeSuite
  public void bsuite()
  {
	  System.out.println("BeforeSuite will execute before test");
  }
  
  @AfterSuite
  public void asuite()
  {
	  System.out.println("AfterSuite will execute After test");
  }
  
}
