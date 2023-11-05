package com.nexteticket.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyticketbuttonPOM {
	
	
		WebDriver driver;
		 public  BuyticketbuttonPOM (WebDriver driver) {
			   this.driver=driver;
			   PageFactory.initElements(driver, this);
			   
		 } 
		 @FindBy(xpath="//*[@id=\"price\"]/div/div/a") 
			   
		 WebElement click_buyticket;
		public   WebElement click_buyticket () {
		return click_buyticket;
					
					}				   
	   @FindBy(xpath="//*[@id=\"price\"]/div/div[1]/div/div/div/div/a") 
		public WebElement click_buyticket_earlybird15;
			 
			 
		@FindBy(xpath="//*[@id=\"price\"]/div/div[2]/div/div/div/div/a")
		public	 WebElement click_buyticket_regular20;
		
			 
		 @FindBy(xpath="//*[@id=\"price\"]/div/div[3]/div/div/div/div/a")
         public	 WebElement click_buyticket_platinum45;
			 
}	

