package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.FbsignupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fbsignup {
	
	WebDriver driver;
	
	@Given("^user visiting facebook url$")
	public void user_visiting_facebook_url() throws Throwable {
		
		try {
		//how to open browser
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32//chromedriver.exe");
			    driver = new ChromeDriver();
			    
			    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			    // how to open URL
			    
			    
			    driver.get("https://www.facebook.com/reg/");
		}    
	   
		catch(Exception e) {
			System.out.println("browser and url not opening");
		}
	}


	@When("^user enter \"([^\"]*)\" \"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\" and click\"([^\"]*)\"$")
	public void user_enter_and_valid_and_and_click(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
	   
	   try { 
	
        FbsignupPOM obj= new FbsignupPOM(driver);
		obj.firstname().sendKeys(arg1);
		obj.lastname().sendKeys(arg2);
		obj.email().sendKeys(arg3);
		obj.password().sendKeys(arg4);
		obj.Female().click();
		WebDriverWait wait=new WebDriverWait(driver,20);
				
	   }
	   catch(Exception e) {
		   System.out.println("elements not found exception");
	   }
		
	}

	@Then("^user select dropdown Month and dropdown Day and dropdown Year$")
	public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
	    
	  try {  
	
       FbsignupPOM obj=new FbsignupPOM(driver);
		
		Select dropdown= new Select(obj.click_month);
		dropdown.selectByIndex(2);
	
		Select dropdown0=new Select(obj.click_day);
		dropdown0.selectByValue("1");
		
		Select dropdown2=new Select(obj.click_year);
		dropdown2.selectByVisibleText("2000");
		WebDriverWait wait=new WebDriverWait(driver,20);
		
	  }
	  catch(Exception e) {
		  System.out.println("elements not found exception");
	  }
		
		
	}


}
