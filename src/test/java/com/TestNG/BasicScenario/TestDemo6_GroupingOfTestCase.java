package com.TestNG.BasicScenario;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo6_GroupingOfTestCase {
  @Test(groups="SmokeTest")
  public void testCase1() 
  {
	  System.out.println("This is test 1");
  }
  
  
  @Test(groups="SmokeTest")
  public void testCase2() 
  {
	  System.out.println("This is test 2");
  }
  
  
  
  @Test(groups="RegressionTest")
  public void testCase3() 
  {
	  System.out.println("This is test 3");
  }
  
  
  @Test(groups="RegressionTest",dependsOnGroups = "SmokeTest")
  public void testCase4() 
  {
	  System.out.println("This is test 4");
  }
  
  
  @Test(groups="SanityTest")
  public void testCase5() 
  {
	  System.out.println("This is test 5");
  }
}
