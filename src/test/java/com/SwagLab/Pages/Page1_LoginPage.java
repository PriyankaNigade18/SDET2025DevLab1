package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1_LoginPage
{
	WebDriver driver;
	
	public Page1_LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//locator
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	
	//action
	
	public Page1_LoginPage setUsername(String un)
	{
	username.sendKeys(un);
	return this;
	}
	
	public Page1_LoginPage setPassword(String psw)
	{
		password.sendKeys(psw);
		return this;
	}
	
	public Page2_Inventory clickOnLogin()
	{
		loginBtn.click();
		//navigation to any next page
		return new Page2_Inventory(driver);
	}
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public Page2_Inventory doLogin(String un,String psw)
	{
		username.sendKeys(un);
		password.sendKeys(psw);
		loginBtn.click();
		//navigating to inventory page
		return new Page2_Inventory(driver);
	}
	
	
	

}
