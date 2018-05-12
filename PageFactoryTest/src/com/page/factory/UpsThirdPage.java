package com.page.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpsThirdPage 
{

	WebDriver driver;

	
	public UpsThirdPage (WebDriver driver2)
	{
		driver = driver2 ;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name = "origCity")
	WebElement city;
	
	@FindBy(id = "orig_PostalCode")
	WebElement zip;
	
	@FindBy(xpath = "//*[@id=\"origType\"]/div/label")
	WebElement resadd;
	
	
	public WebElement city()
	{
		return city;
	}
	
	public WebElement zip()
	{
		return zip;
	}
	
	public WebElement resadd()
	{
		return resadd;
	}
		
}