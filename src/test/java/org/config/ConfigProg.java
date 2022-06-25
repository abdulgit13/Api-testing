package org.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigProg {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream stream=new FileInputStream(System.getProperty("user.dir")+
				"\\congif.properties");
	  Properties properties = new Properties();
	  
	  properties.load(stream);
	  
	  Object object = properties.get("password");
	  
	  String name=(String)object;
	  System.out.println(name);
	}

}
