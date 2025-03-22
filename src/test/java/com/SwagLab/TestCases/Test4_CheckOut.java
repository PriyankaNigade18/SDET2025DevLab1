package com.SwagLab.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLab.Base.BaseClass;

public class Test4_CheckOut extends BaseClass
{
	@BeforeClass
	public void pageSetUp()
	{
		ip=lp.doLogin(prop.getData("un"),prop.getData("psw"));
		ip.addPrductToCart(prop.getData("pname1"));
		addWait();
		cp=ip.launchCartPage();
		addWait();
		co=cp.clickOnCheckout();
	}
	
	
	
	
	
  @Test
  public void validateCheckout()
  {
	  co.doCheckout(prop.getData("fn"),prop.getData("ln"),prop.getData("pc"));
  }
}
