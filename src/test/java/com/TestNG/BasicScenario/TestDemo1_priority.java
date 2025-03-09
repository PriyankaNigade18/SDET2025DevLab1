package com.TestNG.BasicScenario;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo1_priority
{
  @Test(priority=1,description="Test Case for Amazon test Register")
  public void regiterUser() 
  {
	  System.out.println("User Register.....");
  }
  
  @Test(priority=2,description="Test Case for Amazon test Login")
  public void loginUser() 
  {
	  System.out.println("User Login.....");
  }
  
  @Test(priority=3)
  public void searchProduct() 
  {
	  System.out.println("User Search for Product.....");
  }
  
  @Test(priority=4)
  public void addToCart() 
  {
	  System.out.println("Product added to cart....");
  }
}
