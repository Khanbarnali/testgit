package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellservicePOM {
	WebDriver driver;
	 public  DellservicePOM (WebDriver driver) {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
		   
	 }
	 @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/button/span")
		WebElement service;
		
		public WebElement nav_service() {
			return service;
		}
		
		@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/ul/li[4]/a")
		WebElement warrantyextension;
		
		public WebElement nav_warrantyextension() {
			return warrantyextension;
	
   }
}
