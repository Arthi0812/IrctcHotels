Feature: Hotel Booking with Valid details

Scenario: User Selects hotel and entering personal details

Given User is on landing page
And User enters Hotelname
And User enters Checkindate and Checkoutdate
When User clicks on FINDHOTEL button
Then User get in to Hotel detail section Page
And User clicks on CONTINUE TO BOOK button
Given user Enters UserName and Password
When User clicks on 'SIGN IN' button
Then User get in to Pax Details PAGE.
Given User Selects Title and State
And User enters First name and Last Name
When User clicks on 'Go' button
Then User get in to Hotel Pax detail page
And User Selects on Terms and condtions
Then User Select on 'MAKE PAYMENT' button