package org.test;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SampleApi41 {
	
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		File file=new File("C:\\Users\\HP\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\Apiclass42.json");
		
		ObjectMapper mapper=new ObjectMapper();
		
		Address a=new Address("teacher colony","vellore" , "tn");
		
		PojoClass41 pc=new PojoClass41("abdul", "abd@gmail.com", 9042400230l, a);
		
		mapper.writeValue(file, pc );
	}
	
	

}
