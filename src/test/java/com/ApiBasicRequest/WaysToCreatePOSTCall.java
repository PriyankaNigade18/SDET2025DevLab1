package com.ApiBasicRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.POJOClasses.AuthenticationPojo;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
/*
 * 
 * given(): prerequisite
 * =======================
 * header,cookie,request payload,path param, query param, authentication
 *  
 * when(): send the request
 * ========================
 * GET,POST,PUT,PATCH,DELETE
 * 
 * then(): validation
 * ========================
 * status code,status line,response time,response payload,header,cookies
 * 
 */
public class WaysToCreatePOSTCall {
  @Test
  public void basicWayToPost() 
  {
	  Response res=given()
			  	.header("Content-Type","application/json")
			  	.body("{\n"
	  		+ "    \"username\" : \"admin\",\n"
	  		+ "    \"password\" : \"password123\"\n"
	  		+ "}")
	  
			  	.when().post("https://restful-booker.herokuapp.com/auth");
	  
	  Assert.assertEquals(res.getStatusCode(),200);
	  System.out.println("Status code matched...!");
	  
	  //log
	  res.then().log().body();
	  
  }
  
  
  @Test
  public void postUsingHashMap()
  {
	  //create payload using hashmap
	  HashMap<String,Object> map=new HashMap<String,Object>();
	  map.put("username","admin");
	  map.put("password","password123");
	  
	  
	  
	  Response res=given()
			  .header("Content-Type","application/json")
			  .body(map)
	  
			  .when().post("https://restful-booker.herokuapp.com/auth");
	  
	  Assert.assertEquals(res.getStatusCode(),200);
	  System.out.println("Status code matched....");
	  
	  //log
	  res.then().log().body();
	  
	  
	  
  }
  
  @Test
  public void postUsingPOJO()
  {
	  //paylaod
	  AuthenticationPojo auth=new AuthenticationPojo();
	  auth.setUsername("admin");
	  auth.setPassword("password123");
	  
	  Response res=given()
			  .header("Content-Type","application/json")
			  	.body(auth)
	  
			  	.when().post("https://restful-booker.herokuapp.com/auth");
	  
	  Assert.assertEquals(res.getStatusCode(),200);
	  System.out.println("Status code matched....");
	  
	  
	  //log
	  res.then().log().body();
	  
	  String un=auth.getUsername();
	  Assert.assertEquals(un,"admin");
	  System.out.println("User name is correct!");
	  
	  
	  
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
