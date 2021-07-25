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

	@FindBy(how=How.XPATH,using="//li[@data-cy='oneWayTrip']")
	WebElement onewayradiobutton;
	
	@FindBy(how=How.XPATH,using="//li[@data-cy='roundTrip']")
	WebElement roundtripradiobutton;
	
	@FindBy(how=How.XPATH,using="//li[@data-cy='mulitiCityTrip']")
	WebElement multicityradiobutton;
	
	//inilizing cuurent webpage

public  SearchflightsPage() {
	PageFactory.initElements(driver, this);
}

//Actions
public MakeMyTripBookPage searchFlight() throws Exception {
    
	multicityradiobutton.click();
	
	
	
	
	
return new MakeMyTripBookPage();
	}}
