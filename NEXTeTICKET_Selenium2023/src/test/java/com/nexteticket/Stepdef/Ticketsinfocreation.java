package com.nexteticket.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexteticket.Pageobjectmodel.TicketsinfocreationPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Ticketsinfocreation {
	WebDriver driver;

	@Given("^User should visit nexteticket home page$")
	public void user_should_visit_nexteticket_home_page() throws Throwable {
	    
		
		//how to open browser
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64//chromedriver.exe");
	    driver = new ChromeDriver();
		
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64//chromedriver.exe");
		    driver = new ChromeDriver();
		    
		 
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    
		    //how to open URL
		    
		    driver.get ("https://nexteticket.com/");
		    
		    
		    driver.manage().window().maximize();
		    
		    JavascriptExecutor jsx = (JavascriptExecutor)driver;
		    jsx.executeScript("window.scrollBy(0,7500)");
		
			}
			catch(Exception e) {
				System.out.println( "browser and url not opening");
				
				
			}
	}

	@When("^User should go to Ticket info part$")
	public void user_should_go_to_Ticket_info_part() throws Throwable {
		
		try {
			
		
		TicketsinfocreationPOM ticket=new TicketsinfocreationPOM(driver);
		System.out.println(ticket.Tickestinfo.getText());
		WebDriverWait wait=new WebDriverWait(driver,20);
		}
		catch(Exception e) {
			System.out.println("elements not found" );
		}
	}

	

	@Then("^User should see name: NEXTTECH ITC phone: (\\d+)-(\\d+)-(\\d+) and email: ticket@nexttechitc\\.com under the tickets info$")
	public void user_should_see_name_NEXTTECH_ITC_phone_and_email_ticket_nexttechitc_com_under_the_tickets_info(int arg1, int arg2, int arg3) throws Throwable {
		
	}
	
}
