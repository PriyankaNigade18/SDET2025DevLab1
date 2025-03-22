package com.SwagLab.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLab.Base.BaseClass;

import org.testng.annotations.Test;

public class Test3_CartPage extends BaseClass
{
	@BeforeClass
	public void pageSetUp()
	{
		ip=lp.doLogin(prop.getData("un"),prop.getData("psw"));
		ip.addPrductToCart(prop.getData("pname1"));
		addWait();
		cp=ip.launchCartPage();
		addWait();
	}
	
	
  @Test(priority=1)
  public void varifyProductDescription()
  {
	  cp.getDescription();
  }
  
  @Test(priority=2)
  public void validateRemoveFeature()
  {
	  cp.ClickOnRemove();
	  addWait();
  }
  
  @Test(priority=3)
  public void validateContinueShoppingFeature()
  {
	  ip=cp.ClickOnContinueShopping();
	  addWait();
	  ip.addPrductToCart(prop.getData("pname2"));
	  cp=ip.launchCartPage();
	  addWait();
  }
  
  @Test(priority=4)
  public void validateCheckoutFeature() 
  {
	  cp.clickOnCheckout();
  }
}
