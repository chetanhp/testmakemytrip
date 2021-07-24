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
		String exp="This route is now open";
				String act=driver.findElement(By.xpath("//span[text()='This route is now open']")).getText();
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
