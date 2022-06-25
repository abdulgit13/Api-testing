package org.post;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Update {
	
		static RequestSpecification reqSpec;
			
			public static void main(String[] args) {
				
				 reqSpec=RestAssured.given();
				 
				 reqSpec.header("content-type","application/json");
				 
				 reqSpec = reqSpec.body("{\r\n" + 
				 		"    \"name\": \"morpheus\",\r\n" + 
				 		"    \"job\": \"zion resident\"\r\n" + 
				 		"}");
				Response response = reqSpec.put("https://reqres.in/api/users/2");		
				int statusCode = response.getStatusCode();
				System.out.println(statusCode);
				
				ResponseBody body = response.getBody();
				
				String asString = body.asString();
				System.out.println(asString);
				
				String asPrettyString = body.asPrettyString();
				System.out.println(asPrettyString);
				
			}

		}

