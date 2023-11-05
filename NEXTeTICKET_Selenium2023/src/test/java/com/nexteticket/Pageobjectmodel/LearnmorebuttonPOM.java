package com.nexteticket.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LearnmorebuttonPOM {
	WebDriver driver;
	 public  LearnmorebuttonPOM (WebDriver driver) {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
		   
	 } 
		  
	 
	 @FindBy(xpath="//a[@class=\"elementskit-btn  whitespace--normal\"]")
	 
		   WebElement click_learnmorebutton;
		   public WebElement learnmorebutton() {
		   return click_learnmorebutton; 
		  
		   }
		   
		   }


