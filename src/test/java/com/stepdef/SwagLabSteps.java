package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwagLabSteps
{
	WebDriver driver;
	
	@Given("Open Swaglab application")
	public void open_swaglab_application()
	{
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
	}
	

	@When("User enter valid {string} and valid {string}")
	public void user_enter_valid_and_valid(String un, String psw) 
	{
		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(psw);
		
	    
	}

	@When("User click on swaglab Login button")
	public void user_click_on_swaglab_login_button()
	{
	   driver.findElement(By.id("login-button")).click();
	}

	@Then("User should navigate to Inventory page")
	public void user_should_navigate_to_inventory_page()
	{
	    Assert.assertTrue(driver.getCurrentUrl().contains("inventory"),"Login Fail");
	    System.out.println("Login completed!");
	    
	  
	   
	}



}
