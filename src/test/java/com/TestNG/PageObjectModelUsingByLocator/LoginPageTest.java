package com.TestNG.PageObjectModelUsingByLocator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass
{
	//LoginPage lp=new LoginPage(driver);
	
  @Test(priority=1)
  public void validateUrl()
  {
//	  LoginPage lp=new LoginPage(driver);
	  String actUrl=lp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("live"));
	  System.out.println("Url Matched...."+actUrl);
  }
  
  @Test(priority=2)
  public void validateTitle()
  {
	  String actTitle=lp.getAppTitle();
	  Assert.assertEquals(actTitle,"OrangeHRM");
	  System.out.println("Title matched....."+actTitle);
  }
  
  @Test(priority=3)
  public void validateLogin()
  {
	  lp.setUserName("Admin");
	  lp.setPassword("admin123");
	  lp.clickOnLoginButton();
	  
	  //lp.doLogin("Admin","admin123");
	  Assert.assertTrue(lp.getAppUrl().contains("dashboard"),"Login Fail");
	  System.out.println("Login succefull!");
	  
  }
  
}
