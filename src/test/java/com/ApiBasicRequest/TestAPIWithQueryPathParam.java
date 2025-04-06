package com.ApiBasicRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
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
public class TestAPIWithQueryPathParam {
  @Test
  public void testAPI()
  {
	  //https://api.restful-api.dev/objects?id=3&id=5&id=10
	  RestAssured.baseURI="https://api.restful-api.dev/";
	  
	  Response res=given()
			  .pathParam("path","objects")
			  	.queryParam("id",3)
			  	.queryParam("id",5)
			  	.queryParam("id",10)
	  
			  	//.when().get("https://api.restful-api.dev/{path}");
			  	.when().get("{path}");
	  //status code
	  System.out.println("Status code: "+res.getStatusCode());
	  
	  //log
	  res.then().log().body();
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
