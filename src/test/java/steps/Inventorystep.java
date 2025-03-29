package steps;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import Pages.InvetoryPage;
import Pages.LoginPage;
import Utility.BrowserUtility;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class Inventorystep 
{
	int count;
	private LoginPage lp=new LoginPage(BrowserUtility.getDriver());
	private InvetoryPage ip;

	@Given("User is logged in to application")
	public void user_is_logged_in_to_application(DataTable table) {
	   BrowserUtility.getDriver().get("https://www.saucedemo.com/");
	   List<Map<String,String>> map=table.asMaps();
	   String un=map.get(0).get("username");
	   String psw=map.get(0).get("password");
	   
	   ip=lp.doLogin(un,psw);
	}

	@Given("User is on Inventory page")
	public void user_is_on_inventory_page()
	{
	    System.out.println("User is On : "+ip.getAppurl());
	    
	}

	@When("User get product count")
	public void user_get_product_count()
	{
	 count=ip.getProductCount();
	 System.out.println("Total Products are: "+count);
		
	}

	@Then("Total products should be match with {int}")
	public void total_products_should_be_match_with(Integer c) {
		Assert.assertEquals(count,c,"Test Fail: Count not matched!");
		System.out.println("Test Pass: Product count is matched!");
	}

	@When("User get the product list")
	public void user_get_the_product_list() {
	   
		ip.getProductDetails();
	}

	@Then("List should display all products")
	public void list_should_display_all_products() {
	    System.out.println("Product details printed!");
	}

	@When("user add product into cart")
	public void user_add_product_into_cart() {
	    ip.addProductToCart("Sauce Labs Fleece Jacket");
	}

	@Then("Product should be added successfully")
	public void product_should_be_added_successfully() {
	    ip.getCartPage();
	}

}
