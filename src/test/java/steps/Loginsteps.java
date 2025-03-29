package steps;

import org.testng.Assert;

import Pages.LoginPage;
import Utility.BrowserUtility;

import io.cucumber.java.en.*;

public class Loginsteps 
{
	private LoginPage lp=new LoginPage(BrowserUtility.getDriver());
	String acttitle;
	@Given("SwagLab home page is open")
	public void swag_lab_home_page_is_open()
	{
		BrowserUtility.getDriver().get("https://www.saucedemo.com/");
	    
	}

	@When("user get the title of application")
	public void user_get_the_title_of_application() {
	    
		 acttitle=lp.getAppTitle();
		System.out.println("Title is: "+acttitle);
	}

	@Then("title should match with {string}")
	public void title_should_match_with(String exptitle)
	{
	    Assert.assertTrue(acttitle.contains(exptitle),"Test Fail: Title is not matched!");
		System.out.println("Test Pass: Title is matched!");
	}

	@When("User enter valid username and password")
	public void user_enter_valid_username_and_password() {
	 lp.enterUsername("standard_user");
	 lp.enterPassword("secret_sauce");
	
	}

	@When("click on login button")
	public void click_on_login_button()
	{
		lp.clickLogin();
	   
	}

	@Then("User should able to login and navigated to Inventory page")
	public void user_should_able_to_login_and_navigated_to_inventory_page() {
	    
		
		Assert.assertTrue(lp.getUrl().contains("inventory"),"LoginFail!");
		System.out.println("Login completed!");
		
		
	}



}
