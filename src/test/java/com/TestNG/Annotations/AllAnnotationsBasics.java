package com.TestNG.Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AllAnnotationsBasics {
  @Test(priority=1)
  public void registerTest() 
  {
	  System.out.println("Resgiter to app");
  }
  
  
  @Test(priority=2)
  public void loginTest() 
  {
	  System.out.println("login into app");
  }
  
  
  
  @Test(priority=3)
  public void logoutTest() 
  {
	  System.out.println("logout from app");
  }
  
  //Annotations
  //for every test case
  @BeforeMethod
  public void bmethod()
  {
	 System.out.println("Before method executes before every test case!"); 
  }
  
  @AfterMethod
  public void amethod()
  {
	 System.out.println("After method executes after every test case!"); 
  }
  
  //classlevel
  @BeforeClass
  public void bclass()
  {
	  System.out.println("Before class runs before first test case");
  }
  
  
  @AfterClass
  public void aclass()
  {
	  System.out.println("After class runs after last test case");
  }
}
