package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellitinfrastructurePOM {
	WebDriver driver;
	 public  DellitinfrastructurePOM (WebDriver driver) {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
		   
	 }
	 @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/button/span")
	 
		WebElement itinfrastructure;
		
		public WebElement nav_itinfrastructure() {
			return  itinfrastructure;
		}
		
		@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[8]/a")
		
		WebElement developersdevops;
		
		public WebElement nav_developerdevops() {
			return developersdevops;
	
  }

}
