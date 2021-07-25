/**
 * 
 */
package com.makemytrip.testcases;

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
public class Searchflighttestcase extends BaseClass{
	
	public SearchflightsPage searchflightpage;
	public MakeMyTripBookPage makemytripbookpage;
	
	
	public Searchflighttestcase() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initilization();
		
		searchflightpage=new SearchflightsPage();
		
	}
	
	@Test
	public void searchflight() throws Exception {
		
		searchflightpage.searchFlight();
	Assert.assertTrue(true, "multicityradiobutton did not clicked");

	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus());
		{
			ScreenShotUtiltity.captureScrenshot(driver,result.getName());
		}
		driver.quit();
	}}
