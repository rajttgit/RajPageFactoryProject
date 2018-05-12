package com.page.factory;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UpsFirstPageDriver 
{
	
	WebDriver driver = null;
	
	
	@BeforeMethod
	public void beforeMethod() 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}

	
	@Test
	public void upsHomePageTest() throws InterruptedException
	{
		driver.get("https://www.ups.com/us/en/Home.page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		UpsFirstPage up1 = new UpsFirstPage(driver);
		up1.tracking().click();
		Thread.sleep(1000);
		up1.shipping().click();
		Thread.sleep(1000);
		up1.services().click();
	}	
		
	
	@AfterMethod
	public void afterMethod() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.quit();
	}
	
}