package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbase.TestBase;

public class TermsandConditions extends TestBase {
	
	@FindBy(xpath="//div[@class='col-12 col-sm-6 col-md-4 py-2 hotel-Paxdetail-section']")
	WebElement DetailVerification;

	@FindBy(xpath ="//label[contains(text(),'I Agree with the')]")
	@CacheLookup
	WebElement AgreeCB;
	
	@FindBy(xpath="//button[contains(text(),'Make Payment')]")
	WebElement MakePaymentBtn;
	
	public TermsandConditions() 
	{
		PageFactory.initElements(driver,this);
	}
	
	public boolean VerifyDetailspage() 
	{
		// TODO Auto-generated method stub
		return DetailVerification.isDisplayed();
	}
	
	public WebElement ClicksAgreeCB()
	{	
		return AgreeCB;
	}
	public WebElement ClicksMakePaymentBtn()
	{	
		return MakePaymentBtn;
	}
	
}
