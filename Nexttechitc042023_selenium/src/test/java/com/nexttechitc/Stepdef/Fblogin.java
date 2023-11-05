package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.FbloginPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fblogin {
	
	WebDriver driver;
	

	@Given("^user visits Fb homepage$")
	public void user_visits_Fb_homepage() throws Throwable {
		
		//how to open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32//chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    // how to open URL
	    
	    driver.get("https://www.facebook.com/");
	    
	    driver.manage().window().maximize();
	    
	 }
	

	@When("^user types \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_types_and(String arg1, String arg2) throws Throwable {
		
		//how to create an object of POM class
	 try {
		FbloginPOM obj=new FbloginPOM(driver);	
		obj.emailadress().sendKeys(arg1);
		obj.password().sendKeys(arg2);
	    obj.click_login().click();
	    
	   WebDriverWait wait=new WebDriverWait(driver,10);
	}
	catch (Exception e) {
	System.out.println("ilegal argument exception ");
		
	}
		}

	@When("^user should click on Fblogin button$")
	public void user_should_click_on_Fblogin_button() throws Throwable {
	    
		
			}

	@Then("^user should able be able to redirected to Fblogin$")
	public void user_should_able_be_able_to_redirected_to_Fblogin() throws Throwable {
	    
	  //how to close the window
		driver.close();
		
		//how to quit the window
		//driver.quit();
	}
	

	
	
	
	
	

	
	
}
