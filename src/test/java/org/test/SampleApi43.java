package org.test;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SampleApi43 {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		File file=new File("C:\\Users\\HP\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\Apiclass43.json");
		
		ObjectMapper mapper=new ObjectMapper();
		
		//ArrayList<Empdetails> empDetails=new ArrayList<Empdetails>();
		//Empdetails e=new Empdetails("firstName", "address", "course");
		//empDetails.add(e);
		java.util.List<Course> c =new ArrayList<Course>();
		Course c1=new Course("c1", "c2", "c3");
		c.add(c1);
		
		PojoClass43 pc =new PojoClass43("abdul", "abc", 9042400230l, (ArrayList<Course>) c);
		
		
	    mapper.writeValue(file,pc );
		
	}
}


