package com.stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.Hooks.AppHooks;
import com.Utility.BrowserUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class AmazonSteps //extends AppHooks
{

	WebDriver driver=BrowserUtil.getDriver();
	
	String actTitle;
//	
//	@Before
//	public void setup()
//	{
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	}
//	
//	@After
//	public void tearDown() throws InterruptedException
//	{
//		Thread.sleep(1500);
//		driver.quit();
//	}

@Given("Open Amazon application")
public void open_amazon_application()
{
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
    
}

@When("User get the home page title")
public void user_get_the_home_page_title() {
    
	actTitle=driver.getTitle();
}

@Then("title should match with homepage title")
public void title_should_match_with_homepage_title() {
   Assert.assertTrue(actTitle.contains("India"));
   System.out.println("Home page Title matched....");
}

@When("User open Sell page")
public void user_open_sell_page()
{
   driver.findElement(By.linkText("Sell")).click();
}

@When("get the title for Sell page")
public void get_the_title_for_sell_page() {

actTitle=driver.getTitle();
}

@Then("title should match with Sell page title")
public void title_should_match_with_sell_page_title() {
	Assert.assertTrue(actTitle.contains("All"));
	   System.out.println("Sell page Title matched....");
}

@When("User open Mobiles page")
public void user_open_mobiles_page() {
    driver.findElement(By.linkText("Mobiles")).click();
}

@When("get the title for Mobiles page")
public void get_the_title_for_mobiles_page() {
    actTitle=driver.getTitle();
    }

@Then("title should match with Mobiles page title")
public void title_should_match_with_mobiles_page_title() {
	Assert.assertTrue(actTitle.contains("Phones"));
	   System.out.println("Mobiles page Title matched....");
}

@When("User open Fashion page")
public void user_open_fashion_page() {
    driver.findElement(By.linkText("Fashion")).click();
}

@When("get the title for Fashion page")
public void get_the_title_for_fashion_page() {
    actTitle=driver.getTitle();
}

@Then("title should match with Fashion page title")
public void title_should_match_with_fashion_page_title() {
	Assert.assertTrue(actTitle.contains("Store"));
	   System.out.println("Fashion page Title matched....");
}


}
