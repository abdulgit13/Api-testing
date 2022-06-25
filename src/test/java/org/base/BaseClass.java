package org.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	RequestSpecification reqSpec ;
	Response response;
	
	public void addHeader(String key,String value) {
	reqSpec	= RestAssured.given().header(key,value);
	
		}
	public String getFilePropertyByFileValue(String key) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream(System.getProperty("user.dir")+
				"\\congif.properties"));
		Object object = properties.get(key);
		String value=(String)object;
		return value;
		
	}
	public void basicAuth(String username,String password) {
		reqSpec.auth().preemptive().basic(username, password);
		}
	
public void queryParam(String key,String value) {
	reqSpec = reqSpec.queryParam(key, value);
	}
public void pathParam(String key,String value) {
	reqSpec = reqSpec.pathParam(key, value);
	}
public void addBody(String reqBody) {
	reqSpec = reqSpec.body(reqBody);
	}
public Response requestType(String reqType,String endpoint) {
	
	switch (reqType) {
	case "GET":
		 response = reqSpec.get(endpoint);
		break;
	case "POST":
		 response = reqSpec.post(endpoint);
		break;
	case "PUT":
		 response = reqSpec.put(endpoint);
		break;
	case "DELETE":
		 response = reqSpec.delete(endpoint);
		break;
	default:
		break;
	}
	return response;
	}
public void getStatusCode(Response response) {
	int statusCode = response.getStatusCode();
	System.out.println(statusCode);
	}
public ResponseBody getResponseBody(Response response) {
	ResponseBody responseBody = response.getBody();
	return responseBody;
	}
public String getResponseBodyAsString(Response response) {
	String asString = response.asString();
	return asString;

}
public String getReponseBodyAsPrettyString(Response response) {
	String asPrettyString = response.asPrettyString();
	return asPrettyString;
	}
}
