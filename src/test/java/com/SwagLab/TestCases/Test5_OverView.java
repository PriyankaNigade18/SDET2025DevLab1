package com.SwagLab.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLab.Base.BaseClass;

public class Test5_OverView extends BaseClass
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
		ov=co.doCheckout(prop.getData("fn"),prop.getData("ln"),prop.getData("pc"));
	}
	
	
  @Test(priority=1)
  public void varifySummary()
  {
	  ov.getSummary();
  }
  
  @Test(priority=2)
  public void validateCompleteCheckOut() 
  {
	 String confMessage= ov.clickOnFinish();
	 System.out.println("Confirmation message is: "+confMessage);
  }
}
