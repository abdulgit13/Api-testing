package org.get;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class SingleUsers {
	
static RequestSpecification reqSpec;
	
	public static void main(String[] args) {
		
		 reqSpec=RestAssured.given();
		 
		 reqSpec.header("content-type","application/json");
		 
		 reqSpec.pathParam("page", "2");
		 
		Response response = reqSpec.get("https://reqres.in/api/users/{page}");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		
		ResponseBody body = response.getBody();
		
		String asString = body.asString();
		System.out.println(asString);
		
		String asPrettyString = body.asPrettyString();
		System.out.println(asPrettyString);

}
}
