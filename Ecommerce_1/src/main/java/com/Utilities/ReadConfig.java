package com.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties prop = new Properties();
	public ReadConfig()  {
		File src = new File("C:\\Users\\tatam\\OneDrive\\Documents\\Eclipse_Workspace\\Ecommerce_1\\src\\main\\java\\com\\Utilities\\Config.Properties");
				try {
			FileInputStream fis = new FileInputStream(src);
			prop.load(fis);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String GetURL() {
		String url = prop.getProperty("URL");
		return url;
		
	}
	public String getUsername() {
		String username = prop.getProperty("Email_Username");
		return username;
		
	}
	public String password() {
		String password = prop.getProperty("Password");
		return password;
	
	}
}
