package com.Generic;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility
{
	
	
	public static void selectBasedDropDown(WebElement ddele,String value)
	{
		Select dd=new Select(ddele);
		  
		  System.out.println("Is dropdown support multiple selection?: "+dd.isMultiple());
		  
		  //get all option
		  WebElement ele=null;
		  List<WebElement> allOption=dd.getOptions();
		  System.out.println("Total Options are: "+allOption.size());
		  
		  for(WebElement i:allOption)
		  {
			  System.out.println(i.getText());
			  if(i.getText().contains(value))
			  {
				  ele=i;
			  }
		  }
		  
		  ele.click();
		  
	}

}
