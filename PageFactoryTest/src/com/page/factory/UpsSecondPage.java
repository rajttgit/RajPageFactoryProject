package com.page.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpsSecondPage 
{
	
	WebDriver driver;
	
	
	public UpsSecondPage (WebDriver d)
	{
		this.driver = d ;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//*[@id='ups-menuLinks0']") 
	WebElement tracking;
	
	@FindBy(xpath = "//*[@id='ups-menuLinks1']")
	WebElement shipping;
	
	@FindBy(xpath = "//*[@id='ups-menuLinks2']")
	WebElement services;
	
	
	public WebElement tracking()
	{
		return tracking;
	}
	
	public WebElement shipping()
	{
		return shipping;
	}
	
	public WebElement services()
	{
		return services;
	}
	
}