package org.test;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SampleApi3 {
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		File file=new File("C:\\Users\\HP\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\Apiclass3.json");
		ObjectMapper mapper=new ObjectMapper();
		
		PojoClass3 det = mapper.readValue(file, PojoClass3.class);
		
		String name = det.getName();
		System.out.println(name);
		String email = det.getEmail();
			System.out.println(email);
			long phoneNo = det.getPhoneNo();
			System.out.println(phoneNo);
			String address = det.getAddress();
			System.out.println(address);
		
	}

}
