package com.ApiBasicRequest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestBasicREquest {
  @Test
  public void testSingleUser()
  {
	  Response res=RestAssured.get("https://reqres.in/api/users/2");
	  
	  System.out.println("Status code is: "+res.getStatusCode());
	  System.out.println("Status message is: "+res.getStatusLine());
	  System.out.println("Response time is: "+res.timeIn(TimeUnit.MILLISECONDS));
	  
	  System.out.println("Response in raw format(text)");
	  System.out.println(res.asString());
	  
	  System.out.println("Response in json format");
	  System.out.println(res.asPrettyString());

	  //validation
	  //status code should be 200
	  Assert.assertEquals(res.getStatusCode(),200,"status code not matched!");
	  System.out.println("Status code is matched.....");
	  
	  //json payload validate-jsonpath()
	  
	  //id should be 2
	 int id=res.jsonPath().getInt("data.id");
	  Assert.assertEquals(id,2);
	  System.out.println("Id matched....Id is: "+id);
	  
	  //"first_name": "Janet"
	  String fname=res.jsonPath().getString("data.first_name");
	  Assert.assertEquals(fname,"Janet");
	  System.out.println("First name is matched!");
	  
	   }
  
  
  
  @Test
  public void listOfUsers()
  {
	  Response res=RestAssured.get("https://reqres.in/api/users?page=2");
	  
	  System.out.println(res.asPrettyString());
	  
	  System.out.println("Status code is: "+res.getStatusCode());
	  
	  
	  //all ids should be 6
	  List<Integer> allIds=res.jsonPath().getList("data.id");
	  System.out.println("Total ids are: "+allIds.size());
	  
	  for(Integer i:allIds)
	  {
		  System.out.println(i);
	  }
	  System.out.println("********************");
	  
	  //email
	  List<String> allEmails=res.jsonPath().getList("data.email");
	  
	  for(String i:allEmails)
	  {
		  System.out.println(i);
	  }
	  
	  
	  
	  
	  
  }
  
  
  
  
  
  
  
  
}
