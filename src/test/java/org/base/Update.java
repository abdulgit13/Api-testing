package org.base;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Update extends BaseClass {
	@Test(priority=2)
	public void updataUser() {
		addHeader("content_type", "application/json");
		
		addBody("{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"zion resident\"\r\n" + 
				"}");
		Response response = requestType("PUT", "https://reqres.in/api/users/2");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		String asPrettyString = getReponseBodyAsPrettyString(response);
		System.out.println(asPrettyString);
 }

}
