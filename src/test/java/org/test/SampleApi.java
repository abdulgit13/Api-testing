package org.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SampleApi {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		//1.mention path of file
		FileReader file=new FileReader("C:\\Users\\HP\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\Apiclass.json");
		
		//2.create object for jsonparser class
		JSONParser jsonParser=new JSONParser();
		
		//3.pass the json file to fetch values
		Object obj = jsonParser.parse(file);
		
		//4.convert object to json object___classcast
		JSONObject j=(JSONObject)obj;
		
		//5.pass the key and returns the value
		Object objName = j.get("name");
		System.out.println(objName);
		
		Object objEmail = j.get("email");
		System.out.println(objEmail);
		
		Object objPhoneNo = j.get("phoneno");
		System.out.println(objPhoneNo);
		
		Object objPayment = j.get("payment");
		System.out.println(objPayment);
		
		Object objAddress = j.get("address");
		JSONObject jAddress=(JSONObject)objAddress;
		
		Object objStreet = jAddress.get("streetname");
		System.out.println(objStreet);
		
		Object objApartment = jAddress.get("apartment");
		System.out.println(objApartment);
		
		Object objState = jAddress.get("state");
		System.out.println(objState);
	
	
	}

}
