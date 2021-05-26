package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.pages.FindHotelPage;
import com.pages.PaxDetailsPage;
import com.pages.TermsandConditions;
import com.testbase.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class StepDefinitions extends TestBase {
	
	WebDriver driver;
	FindHotelPage FHP ;
	PaxDetailsPage PDP;
	TermsandConditions TAC ;
	 
	@Given("^User is on landing page$")
	public void user_is_on_landing_page() throws Throwable 
	{
		// Write code here that turns the phrase above into concrete actions
		initialization();
		FHP = new FindHotelPage();
		FHP.ClickCovidAlertBtn().click();
	}
	
	@Given("User enters Hotelname")
	public void user_enters_Hotelname() throws Throwable 
	{
		// Write code here that turns the phrase above into concrete actions
		FHP.EnterHotelName(prop.getProperty("Hotel"));
		Thread.sleep(3000);
		FHP.setHotelName();
	}

	@Given("^User enters Checkindate and Checkoutdate$")
	public void user_enters_Checkindate_and_Checkoutdate() throws Throwable 
	{
		FHP.ClickCheckindate().click();
		Thread.sleep(3000);
		FHP.SelectCheckindate();
		FHP.ClickCheckoutdate().click();
		Thread.sleep(3000);
		FHP.SelectCheckoutdate();
	}
	
	@When("^User clicks on FINDHOTEL button$")
	public void user_clicks_on_FINDHOTEL_button() throws Throwable 
	{
	   FHP.clicksFindhotelbtn().click();
	}

	
	@Then("^User get in to Hotel detail section Page$")
	public void user_get_in_to_Hotel_detail_section_Page() throws Throwable 
	{
		Thread.sleep(3000);
		WebElement Hotelphotos=FHP.checkhotelpagedispayed();
		Assert.assertTrue(Hotelphotos.isDisplayed());
		System.out.println("Hotel Photos and Room Photos are displayed");
	}

	@Then("^User clicks on CONTINUE TO BOOK button$")
	public void user_clicks_on_CONTINUE_TO_BOOK_button() throws Throwable 
	{
		PDP=FHP.clicksContinueBtn();
	}
	
	@Given("^user Enters UserName and Password$")
	public void user_Enters_UserName_and_Password() throws Throwable 
	{
		Thread.sleep(1000);
	   	PDP.enterUserName(prop.getProperty("Username"));
		PDP.enterPassword(prop.getProperty("Password"));
	}

	@When("^User clicks on 'SIGN IN' button$")
	public void user_clicks_on_SIGN_IN_button() throws Throwable 
	{
	   PDP.Clickssignin().click();

    }
	
	@Then("^User get in to Pax Details PAGE\\.$")
	public void user_get_in_to_Pax_Details_PAGE() throws Throwable 
	{
	   Assert.assertEquals(PDP.AssertPaxdetailspage().getText(), "Personal Details");
	   System.out.println("User Have to Enter Personal Details-->Here");
	}
	
	@Given("^User Selects Title and State$")
	public void user_Selects_Title_and_State() throws Throwable 
	{
		PDP.selectTitle(prop.getProperty("Title"));
		PDP.selectState(prop.getProperty("State"));
	}

	@Given("^User enters First name and Last Name$")
	public void user_enters_First_name_and_Last_Name() throws Throwable 
	{
		PDP.enterFirstName(prop.getProperty("Fname"));
		PDP.enterLastName(prop.getProperty("Lname"));
	}

	@When("^User clicks on 'Go' button$")
	public void user_clicks_on_Go_button() throws Throwable 
	{
		TAC=PDP.clicksGobtn();
	}
	
	@Then("^User get in to Hotel Pax detail page$")
	public void user_get_in_to_Hotel_Pax_detail_page() throws Throwable 
	{
	   Assert.assertTrue(TAC.VerifyDetailspage());
	   System.out.println("User Must Agree to Terms and Conditions");
	}
	
	@Then("^User Selects on Terms and condtions$")
	public void user_Selects_on_Terms_and_condtions() throws Throwable 
	{
		TAC.ClicksAgreeCB().click();
	}
	
	@Then("^User Select on 'MAKE PAYMENT' button$")
	public void user_Select_on_MAKE_PAYMENT_button() throws Throwable 
	{
		TAC.ClicksMakePaymentBtn().click();
	}

	}