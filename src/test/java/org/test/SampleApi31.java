package org.test;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SampleApi31 {
public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		File file=new File("C:\\Users\\HP\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\Apiclass31.json");
		ObjectMapper mapper=new ObjectMapper();
		PojoClass31 d = mapper.readValue(file, PojoClass31.class);
		
		String name = d.getName();
		System.out.println(name);
		String email = d.getEmail();
			System.out.println(email);
			long phoneNo = d.getPhoneNo();
			System.out.println(phoneNo);
			Address31 a = d.getAddress();
			String streetName = a.getStreetName();
			System.out.println(streetName);
			
			String district = a.getDistrict();
			System.out.println(district);
			
			String state = a.getState();
			System.out.println(state);
			
	
	
		
		
		
}
}


