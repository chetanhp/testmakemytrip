/**
 * 
 */
package com.makemytrip.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.makemytrip.testcases.BaseClass;

/**
 * @author User
 *
 */
public class SearchflightsPage extends BaseClass  {
	
	//Web elements or object repository

	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[2]/div/div[1]/div[1]/ul/li[2]")
	WebElement roundtripradiobutton;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[3]/div[1]/div[1]/div/div/div/input")
	WebElement fromcity;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[3]/div[1]/div[5]/div/div/div/input")
	WebElement tocity;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div/button[1]")
	WebElement departon;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div/button[2]")
	WebElement returnon;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[4]/div/div[1]/select")
	WebElement adultdropdown;
	
	@FindBy(how=How.CSS,using="#root > div > div > div.container.w-100p.flex-1 > div > div.col-13.homeba > div > div:nth-child(6) > div > div:nth-child(3) > select")
	WebElement childerndropdown;
	
	
	@FindBy(how=How.XPATH,using="//button[text()=\"Search flights\"]")
	WebElement searchflightbutton;
	
	//inilizing cuurent webpage

public  SearchflightsPage() {
	PageFactory.initElements(driver, this);
}

//Actions
public MakeMyTripBookPage searchFlight() throws Exception {
    
	roundtripradiobutton.click();
	
	
return new MakeMyTripBookPage();
	}}
