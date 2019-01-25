package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ObjectRepository.DeltaCom;
import com.resources.FunctionalLibrary;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeltaStepDefinition extends FunctionalLibrary
{
	
	public static WebDriver driver;
	@Given("^User should be in fb login page \"([^\"]*)\"$")
public void user_should_be_in_fb_login_page(String arg1)  {
		 driver = driverInit("chrome");
		 driver.get(arg1);
		
		
}
	
@When("^User enter the username \"([^\"]*)\"$")
public void user_enter_the_username(String arg1)  {
	DeltaCom s=new DeltaCom(driver);
	setText(s.myTrips,arg1);
	//s.myTrips.sendKeys(arg1);
	
}

@When("^User enter the password\"([^\"]*)\"$")
public void user_enter_the_password(String arg1) {

	System.out.println(arg1);
}

@When("^User click the login button$")
public void user_click_the_login_button() {
	System.out.println("111");
}

@Then("^User verify the profilename$")
public void user_verify_the_profilename()  {
	System.out.println("1111");
}

}