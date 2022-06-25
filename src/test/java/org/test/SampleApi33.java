package org.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SampleApi33 {
	
public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		File file=new File("C:\\Users\\HP\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\Apiclass33.json");
		ObjectMapper mapper=new ObjectMapper();
		PojoClass33 d = mapper.readValue(file, PojoClass33.class);
		
		String name = d.getName();
		System.out.println(name);
		
		String email = d.getEmail();
		System.out.println(email);
		
		long phoneNo = d.getPhoneNo();
		System.out.println(phoneNo);
		
		ArrayList<EmpDetail> empdetails = d.getEmpdetails();
		for (EmpDetail emp : empdetails) {
			String firstname = emp.getFirstname();
			System.out.println(firstname);
			String course = emp.getCourse();
			System.out.println(course);
			String address = emp.getAddress();
			System.out.println(address);
		}
		
		}
			
		}
		




