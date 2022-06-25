package org.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Task3 {
public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		File file=new File("C:\\Users\\HP\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\Task3.json");
		ObjectMapper mapper=new ObjectMapper();
		
		PojoTask3 d = mapper.readValue(file, PojoTask3.class);
		
		int page = d.getPage();
		System.out.println(page);
		
		int per_page = d.getPer_page();
		System.out.println(per_page);
		
		int total = d.getTotal();
		System.out.println(total);
		
		int total_pages = d.getTotal_pages();
		System.out.println(total_pages);
		
		List<Data> data = d.getData();
		for (Data data2 : data) {
			int id = data2.getId();
			System.out.println(id);
			String email = data2.getEmail();
			System.out.println(email);
			String first_name = data2.getFirst_name();
			System.out.println(first_name);
			String last_name = data2.getLast_name();
			System.out.println(last_name);
			String avatar = data2.getAvatar();
			System.out.println(avatar);
			}
		Support s = d.getSupport();
		String url = s.getUrl();
		System.out.println(url);
		String text = s.getText();
		System.out.println(text);
				}
		}
	
		
	



