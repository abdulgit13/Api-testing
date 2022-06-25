package org.base;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Get extends BaseClass {
	@Test(priority=3)
	public void getUser() {
		addHeader("content_type", "application/json");
		Response response = requestType("GET", "https://reqres.in/api/users/2");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		String asPrettyString = getReponseBodyAsPrettyString(response);
		System.out.println(asPrettyString);
}

}
