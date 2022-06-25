package org.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.base.BaseClass;
import org.testng.annotations.Test;

import groovyjarjarpicocli.CommandLine.RunAll;
import io.restassured.response.Response;

public class Login extends BaseClass {
	
	@Test
	
	public  void Login1() throws FileNotFoundException, IOException {
		
		addHeader("Content-Type", "application/json");
		basicAuth(getFilePropertyByFileValue("username"), getFilePropertyByFileValue("password"));
		Response response = requestType("POST", "https://omrbranch.com/api/login");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		
		
		System.out.println(response.getStatusCode());
		System.out.println(getReponseBodyAsPrettyString(response));
	

}
}
