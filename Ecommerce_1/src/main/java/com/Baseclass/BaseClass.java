package com.Baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import com.Utilities.ReadConfig;

public class BaseClass {

	
	ReadConfig rc = new ReadConfig();
	

	public String URL = rc.GetURL();
	public String User =rc.getUsername();
	public String Pwd = rc.password();
	
	
	public WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tatam\\OneDrive\\Documents\\Drivers\\chromedriver.exe");
		   driver=(WebDriver) new ChromeDriver(); 
		  driver.get(URL);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  System.out.println("Hello");
		 // return driver;
	}
}
