package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.DellAction1POM;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellAction1 {
	
	WebDriver driver;
	
	@Given("^user visits Dell homepage$")
	public void user_visits_Dell_homepage() throws Throwable {
		
		//how to open browser
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32//chromedriver.exe");
		    driver = new ChromeDriver();
		    
		 // how to open the URL
			
			driver.get("https://www.dell.com/en-us");
			driver.manage().window().maximize();
			//Thread.sleep(2000);
	    
	    
	}

	@When("^user visits to service menu and click on View All service$")
	public void user_visits_to_service_menu_and_click_on_View_All_service() throws Throwable {
	    
		Actions act= new Actions(driver);
		DellAction1POM obj = new DellAction1POM(driver);
		act.moveToElement(obj.nav_service()).build().perform();
		Thread.sleep(2000);
		obj.nav_Allservice().click();
		
	   
	}

	@Then("^user redirects to view all service page$")
	public void user_redirects_to_view_all_service_page() throws Throwable {
	    
	    
	}


}
