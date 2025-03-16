package com.TestNG.PageObjectModelUsingPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRMLoginPage
{
	
	WebDriver driver;
	//constructor
	public HRMLoginPage(WebDriver driver)//driver reading from base class
	{
		this.driver=driver;//driver will initialize
		PageFactory.initElements(driver,this);
	}
	
	//locator
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginBtn;
	
	
	//actions
	public void setUsername(String un)
	{
		username.sendKeys(un);
	}
	
	public void setPassword(String psw)
	{
		password.sendKeys(psw);
	}
	
	
	public void clickLoginButton()
	{
		loginBtn.click();
	}
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}

	public String getAppTitle()
	{
		return driver.getTitle();
	}
}
