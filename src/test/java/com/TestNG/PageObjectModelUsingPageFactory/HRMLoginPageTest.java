package com.TestNG.PageObjectModelUsingPageFactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HRMLoginPageTest extends BaseClass
{
  @Test(priority=1)
  public void validateUrl()
  {
	  String actUrl=lp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("hrm"));
	  System.out.println("Url matched..."+actUrl);
  }
  
  @Test(priority=2)
  public void validateLogin()
  {
	  
	  lp.setUsername("Admin");
	  lp.setPassword("admin123");
	  lp.clickLoginButton();
	  
	  Assert.assertTrue(lp.getAppUrl().contains("dashboard"));
	  System.out.println("Login Successfull!");
  }
}
