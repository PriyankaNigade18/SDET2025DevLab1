package com.stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.Utility.BrowserUtil;

import io.cucumber.java.en.*;

public class GoogleSteps
{
	WebDriver driver=BrowserUtil.getDriver();
	String actTitle;
	
	@Given("Open google application")
	public void open_google_application()
	{
		//driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
	    
	}

	@When("I get the current application title")
	public void i_get_the_current_application_title() {
	    
		actTitle=driver.getTitle();
	}

	@Then("title should match with Google")
	public void title_should_match_with_google() 
	{
	    Assert.assertEquals(actTitle,"Google","Title not matched!");
	    System.out.println("Title matched: "+actTitle);
	}
	
	
//	@When("I enter valid keyword in Google search")
//	public void i_enter_valid_keyword_in_google_search() {
//	    driver.findElement(By.id("APjFqb")).sendKeys("Java");
//	}
//
//	@Then("I should get appropriate options")
//	public void i_should_get_appropriate_options() {
//	    
//		List<WebElement> allOptions=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
//		
//		for(WebElement i:allOptions)
//		{
//			System.out.println(i.getText());
//		}
//	}

}
