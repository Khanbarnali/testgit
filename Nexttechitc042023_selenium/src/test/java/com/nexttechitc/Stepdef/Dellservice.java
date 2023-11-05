package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import com.nexttechitc.Pageobjectmodel.DellservicePOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dellservice {
	
	WebDriver driver;
	
	@Given("^users visit Dell homepage$")
	public void users_visit_Dell_homepage() throws Throwable {
		
		//how to open browser
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32//chromedriver.exe");
		    driver = new ChromeDriver();
		    
		    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		    
		 // how to open the URL
			
			driver.get("https://www.dell.com/en-us");
			driver.manage().window().maximize();
			Thread.sleep(2000);
	    
	    
	    
	}

	@When("^users visit the service menu and click on warranty extension service$")
	public void users_visit_the_service_menu_and_click_on_warranty_extension_service() throws Throwable {
	    
		Actions act= new Actions(driver);
		DellservicePOM obj = new DellservicePOM(driver);
		act.moveToElement(obj.nav_service()).build().perform();
		Thread.sleep(2000);
		obj.nav_warrantyextension().click();
		   
	}

	@Then("^users redirect to view warranty extension  page$")
	public void users_redirect_to_view_warranty_extension_page() throws Throwable {
	    
	  
	}

}
