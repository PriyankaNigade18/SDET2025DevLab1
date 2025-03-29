package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InvetoryPage 
{
	private WebDriver driver;

	public InvetoryPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	private By pcount=By.xpath("//div[@class='inventory_list']//div[@class='inventory_item_name ']");
	private By addtocartbtn=By.id("add-to-cart");
	private By cart=By.id("shopping_cart_container");
	
	//methods
	public int getProductCount()
	{
		return driver.findElements(pcount).size();
	}
	
	public void getProductDetails()
	{
		System.out.println("************Product Details are*********");
		List<WebElement> list=driver.findElements(pcount);
		
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
	}
	
	
	public void addProductToCart(String pname)
	{
		
		List<WebElement> list=driver.findElements(pcount);
		
		for(WebElement i: list)
		{
			if(i.getText().contains(pname))
			{
				i.click();
				break;
			}
		}
		
		//to add to cart
		driver.findElement(addtocartbtn).click();
		
		System.out.println("Product added to the cart: "+pname);
	}
	
	
	public void getCartPage()
	{
		driver.findElement(cart).click();
	}
	
	
	public String getAppurl()
	{
		return driver.getCurrentUrl();
		}
	
	
	
	
	
	
	
	
}


