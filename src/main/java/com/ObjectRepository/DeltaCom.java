package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.resources.FunctionalLibrary;

public class DeltaCom extends FunctionalLibrary {
	public DeltaCom(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}


	


	@FindBy(id="email")
	public WebElement myTrips;
	
	@FindBy(id="navBookTrip")
	private WebElement bookTrip;
	
	@FindBy(id="navFlightStatus")
	private WebElement flightStatus;
	
	@FindBy(id="navCheckIn")
	private WebElement checkIn;
	
	@FindBy(id="book-air-content-trigger")
	private WebElement flight;
	
	@FindBy(xpath="//span[text()='One Way']")
	private WebElement oneWay;
	
	
	@FindBy(id="originCity")
	private WebElement fromCity;
	
	@FindBy(id="destinationCity")
	private WebElement toCity;
	
	
	@FindBy(id="departureDate")
	private WebElement fromDate;
	
	@FindBy(id="returnDate")
	private WebElement toDate;
	
	@FindBy(id="findFlightsSubmit")
	private WebElement findFlights;
	
	
	
	
	
}
