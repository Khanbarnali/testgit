package com.nexteticket.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexteticket.Pageobjectmodel.LearnmorebuttonPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Learnmorebutton {
	
	WebDriver driver;
	
	@Given("^user should visit nesteticket home page$")
	public void user_should_visit_nesteticket_home_page() throws Throwable {
		
		//how to open browser
		
				try {
				System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64//chromedriver.exe");
			    driver = new ChromeDriver();
			 
			    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			    
			     //how to open URL
			    
			    driver.get ("https://nexteticket.com/");
			    
			    driver.manage().window().maximize();
				}
				catch(Exception e) {
					System.out.println("browser and url not opening");
				}
				}

@When("^user should click on learn more button on the header of page$")
public void user_should_click_on_learn_more_button_on_the_header_of_page() throws Throwable {
    
		
	}
@Then("^user should see event page$")
public void user_should_see_event_page() throws Throwable {
    
	try {
		LearnmorebuttonPOM button=new LearnmorebuttonPOM(driver);
	    button.learnmorebutton().click();
	    WebDriverWait wait=new WebDriverWait(driver,20);
	}
	catch(Exception e) {
		System.out.println("element not found exception");
	}
	}


}
