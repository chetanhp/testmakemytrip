/**
 * 
 */
package com.makemytrip.pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
    JavascriptExecutor js = (JavascriptExecutor)driver;
	
	roundtripradiobutton.click();
	
	Thread.sleep(1000);	
	fromcity.click();
	Thread.sleep(1000);
	fromcity.sendKeys("Mumbai");
   Thread.sleep(1000);
	List<WebElement>selectfromcity=driver.findElements(By.xpath("//li[contains(@class,'ls-reset br-4 w-100p px-2 dropdown__item c-neutral-900 fs-3 hover:bg-secondary-500 hover:c-white c-pointer')]"));
	for(WebElement selfrom:selectfromcity) {
		System.out.println(selfrom.getText());
		if(selfrom.getText().equals(selectfromcity));
		selfrom.click();
	}
		Thread.sleep(1000);	
		tocity.click();
		Thread.sleep(1000);
		tocity.sendKeys("New Delhi");
		Thread.sleep(1000);
		List<WebElement>selecttocity=driver.findElements(By.xpath("//li[contains(@class,'ls-reset br-4 w-100p px-2 dropdown__item c-neutral-900 fs-3 hover:bg-secondary-500 hover:c-white c-pointer')]"));
		for(WebElement selto:selecttocity) {
			System.out.println(selto.getText());
			if(selto.getText().equals(selecttocity));
			selto.click();
		}
	departon.click();
	departon.sendKeys(Keys.ENTER);
	//WebElement fromdates=driver.findElement(By.cssSelector("#root > div > div > div.container.w-100p.flex-1 > div > div.col-13.homeba > div > div.row.pt-3.pb-6.p-relative.px-4 > div.row.pl-4.pr-4.p-relative > div > div > div > div > div.bg-white.br-4.elevation-5.p-1.p-absolute.mt-1.z-50.l-0.t-8 > ul > div.DayPicker.w-100p.Selectable > div > div.DayPicker-Months > div:nth-child(1) > div.DayPicker-Body > div:nth-child(4) > div:nth-child(3) > div > div"));
	// js.executeScript("scroll(481, 810)");
	    
	// fromdates.click();
	
	
	Select adultdropdwn=new Select(adultdropdown);
	
	adultdropdwn.selectByValue("2");
	
    Select childerndropdwn=new Select(childerndropdown);
	
    childerndropdwn.selectByValue("1");
    Thread.sleep(1000);
   
   js.executeScript("scroll(481, 810)");
    
    searchflightbutton.click();
	
return new MakeMyTripBookPage();
	}}
