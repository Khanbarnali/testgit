package com.nexteticket.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YahoosignupPOM {
	
	WebDriver driver;
	 public  YahoosignupPOM (WebDriver driver) {
      this.driver=driver;
	 PageFactory.initElements(driver, this);
	 	   
		   }
	 
	 @FindBy (xpath= "//input[@class=\"input-with-icon icon-name \"]")
	 
	 WebElement  type_fullname;
	 public WebElement fullname() {
	 return type_fullname;
		 
     }
	
	 @FindBy(xpath="//*[@id=\"usernamereg-userId\"]")
	 WebElement type_newyahoomail;
	 public WebElement newyahoomail() {
		 return type_newyahoomail;
	 }
	 
	 @FindBy(xpath="//*[@id=\"usernamereg-password\"]")
	 WebElement type_password;
	 public WebElement password() {
	 return type_password;
		 
	 }
	 
	 @FindBy(xpath="//*[@id=\"usernamereg-month\"]")
	public WebElement click_month;


	@FindBy(xpath="//*[@id=\"usernamereg-day\"]")
	WebElement type_day;
	public WebElement day() {
		return type_day;
	}



	@FindBy(xpath="//*[@id=\"usernamereg-year\"]")
	WebElement type_year;
	public WebElement year() {
		return type_year;
		
	}
		 		
	 }
	


