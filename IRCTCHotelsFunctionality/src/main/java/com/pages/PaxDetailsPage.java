package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.testbase.TestBase;



public class PaxDetailsPage extends TestBase {


	@FindBy(id = "materialLoginFormEmail")
	WebElement username;

	@FindBy(id = "materialLoginFormPassword")
	WebElement PassWord;

	@FindBy(xpath= "//div[@class='col-12 col-md-6 my-2']//form[@class='text-center ng-valid ng-dirty ng-touched']//button[@class='btn btn-primary-custom btn-primary my-2 waves-effect z-depth-0 waves-light']")
	WebElement SigninBtn;

	@FindBy(xpath="//div[@class='Hotel-listing-mid hotel-dtl-address mb-2']")
	WebElement getAssertPage;

	@FindBy(xpath="//select[@name='title']")
	WebElement Seltitle;

	@FindBy(xpath="//input[@name='firstName']")
	WebElement FirstName;

	@FindBy(xpath="//input[@name='lastName']")
	WebElement LastName;

	@FindBy(xpath="//select[@name='state']")
	WebElement SelState;

	@FindBy(xpath="//button[@class='btn btn-sm btn-primary-custom btn-primary m-0 waves-effect waves-light mx-1 font-14']")
	WebElement GoBtn;

	public PaxDetailsPage() 
	{
		PageFactory.initElements(driver,this);
	}

	public void enterUserName(String Username) 
	{
		username.sendKeys(Username);
	}
	
	public void enterPassword(String Password) 
	{
		PassWord.sendKeys(Password);
	}

	public WebElement Clickssignin() 
	{
		return SigninBtn;
	}

	public WebElement AssertPaxdetailspage()
	{
		return getAssertPage;
	}

	public void selectTitle(String Title)
	{	
		Select title1 = new Select (Seltitle);
		title1.selectByValue(Title);
	}
	
	public void enterFirstName(String Fname) 
	{
		FirstName.sendKeys(Fname);
	}
	
	public void enterLastName(String Lname) 
	{
		LastName.sendKeys(Lname);	
	}
	
	public void selectState(String State)
	{	
		Select state1 = new Select(SelState);
		state1.selectByVisibleText(State);
	}

	public TermsandConditions clicksGobtn()
	{	
		GoBtn.click();
		return new TermsandConditions();
	}

}
