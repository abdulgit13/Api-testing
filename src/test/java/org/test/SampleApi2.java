package org.test;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SampleApi2 {
	public static void main(String[] args) throws ParseException, IOException {
		
		FileReader file=new FileReader("C:\\Users\\HP\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\Apiclass2.json");
		JSONParser jsonParser=new JSONParser();
		Object object = jsonParser.parse(file);
		JSONObject j=(JSONObject)object;
		
		Object objName = j.get("name");
		System.out.println(objName);
		
		Object objEmail = j.get("email");
		System.out.println(objEmail);

		Object objCourse = j.get("course");
		
		JSONArray a=(JSONArray)objCourse;
		int size = a.size();
		System.out.println(size);
		
		for (int i = 0; i < a.size(); i++) {
			Object obj = a.get(i);
			System.out.println(obj);
			
		}
	}
}
