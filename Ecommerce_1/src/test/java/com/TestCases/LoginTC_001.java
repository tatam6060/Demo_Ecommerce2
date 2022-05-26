package com.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Baseclass.BaseClass;
import com.PageClass.LoginPage;

public class LoginTC_001 extends BaseClass{
	LoginPage lp;
	WebElement Txt;
	
	
	
	
	@Test
	public void logintest() throws InterruptedException {
		lp=new LoginPage(driver);
		lp.Login(User, Pwd);
		if(error()) {
			Assert.assertTrue(false);	
		}
		
		
		else {
			driver.findElement(By.xpath("//a[text()='Log out']")).click();
			Assert.assertTrue(true);
			
		}
		
		
		
	}


public boolean error() {
	if(driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).isEnabled()) {
		String Message = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
		System.out.println(Message);
		
	}
	return true;
}

	

}
