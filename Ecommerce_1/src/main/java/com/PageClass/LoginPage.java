package com.PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
	WebElement Error;
	@FindBy(xpath="//a[text()='Log in']")
	WebElement Login;
	@FindBy(id="Email")
	WebElement Username;
	
	@FindBy(id = "Password")
	WebElement Password;
	
	@FindBy(xpath="//button[text()='Log in']")
	WebElement loginbtn;
	
	public void Login(String username,String password) {
		Login.click();
		Username.sendKeys(username);
		Password.sendKeys(password);
		loginbtn.click();
		//return new HomePageClass(driver);
		}
}
