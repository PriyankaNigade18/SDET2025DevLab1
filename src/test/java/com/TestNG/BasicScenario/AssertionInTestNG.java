package com.TestNG.BasicScenario;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionInTestNG
{
  @Test
  public void hardAssertionTest() 
  {
	  String act="Selenium WebDriver is WebUi automation library ";
	  String exp="TestNG"; 
	  /*
	   * When ever assertion fail:java.lang.AssertionError
	   
	  Assert.assertEquals(act,exp,"Test Fail: Strings are not equal");
	  System.out.println("Test Pass:Strings are equal");
	  
	  
	  Assert.assertTrue(act.contains(exp),"Test Fail:String doen't have TestNG");
	  System.out.println("Test Pass: String contains TestNg");
	  */
	  
	  //Negative
	  Assert.assertFalse(act.contains(exp),"Test Fail: TestNG is a part of Actual string");
	  System.out.println("Test Pass: As TestNG is not a part actual string");
  }
  
  @Test
  public void softAssertionTest()
  {
	  int a=100,b=200;
	  
	  SoftAssert sf=new SoftAssert();
	  
	  sf.assertEquals(a,b,"Test Fail: Numbers are not equal");
	  System.out.println("Test Pass: Numbers are equal");
	  
	  sf.assertAll();
  }
}
