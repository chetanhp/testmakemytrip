/**
 * 
 */
package com.makemytrip.testcases;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.makemytrip.pages.MakeMyTripBookPage;
import com.makemytrip.pages.SearchflightsPage;

import utilities.ScreenShotUtiltity;

/**
 * @author User
 *
 */
public class MakeMyTripBooktestcase extends BaseClass{
	

	public SearchflightsPage searchflightpage;
	public MakeMyTripBookPage makemytripbookpage;
	

	public MakeMyTripBooktestcase() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initilization();
		
		makemytripbookpage=new MakeMyTripBookPage();
		
	}
	
	@Test
	public void clickbookflight() {
		
		makemytripbookpage.clickbookbtn();
		String exp="Review your itinerary";
				String act=driver.findElement(By.xpath("//h2[text()=\"Review your itinerary\"]")).getText();
				Assert.assertEquals(true,act.contains(exp),"text did not match");

	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus());
		{
			ScreenShotUtiltity.captureScrenshot(driver,result.getName());
		}
		driver.quit();
	}}

	
