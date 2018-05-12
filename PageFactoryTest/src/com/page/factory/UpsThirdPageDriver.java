package com.page.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UpsThirdPageDriver 
{
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void upsShippingPageTest() throws InterruptedException
	{
		driver.get("https://wwwapps.ups.com/ctc/request?loc=en_US");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		UpsThirdPage up3 = new UpsThirdPage(driver);
		up3.city().sendKeys("asdasd");
		Thread.sleep(1000);
		up3.zip().sendKeys("jkljkjkj");
		Thread.sleep(1000);
		up3.resadd().click();
	}
	
	
	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.quit();
	}
		
}