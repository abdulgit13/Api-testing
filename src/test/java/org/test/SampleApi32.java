package org.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SampleApi32 {
	
public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		File file=new File("C:\\Users\\HP\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\.json");
		ObjectMapper mapper=new ObjectMapper();
		PojoClass32 d = mapper.readValue(file, PojoClass32.class);
		
		String name = d.getName();
		System.out.println(name);
		
		String email = d.getEmail();
		System.out.println(email);
		
		long phoneNo = d.getPhoneNo();
		System.out.println(phoneNo);
		
		ArrayList<String> course = d.getCourse();
		for (String c: course) {
			System.out.println(c);
			
		}

}
}
