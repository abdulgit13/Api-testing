package org.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Task1 {
	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader file=new FileReader("C:\\Users\\HP\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\Task1.json");
		
		JSONParser jsonparser=new JSONParser();
		
		Object obj = jsonparser.parse(file);
		
		JSONObject j=(JSONObject)obj;
		
		Object objData = j.get("data");
		JSONObject jData=(JSONObject)objData;
		
		Object objId = jData.get("id");
		System.out.println(objId);
		
		Object objEmail = jData.get("email");
		System.out.println(objEmail);
		
		Object objFirstname = jData.get("first_name");
		System.out.println(objFirstname);
		
		Object objlastname = jData.get("last_name");
		System.out.println(objlastname);
		
		Object objAvatar = jData.get("avatar");
		System.out.println(objAvatar);
		
		Object objSupport = j.get("support");
		
		JSONObject js=(JSONObject)objSupport;
		
		Object objUrl = js.get("url");
		System.out.println(objUrl);
		
		Object objText = js.get("text");
		System.out.println(objText);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
