package com.stepdef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Utility.BrowserUtil;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {

	WebDriver driver=BrowserUtil.getDriver();
	
	@When("I enter valid keyword in Google search")
	public void i_enter_valid_keyword_in_google_search() {
	    driver.findElement(By.id("APjFqb")).sendKeys("Java");
	}

	@Then("I should get appropriate options")
	public void i_should_get_appropriate_options() {
	    
		List<WebElement> allOptions=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
		}
	}
}
