package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.AmazonsearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonsearch { 
	
	WebDriver driver;

  @Given("^user visit amazon homepage$")
public void user_visit_amazon_homepage() throws Throwable {
	  
	  //How to open the browser
	  
	  System.setProperty("webdriver.chrome.driver" , "C:\\Users\\khana\\eclipse-workspace\\Nexttechitc042023_selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    //how to open URL
	    try {
	    driver.get("https://www.amazon.com/");

	    }
	    catch(Exception e) {
	    	System.out.println("driver not found exception");
	    	
	    }

 }
  

@When("^user type \"([^\"]*)\" and click search icon$")
public void user_type_and_click_search_icon(String arg1) throws Throwable {
   
	// create an object of POM class
	
	try {
	AmazonsearchPOM obj= new AmazonsearchPOM(driver);
   obj.Amazonsearch().sendKeys(arg1);
   obj.searchicon().click();
	}
	catch(Exception e) {
		System.out.println("element not found exception");
	}
}
@Then("^user should able to see the expected product$")
public void user_should_able_to_see_the_expected_product() throws Throwable {
    
   }
}
