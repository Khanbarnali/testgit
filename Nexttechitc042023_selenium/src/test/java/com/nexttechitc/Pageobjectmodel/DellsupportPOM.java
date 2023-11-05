package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellsupportPOM {
	
	WebDriver driver;
	 public  DellsupportPOM (WebDriver driver) {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
		   
	 }
	 @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[5]/button/span")
		WebElement support;
		
		public WebElement nav_support() {
			return support;
		}
		
		@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[5]/ul/li[3]/a")
		WebElement supporthome;
		
		public WebElement nav_supporthome() {
			return supporthome;
	
		}
}
