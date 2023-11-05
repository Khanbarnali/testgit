package com.nexteticket.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexteticket.Pageobjectmodel.BuyticketbuttonPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Buyticketbutton {
	
	
	WebDriver driver;
	
	@Given("^user visits nexteticket home page$")
	public void user_visits_nexteticket_home_page() throws Throwable {
		
		//how to open browser
		
		try {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64//chromedriver.exe");
	    driver = new ChromeDriver();
	    
	  
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    //how to open URL
	    driver.get ("https://nexteticket.com/");
	    
	    driver.manage().window().maximize();
		
		//JavascriptExecutor jsx = (JavascriptExecutor)driver;
	   // jsx.executeScript("window.scrollBy(0,8000)");
	   // Thread.sleep(5000);
		}
		
		catch(Exception e) {
			System.out.println("browser and url not opening");
			
		}
	}
		@When("^user scrool down and click buy ticket button$")
		public void user_scrool_down_and_click_buy_ticket_button() throws Throwable {
			
		try {
		   
		BuyticketbuttonPOM obj1=new BuyticketbuttonPOM(driver);
		obj1.click_buyticket().click();
		Thread.sleep(3000);
		
		obj1.click_buyticket_earlybird15.click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		
		obj1.click_buyticket_regular20.click();
		Thread.sleep(5000);
	    driver.navigate().back();
	    Thread.sleep(5000);
	    
		obj1.click_buyticket_platinum45.click();
	
		WebDriverWait wait=new WebDriverWait(driver,20);
		
		}
		catch(Exception e) {
		
		System.out.println("elements not found exception");
			
		}
	}

		@Then("^user will able to see EARLY BIRD and REGULAR  and PLATINUM  and details$")
		public void user_will_able_to_see_EARLY_BIRD_and_REGULAR_and_PLATINUM_and_details() throws Throwable {
		
		
	
	}

}
