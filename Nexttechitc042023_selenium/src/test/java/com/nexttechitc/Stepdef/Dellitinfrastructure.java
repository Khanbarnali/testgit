package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.DellitinfrastructurePOM;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dellitinfrastructure {
	
	WebDriver driver;
	
	@Given("^users should visit Dell homepage$")
	public void users_should_visit_Dell_homepage() throws Throwable {
		
		//how to open browser
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32//chromedriver.exe");
		    driver = new ChromeDriver();
		    
		    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 // how to open the URL
			
			driver.get("https://www.dell.com/en-us");
			//driver.manage().window().maximize();
			//Thread.sleep(2000);
	    
	}

	@When("^users should go to the itinfrastructure option and click on developers & devops$")
	public void users_should_go_to_the_itinfrastructure_option_and_click_on_developers_devops() throws Throwable {
	    
		try {
		Actions act= new Actions(driver);
		DellitinfrastructurePOM obj = new DellitinfrastructurePOM(driver);
		act.moveToElement(obj.nav_itinfrastructure()).build().perform();
		Thread.sleep(2000);
		obj.nav_developerdevops().click();
	 
		}
		catch(Exception e) {
			
			                  
			
		}
	}

	@Then("^users should be redirected to developers & devops  page$")
	public void users_should_be_redirected_to_developers_devops_page() throws Throwable {
	    
	    
	}

}
