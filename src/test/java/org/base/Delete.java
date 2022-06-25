package org.base;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Delete extends BaseClass {
	
	@Test(priority=1)
	public void createUser() {
		addHeader("content_type", "application/json");
		
		addBody("{\\r\\n\" + \r\n" + 
				"		 		\"    \\\"name\\\": \\\"morpheus\\\",\\r\\n\" + \r\n" + 
				"		 		\"    \\\"job\\\": \\\"leader\\\"\\r\\n\" + \r\n" + 
				"		 		\"}");
		Response response = requestType("POST", "https://reqres.in/api/users");
		
		
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		String asPrettyString = getReponseBodyAsPrettyString(response);
		System.out.println(asPrettyString);
}
	
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
		
		
		@Test(priority=3)
		public void getUser() {
			addHeader("content_type", "application/json");
			Response response = requestType("GET", "https://reqres.in/api/users/2");
			int statusCode = response.getStatusCode();
			System.out.println(statusCode);
			String asPrettyString = getReponseBodyAsPrettyString(response);
			System.out.println(asPrettyString);
}
		@Test(priority=4)
		public void deleteUser() {
			addHeader("content_type", "application/json");
			Response response = requestType("DELETE", "https://reqres.in/api/users/2");
			int statusCode = response.getStatusCode();
			System.out.println(statusCode);
			
			String asPrettyString = getReponseBodyAsPrettyString(response);
			System.out.println(asPrettyString);
			
		}
}
