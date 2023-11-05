package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbloginPOM {
	
	WebDriver driver;
	 public  FbloginPOM(WebDriver driver) {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
		   }
		 
	
	 @FindBy(xpath="//input[@name=\"email\"]")
			
	 WebElement Type_emailadress;
	 
	 public WebElement emailadress() {
		 return Type_emailadress;
	 }

	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement Type_password;
	public WebElement password() {
		
	return Type_password;
	
	}
	
	@FindBy(xpath="//button[@value=\"1\"]")
	WebElement click_login;
	public WebElement click_login() {
		
	return click_login ;
	}
	
	
}
