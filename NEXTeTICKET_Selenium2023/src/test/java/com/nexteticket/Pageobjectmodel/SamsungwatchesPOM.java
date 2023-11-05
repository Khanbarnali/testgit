package com.nexteticket.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SamsungwatchesPOM {
	WebDriver driver;
	 public  SamsungwatchesPOM (WebDriver driver) {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
		   
		   }
		 

	 @FindBy(xpath="//*[@id=\"component-id\"]/div[1]/div[5]/ul[1]/li[2]/button")
	 		
    WebElement  mobile;
	public WebElement  nav_mobile() {
    return  mobile;
				 
	 }
		
	
	@FindBy(xpath="//*[@id=\"component-id\"]/div[1]/div[5]/ul[1]/li[2]/div/div[1]/ul/li[4]/a")
	
	WebElement watches;
	public WebElement nav_watches() {
	return watches;
	
	
	
	
		
	}
	
	

}
