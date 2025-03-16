package com.TestNG.PageObjectModelUsingByLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	//encapsulation=private data +public method
	
	WebDriver driver;
	
	//constructor-initialize object
	public LoginPage(WebDriver driver)//Base class driver
	{
		this.driver=driver;
		
	}
	
	
	//locator
	private By username=By.name("username");
	private By password=By.name("password");
	private By loginBtn=By.xpath("//button[@type='submit']");
	
	
	
	//actions
	public void setUserName(String un)
	{
		driver.findElement(username).sendKeys(un);
	}
	
	public void setPassword(String psw)
	{
		driver.findElement(password).sendKeys(psw);
	}
	
	
	public void clickOnLoginButton()
	{
		driver.findElement(loginBtn).click();
	}

	
	public void doLogin(String un,String psw)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(psw);
		driver.findElement(loginBtn).click();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
}
