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
public class MakeMyTripBookPage extends BaseClass{
	
	//Web elements or object repository

		@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/main/div/div/div[2]/div[2]/div[5]/div/div[2]/button")
		WebElement bookbtn;
		
		//inilizing cuurent webpage

		public  MakeMyTripBookPage() {
			PageFactory.initElements(driver, this);
		}
		
		//Actions
		public BookFlightPage clickbookbtn()  {
			bookbtn.click();
			return new BookFlightPage();
		}

}
