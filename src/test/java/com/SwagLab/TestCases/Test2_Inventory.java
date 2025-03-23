package com.SwagLab.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLab.Base.BaseClass;
import com.aventstack.chaintest.plugins.ChainTestListener;

public class Test2_Inventory extends BaseClass
{
	@BeforeClass
	public void pageSetUp()
	{
		ip=lp.doLogin(prop.getData("un"),prop.getData("psw"));
	}
	
	
  @Test(priority=1)
  public void validateProductCount()
  {
	  int count=ip.getProductCount();
	  ChainTestListener.log("Testing product count....");
	  Assert.assertEquals(count,6);
	  
	  System.out.println("Count Matched....Total Products are: "+count);
  }
  
  
  @Test(priority=2)
  public void varifyProductDeatils()
  {
	  ip.getProductDetails();
  }
  
  @Test(priority=3)
  public void validateAddToCartFeature()
  {
	  ip.addPrductToCart(prop.getData("pname1"));
	  addWait();
  }
  
}
