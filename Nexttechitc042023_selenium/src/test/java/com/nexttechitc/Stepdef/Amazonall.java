package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import com.nexttechitc.Pageobjectmodel.AmazonallPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonall {
	WebDriver driver;
	

@Given("^user visits amazon homepage$")
public void user_visits_amazon_homepage() throws Throwable {  
	
	 //How to open the browser
	
	 try{ 
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64//chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    //how to open URL
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    driver.get("https://www.amazon.com/");

	    driver.manage().window().maximize();
	 }

 catch(Exception e) {
 System.out.println("driver not found exception");
 }
	 
}

@When("^user  goes to all menu and click$")
public void user_goes_to_all_menu_and_click() throws Throwable {
	
	try {
	AmazonallPOM obj1=new AmazonallPOM(driver);

	}

	catch(Exception e) {
		 
		System.out.println("elements not found exception");
	}	
	}
@Then("^user select dropdown amazon pharmacy$")
public void user_select_dropdown_amazon_pharmacy() throws Throwable {
try {
	AmazonallPOM obj1 = new AmazonallPOM(driver);
	Select dropdown=new Select(obj1.all);
	dropdown.selectByIndex(3);
			
}
catch(Exception e) {
	System.out.println("elements not found exception");
}
		
	
	
	
	

	
	
	
	 

}


}

