package com.nexteticket.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexteticket.Pageobjectmodel.SamsungwatchesPOM;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Samsungwatches {
	
	WebDriver driver;
	
	@Given("^user visit samsung home page$")
	public void user_visit_samsung_home_page() throws Throwable {
		
		//how to open browser
		
		try {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64//chromedriver.exe");
	    driver = new ChromeDriver();
	
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    
		  //how to open URL
	    
	    driver.get ("https://www.samsung.com/us/");
	    
	    driver.manage().window().maximize();
		}
		catch(Exception e) {
			System.out.println("browser and url not opening");
		}
	    
	}

	@When("^user should move cursor on mobile option and select dropdown watches$")
	public void user_should_move_cursor_on_mobile_option_and_select_dropdown_watches() throws Throwable {
		
		try {
		
		Actions act= new Actions(driver);
		SamsungwatchesPOM obj = new SamsungwatchesPOM(driver);
		act.moveToElement(obj.nav_mobile()).build().perform();
		obj.nav_watches().click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		}
		catch(Exception e) {
			System.out.println("not a file or directory exception");
		}
	}
	@Then("^user will able to see all watches$")
	public void user_will_able_to_see_all_watches() throws Throwable {
	    
	}

}
