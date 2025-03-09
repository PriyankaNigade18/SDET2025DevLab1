package com.TestNG.BasicScenario;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo2_Invocationcount
{
  @Test(invocationCount = 3)
  public void tetsLogin() 
  {
	  System.out.println("User Login......");
  }
  
  @Test
  public void tetsLogout() 
  {
	  System.out.println("User Logout......");
  }
}
