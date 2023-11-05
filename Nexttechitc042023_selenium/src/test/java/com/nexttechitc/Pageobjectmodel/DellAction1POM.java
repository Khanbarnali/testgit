package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellAction1POM {
	WebDriver driver;
	 public  DellAction1POM (WebDriver driver) {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
		   
	 }
	 @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/button/span")
		WebElement service;
		
		public WebElement nav_service() {
			return service;
		}
		
		@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/ul/li[3]/a")
		WebElement All_service;
		
		public WebElement nav_Allservice() {
			return All_service;
	
    }

}