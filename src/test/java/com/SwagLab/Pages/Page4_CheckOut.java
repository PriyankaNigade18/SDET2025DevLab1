package com.SwagLab.Pages;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page4_CheckOut {

	private WebDriver driver;
	
	public Page4_CheckOut(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	//locators
	@FindBy(id="first-name")
	WebElement fname;
	
	@FindBy(id="last-name")
	WebElement lname;
	
	@FindBy(id="postal-code")
	WebElement pcode;
	
	@FindBy(id="continue")
	WebElement continueButton;
	
	//actions
	public Page5_Overview doCheckout(String fn,String ln,String pc)
	{
		fname.sendKeys(fn);
		lname.sendKeys(ln);
		pcode.sendKeys(pc);
		
		System.out.println("firstname: "+fn+" lastname: "+ln);
		continueButton.click();
		return new Page5_Overview(driver);
	
		
	}
	
	
	
}
