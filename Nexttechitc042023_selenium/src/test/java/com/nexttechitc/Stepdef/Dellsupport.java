package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import com.nexttechitc.Pageobjectmodel.DellsupportPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dellsupport {
	
	WebDriver driver;
	
	
	@Given("^users will visit Dell homepage$")
	public void users_will_visit_Dell_homepage() throws Throwable {
		
		//how to open browser
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32//chromedriver.exe");
		    driver = new ChromeDriver();
		    
		 // how to open the URL
			
			driver.get("https://www.dell.com/en-us");
			//driver.manage().window().maximize();
			//Thread.sleep(2000);
	    
		
	    
	}

	@When("^users will go to the support menu and click on support home$")
	public void users_will_go_to_the_support_menu_and_click_on_support_home() throws Throwable {
	   
		Actions act= new Actions(driver);
		DellsupportPOM obj = new DellsupportPOM(driver);
		act.moveToElement(obj.nav_support()).build().perform();
		Thread.sleep(2000);
		obj.nav_supporthome().click();
	    
	}

	@Then("^users will  redirect to support home  page$")
	public void users_will_redirect_to_support_home_page() throws Throwable {
	    
	   
	}

}
