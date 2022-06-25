package org.base;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Create extends BaseClass {
	
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

}
