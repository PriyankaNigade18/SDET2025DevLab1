package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3_CartPage
{
	
	
	private WebDriver driver;
	public Page3_CartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	//locators
	@FindBy(xpath="//div[@class='cart_item_label']")
	WebElement productDesc;
	
	@FindBy(xpath="//button[text()='Remove']")
	WebElement removeButton;
	
	@FindBy(id="continue-shopping")
	WebElement  continueButton;
	
	@FindBy(id="checkout")
	WebElement checkoutButton;
	
	//actions
	public Page3_CartPage getDescription()
	{
		System.out.println("Product Description:");
		System.out.println(productDesc.getText());
		return this;
	}
	
	public Page3_CartPage ClickOnRemove()
	{
		removeButton.click();
		return this;
	}
	
	public Page2_Inventory ClickOnContinueShopping()
	{
		continueButton.click();
		return new Page2_Inventory(driver);
	}
	
	public Page4_CheckOut clickOnCheckout()
	{
		checkoutButton.click();
		return new Page4_CheckOut(driver);
		
	}

}
