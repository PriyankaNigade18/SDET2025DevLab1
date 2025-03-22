package com.SwagLab.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2_Inventory 
{
	private WebDriver driver;

	public Page2_Inventory(WebDriver driver)//base class driver
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Locators
	@FindBy(xpath="//div//div[@class='inventory_item_name ']")
	List<WebElement> allProductName;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	WebElement addToCartButton;
	
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement cartOption;
	
	//actions
	
	public int getProductCount()
	{
		return allProductName.size();
	}
	
	
	public Page2_Inventory getProductDetails()
	{
		System.out.println("Product Details are:");
		for(WebElement i:allProductName)
		{
			System.out.println(i.getText());
		}
		return this;
	}
	
	public Page2_Inventory addPrductToCart(String pname)
	{
		
		for(WebElement i:allProductName)
		{
			if(i.getText().contains(pname))
			{
				i.click();
				break;
			}
		}
		
		//add the product to the cart
		addToCartButton.click();
		System.out.println("Product added to the cart: "+pname );
		return this;
		
	}
	
	public Page3_CartPage launchCartPage()
	{
		cartOption.click();
		return new Page3_CartPage(driver);
	}
	
}
