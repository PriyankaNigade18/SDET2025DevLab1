package com.stepdef;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class OpenCartsteps 
{

	WebDriver driver;
	
@Given("Open Register page using url {string}")
public void open_register_page_using_url(String url) {
   driver=new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   driver.get(url);
	
	
}

@When("user enter all required fildes")
public void user_enter_all_required_fildes(DataTable table) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
   
	List<Map<String,String>> data=table.asMaps();
	
	driver.findElement(By.id("input-firstname")).sendKeys(data.get(0).get("fname"));
	driver.findElement(By.id("input-lastname")).sendKeys(data.get(0).get("lname"));
	driver.findElement(By.id("input-email")).sendKeys(data.get(0).get("email"));
	driver.findElement(By.id("input-telephone")).sendKeys(data.get(0).get("telephone"));
	driver.findElement(By.id("input-password")).sendKeys(data.get(0).get("password"));
	driver.findElement(By.id("input-confirm")).sendKeys(data.get(0).get("cpassword"));
	
	
}

@When("User select yes radio button")
public void user_select_yes_radio_button() {
   driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
}

@When("User check the privacy policy checkbox")
public void user_check_the_privacy_policy_checkbox() {
    driver.findElement(By.name("agree")).click();
}

@When("User Click on Continue button")
public void user_click_on_continue_button() {
    driver.findElement(By.xpath("//input[@value='Continue']")).click();
}

@Then("User registartion should be complete and receive confirmation message")
public void user_registartion_should_be_complete_and_receive_confirmation_message() {
    
	String text=driver.findElement(By.xpath("(//h1)[2]")).getText();
	System.out.println(text);
	Assert.assertTrue(text.contains("Created!"));
	System.out.println("User Registration is completed!");
}

@Given("Open Login page using url {string}")
public void open_login_page_using_url(String url) {
    
	driver=new ChromeDriver();
	driver.get(url);
}

@When("User enter valid credentials")
public void user_enter_valid_credentials(DataTable table) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
    
	List<List<String>> data=table.cells();
	driver.findElement(By.id("input-email")).sendKeys(data.get(0).get(0));
	driver.findElement(By.id("input-password")).sendKeys(data.get(0).get(1));
}

@When("user click on cart Login button")
public void user_click_on_cart_login_button() {
	driver.findElement(By.xpath("//input[@value='Login']")).click();
}

@Then("User should able to navigate account page")
public void user_should_able_to_navigate_account_page()
{
    Assert.assertTrue(driver.getCurrentUrl().contains("account"));
    System.out.println("Login Completed!");
}


}
