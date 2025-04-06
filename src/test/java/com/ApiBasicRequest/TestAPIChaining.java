package com.ApiBasicRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.POJOClasses.AuthenticationPojo;
import com.POJOClasses.BookingDates;
import com.POJOClasses.BookingPOJO;

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
public class TestAPIChaining 
{
	int bookingId;
	String tokenValue;
	
	
  @Test(priority=1)
  public void createNewBooking() 
  {
	  
	  System.out.println("Creating new booking using Post request.......");
	  //inner pojo create Object
	  BookingDates dates=new BookingDates();
	  dates.setCheckin("2025-04-06");
	  dates.setCheckout("2025-04-07");
	  
	  BookingPOJO booking=new BookingPOJO();
	  booking.setFirstname("Priyanka");
	  booking.setLastname("Nigade");
	  booking.setTotalprice(9098);
	  booking.setDepositpaid(true);
	  booking.setBookingdates(dates);
	  booking.setAdditionalneeds("lunch");
	  
	  	  
	  Response res=given()
			  .header("Content-Type"," application/json")
			  .body(booking)
	  
			  .when().post("https://restful-booker.herokuapp.com/booking");
	  
	  
	  Assert.assertEquals(res.getStatusCode(),200);
	  System.out.println("Status code is matched....");
	  
	  //log
	  res.then().log().body();
	  
	  //get the bookingid
	  bookingId=res.jsonPath().getInt("bookingid");
	  System.out.println("User created with Booking id: "+bookingId);
	  
  }
  
  
  @Test(priority=2)
  public void getDetailsForRegisterBooking()
  {
	  System.out.println("This is GET request......");
	  Response res=given()
	  
			  .when().get("https://restful-booker.herokuapp.com/booking/"+bookingId);
	  
	  Assert.assertEquals(res.getStatusCode(),200);
	  System.out.println("Status code is matched....");
	  
	  //log
	  res.then().log().body();
	  System.out.println("Booking details for same BookingId: "+bookingId);
	  
  }
  
  @Test(priority=3)
  public void createToken()
  {
	  AuthenticationPojo auth=new AuthenticationPojo();
	  auth.setUsername("admin");
	  auth.setPassword("password123");
	  
	  Response res=given()
			  .header("Content-Type","application/json")
			  .body(auth)
	  
			  .when().post("https://restful-booker.herokuapp.com/auth");
	  
	  Assert.assertEquals(res.getStatusCode(),200);
	  System.out.println("Status code is matched....");
	  
	  //log
	  res.then().log().body();
	  
	  //get the token
	  tokenValue=res.jsonPath().getString("token");
	  System.out.println("Token generated : "+tokenValue);
  }
  
  @Test(priority=4)
  public void updateFullBooking()
  {
	  System.out.println("Full upadate using PUT request....");
	  //request payload
	//inner pojo create Object
	  BookingDates dates=new BookingDates();
	  dates.setCheckin("2025-04-07");
	  dates.setCheckout("2025-04-08");
	  
	  BookingPOJO booking=new BookingPOJO();
	  booking.setFirstname("Jay");
	  booking.setLastname("Nigade");
	  booking.setTotalprice(6554);
	  booking.setDepositpaid(true);
	  booking.setBookingdates(dates);
	  booking.setAdditionalneeds("dinner");
	  
	  Response res=given()
			  .header("Content-Type","application/json")
			  .header("Accept","application/json")
			  	.header("Cookie","token="+tokenValue)
			  	.body(booking)
	  
			  	.when().put("https://restful-booker.herokuapp.com/booking/"+bookingId);
	  
	  Assert.assertEquals(res.getStatusCode(),200);
	  System.out.println("Status code is matched....");
	  
	  //log
	  res.then().log().body();
	  System.out.println("Booking update with id: "+bookingId);
  }
  
  @Test(priority=5)
  public void partialBookigUpdate()
  {
	  System.out.println("Partial Update for same booking: "+bookingId);
	  BookingDates dates=new BookingDates();
	  dates.setCheckin("2025-04-07");
	  dates.setCheckout("2025-04-08");
	  
	  BookingPOJO booking=new BookingPOJO();
	  booking.setFirstname("Jayant");
	  booking.setLastname("Shinde");
	  booking.setBookingdates(dates);
	  
	  
	  
	  Response res=given()
			  .header("Content-Type","application/json")
			  .header("Accept","application/json")
			  	.header("Cookie","token="+tokenValue)
			  	.body(booking)
	  
			  	.when().patch("https://restful-booker.herokuapp.com/booking/"+bookingId);
	  
	  //log
	  res.then().log().body();
	  
  }
  @Test(priority=6)
  public void deleteBooking()
  {
	  Response res=given()
			  .header("Content-Type","application/json")
			  	.header("Cookie","token="+tokenValue)
	  
			  	.when().delete("https://restful-booker.herokuapp.com/booking/"+bookingId);
	  
	  //validate status code 201
	  Assert.assertEquals(res.getStatusCode(),201);
	  System.out.println("Booking deleted for id: "+bookingId);
	  
	  
	  	
  }
  
}
