package com.ApiBasicRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
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
public class HeaderCookiesValidation {
  @Test
  public void testHeader() 
  {
	  Response res=given()
	  .when().get("https://www.google.com/");
	  
	  //get all header
	  res.then().log().headers();
	  
	 // System.out.println(res.getSessionId());
	  
	  String exp="text/html; charset=ISO-8859-1";
	  String actHeader=res.getHeader("Content-Type");
	  Assert.assertEquals(actHeader,exp);
	  System.out.println("Headers matched.....");
	  
	  
  }
  
  
  @Test
  public void testCookies()
  {
	  
	  //cookies are always dynamic
	  	
	  Response res=given()
			  .when().get("https://www.google.com/");
	  
	  //log only cookies
	  res.then().log().cookies();
	  
	  //validation: two cookies should not have same value
	  
	  String actCookie=res.getCookie("NID");
	  String exp="PVohZn7Gbm0LiyN1wjGB5eqFQfZP8";
	  
	  Assert.assertFalse(actCookie.contains(exp));
	  System.out.println("Test Pass: As cookies are different!");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
