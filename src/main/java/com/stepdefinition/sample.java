package com.stepdefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ObjectRepository.DeltaCom;

public class sample {
	
	
	public static void main(String[] args) {
			WebDriver driver;
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Rahulji\\Desktop\\ServiceNow\\Automation\\src\\test\\resources\\lib\\chromedriver11.exe");
	 driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	DeltaCom s=new DeltaCom(driver);
	/*WebElement uname = driver.findElement(By.id("email"));
	uname.sendKeys("a");*/
	s.myTrips.sendKeys("aa");
	System.out.println("wuvb");
	

}}
