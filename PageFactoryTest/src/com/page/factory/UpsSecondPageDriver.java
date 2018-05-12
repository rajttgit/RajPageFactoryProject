package com.page.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.junit.Test;

public class UpsSecondPageDriver 
{
	
	/*WebDriver driver = null;

	
	@BeforeMethod
	public void beforeMethod()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	@Test
	public void upsTrackingPageTest() throws InterruptedException
	{
		driver.get("https://www.ups.com/WebTracking/track?loc=en_US");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		UpsSecondPage up2 = new UpsSecondPage(driver);
		up2.tracking().click();
		Thread.sleep(1000);
		up2.shipping().click();
		Thread.sleep(1000);
		up2.services().click();
	}

	
	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}*/
	
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ups.com/WebTracking/track?loc=en_US");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		UpsSecondPage up2 = new UpsSecondPage(driver);
		up2.tracking().click();
		Thread.sleep(1000);
		up2.shipping().click();
		Thread.sleep(1000);
		up2.services().click();
		Thread.sleep(2000);
		driver.quit();
	}
	
}