package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Utility.BrowserUtil;

import io.cucumber.java.en.*;

public class HrmSteps
{
	WebDriver driver=BrowserUtil.getDriver();
		
	
@Given("Open Orangehrm application")
public void open_orangehrm_application() {
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}

@When("user enter {string} and {string}")
public void user_enter_and(String un, String psw) {
    
	driver.findElement(By.name("username")).sendKeys(un);
	driver.findElement(By.name("password")).sendKeys(psw);
}

@When("user click on hrm login button")
public void user_click_on_hrm_login_button()
{
    driver.findElement(By.xpath("//button[@type='submit']")).click();
}

@Then("as per valid credentials user should be able to navigate to dashboard page")
public void as_per_valid_credentials_user_should_be_able_to_navigate_to_dashboard_page() throws InterruptedException {
    
	Thread.sleep(1500);
	Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	System.out.println("Login Completed!");
}



}
