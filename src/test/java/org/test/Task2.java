package org.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Task2 {
	public static void main(String[] args) throws IOException, ParseException  {
		
		FileReader file=new FileReader("C:\\Users\\HP\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\task2.json");
		JSONParser jsonparser=new JSONParser();
		Object object = jsonparser.parse(file);
		JSONObject j=(JSONObject)object;
		
		Object objpage = j.get("page");
		System.out.println(objpage);
		
		Object objPerPage = j.get("per_page");
		System.out.println(objPerPage);
		
		Object objTotal = j.get("total");
		System.out.println(objTotal);
		
		Object objTotalpages = j.get("total_pages");
		System.out.println(objTotalpages);
		
		Object objData = j.get("data");
		JSONArray a= (JSONArray)objData;
		
		int size = a.size();
		System.out.println(size);
		
		for (int i = 0; i < a.size(); i++) {
			Object obj1 = a.get(i);
			JSONObject j1=(JSONObject)obj1;
			
			Object objId = j1.get("id");
			System.out.println(objId);
			
			Object objEmail = j1.get("email");
			System.out.println(objEmail);
			
			Object objFirst = j1.get("first_name");
			System.out.println(objFirst);
			
			Object objLast = j1.get("last_name");
			System.out.println(objLast);
			
			Object objAvatar = j1.get("avatar");
			System.out.println(objAvatar);
			
	}
		Object objSupport = j.get("support");
		JSONObject jS=(JSONObject)objSupport;
	     Object jSurl = jS.get("url");
	     System.out.println(jSurl);
	     
	     Object jStext = jS.get("text");
	     System.out.println(jStext);
	
	
	
	
	}

}
