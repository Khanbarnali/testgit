package com.nexteticket.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import com.nexteticket.Pageobjectmodel.YahoosignupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Yahoosignup {
	
	WebDriver driver;
	
	@Given("^user visit yahoo home page$")
	public void user_visit_yahoo_home_page() throws Throwable {
		//how to open browser
		
				try {
				System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64//chromedriver.exe");
			    driver = new ChromeDriver();
			    
			  //how to open URL
			    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			    
			    
			    driver.get ("https://login.yahoo.com/account/create");
			    
			    driver.manage().window().maximize();
				}
				catch(Exception e) {
					System.out.println("browser and url not opening");
				}
		
	}

	@When("^user type \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_type_and(String arg1, String arg2, String arg3) throws Throwable {
		try {
	
		YahoosignupPOM yahoo=new YahoosignupPOM(driver);
		yahoo.fullname().sendKeys(arg1);
	    yahoo.newyahoomail().sendKeys(arg2);
	    yahoo.password().sendKeys(arg3);
		}
	    
	  catch(Exception e) {
		  System.out.println("illigel arguments exception");
	  }
	   
		
	}

	@Then("^user should select dropdown month and type \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_should_select_dropdown_month_and_type_and(String arg1, String arg2) throws Throwable {
		
	try {
	
	
		YahoosignupPOM yahoo=new YahoosignupPOM(driver);
		Select dropdown= new Select(yahoo.click_month);
		dropdown.selectByIndex(2);
		yahoo.day().sendKeys();
	    yahoo.year().sendKeys();
	}
	catch(Exception e) {
	System.out.println("elements not found exception"); 
	}
	}


}
