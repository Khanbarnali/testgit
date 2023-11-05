package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonallPOM {
	WebDriver driver;
	 public  AmazonallPOM (WebDriver driver) {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
		   }
		 
	    

		@FindBy(xpath="//*[@id=\"searchDropdownBox\"]")
	 
			public WebElement all;
		
		@FindBy(xpath="//*[@id=\"searchDropdownBox\"]/option[5] ")
		
		public WebElement click_Amazonpharmacy;
		
		

}

