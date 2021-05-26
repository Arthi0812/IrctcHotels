package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testbase.TestBase;

public class FindHotelPage extends TestBase
{
	//WebDriverWait wait;
	
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	WebElement CovidAlertbtn;
	
	@FindBy(xpath="//input[@placeholder='Enter hotel name or city name']")
	WebElement HotelName;

	@FindBy(name="dt12")
	WebElement Checkindateclick;

	@FindBy(name="dt13")
	WebElement Checkoutdateclick;

	@FindBy(xpath ="//button[contains(text(),'Find Hotel')]")
	WebElement Findhotelbtn;

	@FindBy(id="hotel-dtl-sticky-photo")
	WebElement Hotelphotos;

	@FindBy(xpath="//button[@class='btn btn-primary-custom btn-primary m-0 btn-lg']")
	WebElement ContinueBtn;
	
	public FindHotelPage() 
	{
		PageFactory.initElements(driver,this);
		//wait = new WebDriverWait(driver,20);
	}
	
	public WebElement ClickCovidAlertBtn() 
	{
		// TODO Auto-generated method stub
		return CovidAlertbtn;
	}
	
	public void EnterHotelName(String Hotelname) 
	{
		 HotelName.sendKeys(Hotelname);
			
	}
	
	public WebElement setHotelName() 
	{
		WebElement Hotelselection=driver.findElement(By.xpath("//searchbox//li//span[contains(text(),'"+prop.getProperty("Hotel")+"')]"));
		//wait.until(ExpectedConditions.visibilityOf(Hotelselection));
		Hotelselection.click();
		return Hotelselection;
	}
	
	public WebElement ClickCheckindate() 
	{
		return Checkindateclick;
	}
	
	public WebElement SelectCheckindate() 
	{
        WebElement Checkindate=driver.findElement(By.xpath("//div[@id='cdk-overlay-0']//table[@class='owl-dt-calendar-table owl-dt-calendar-month-table']//td[not (@aria-disabled='true')][@aria-label='"+prop.getProperty("CIdate")+"']"));
        //wait.until(ExpectedConditions.visibilityOf(Checkindate));
        Checkindate.click();
		return Checkindate;
	}
	
	public WebElement ClickCheckoutdate() 
	{
		return Checkoutdateclick;
	}
	
	public WebElement SelectCheckoutdate() 
	{
		
		WebElement Checkoutdate=driver.findElement(By.xpath("//div[@id='cdk-overlay-1']//table[@class='owl-dt-calendar-table owl-dt-calendar-month-table']//td[not (@aria-disabled='true')][@aria-label='"+prop.getProperty("COdate")+"']"));
		//wait.until(ExpectedConditions.visibilityOf(Checkoutdate));
        Checkoutdate.click();
		return Checkoutdate;
	}
	
	public WebElement clicksFindhotelbtn() 
	{
		return Findhotelbtn;
	}
	
	public WebElement checkhotelpagedispayed()
	{	
		return Hotelphotos;
	}
	
	public PaxDetailsPage clicksContinueBtn() 
	{	
		ContinueBtn.click();
		return new PaxDetailsPage();
	}
	
}


