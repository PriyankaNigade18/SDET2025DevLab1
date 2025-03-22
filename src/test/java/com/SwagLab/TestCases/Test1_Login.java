package com.SwagLab.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SwagLab.Base.BaseClass;
import com.SwagLab.Utility.ExcelUtil;

public class Test1_Login extends BaseClass
{
	
	
	@Test(priority=1)
	public void validateUrl()
	{
		String actUrl=lp.getAppUrl();
		AssertJUnit.assertTrue(actUrl.contains("demo"));
		System.out.println("Url Matched.."+actUrl);
	}
	
	@Test(priority=2)
	public void validateTitle()
	{
		String actTitle=lp.getAppTitle();
		AssertJUnit.assertEquals(actTitle,"Swag Labs");
		System.out.println("Title matched...."+actTitle);
		
	}
	
	
	
  @Test(priority=3)
  public void validateLogin()
  {/*
	  lp.setUsername(prop.getData("un"));
	  lp.setPassword(prop.getData("psw"));
	  lp.clickOnLogin();
	  */
	  /*//excel
	  lp.setUsername(ExcelUtil.getData("LoginPage",1,0));
	  lp.setPassword(ExcelUtil.getData("LoginPage",1,1));
	  lp.clickOnLogin();
	  */
	  
	  lp.doLogin(prop.getData("un"),prop.getData("psw"));
	  addWait();
	  AssertJUnit.assertTrue(lp.getAppUrl().contains("inventory"));
	  System.out.println("Login Successfull!");
  }
}
