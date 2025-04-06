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

public class RestAssuredTestBDD {
  @Test
  public void basicSnippet() 
  {
	  
	  given()
	  
	  .when().get("https://reqres.in/api/users/2")
	  
	  .then()
	  .statusCode(200)
	  .body("data.id",equalTo(2))
	  //log the response from serevr
	  //.log().body();
	  
	  //.log().headers();
	  
	  .log().all();
	  
	  
	  
	  
	  
  }
  
  @Test
  public void testSingleUser()
  {
	  
	 Response res= given()
	  
			 		.when().get("https://reqres.in/api/users/2");
	  
	  //validate status  code
	 	int statuscode=res.getStatusCode();	  
	  Assert.assertEquals(statuscode,200);
	  System.out.println("Status code is matched..."+statuscode);
	  
	  
	  //id =2
	  int id=res.jsonPath().getInt("data.id");
	  Assert.assertEquals(id,2);
	  System.out.println("Id is matched....");
	  
	  //log response
	  
	  res.then().log().body();
	  
	  
	  
	  
	  
  }
  
  
  
  
  
}
