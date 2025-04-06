package com.ApiBasicRequest;

import org.testng.annotations.Test;

import com.POJOClasses.AuthenticationPojo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationDeserialization
{
	/*
	 * Serialization: Converting POJO to JSON
	 * De-serialization: Converting JSON to POJO
	 */
  @Test
  public void testSerialization() throws JsonProcessingException
  {
	  AuthenticationPojo auth=new AuthenticationPojo();
	  auth.setUsername("admin");
	  auth.setPassword("password");
	  
	  ObjectMapper map=new ObjectMapper();
	  String json=map.writerWithDefaultPrettyPrinter().writeValueAsString(auth);
	  
	  System.out.println(json);
	  
  }
  
  @Test
  public void testDeserialization() throws JsonMappingException, JsonProcessingException
  {
	  String json="{\n"
	  		+ "  \"username\" : \"admin\",\n"
	  		+ "  \"password\" : \"password\"\n"
	  		+ "}";
	  
	  ObjectMapper obj=new ObjectMapper();
	  AuthenticationPojo  pojo=obj.readValue(json,AuthenticationPojo.class);
	  
	  System.out.println(pojo.getUsername().equals("admin"));
  }
  
  
  
  
}
