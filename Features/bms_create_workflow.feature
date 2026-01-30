Feature: BMS Start to End Workflow Happypath

  Scenario: Verify all pages are working correctly 
  
  Given the user signs up for the BMS application
  When the user verifies the account via email
  And  user logs into the BMS application
  Then user is on the Channel Manager page
    
    When user navigates to My Properties page
    
    When user navigates to My Profile page
    And user clicks on Edit Profile
    And user updates profile details
    And user clicks on Save Changes
    Then user navigates back from the profile page
    
    Then user is on the Basic Info page
    And user enters the property details
    And user submits the property information
    
    Then user is on the Contacts page
    And user enters the contact details
    And user saves the Contact details
    
    Then user is on the Location page
    And user enters the location details
    And user saves the Location details
    
    When user navigates to Rooms page
    Then user is on the Rooms page
    And user enters valid room details
    Then user creates the room
    When user enters valid rate plan details
    Then user creates the rate plan
    
    When user navigates to Photos and Videos page
    Then user is on the Photos and Videos page
    And user uploads cover photo
    Then user clicks on save photos button
    When user uploads room photo and select room
    Then user clicks on save photos button
    When user deletes uploaded room photo
    And user deletes uploaded cover photo
    
    When user navigates to Rate and Inventory page
    Then user is on the Rate and Inventory page
    And user opens all rooms rate plans
    When user closes a single room rate plan
    And user opens the single room rate plan
    When user clicks on bulk update
    And user updates inventory details
    And user updates rate details
    When user selects a date from the calendar
    And user navigates to previous calender chart
    And user navigates to next calender chart
    Then user close all rooms rate plans
    
    When user navigates to Cancellation Policy page
    Then user is on the Cancellation Policy page
    And user creates a simple cancellation policy
    And user deletes simple cancellation policy
    Then user creates a custom cancellation policy
    And user deletes custom cancellation policy
    
    When user navigates to Payment Policy page
    Then user is on the Payment Policy page
    And user creates payment policy
    Then user deletes payment policy
    
    When user navigates to Discounts page
    Then user is on the Discounts page
    And user creates a discount
    Then user deletes the discount
    
    When user navigates to Email Configuration page
    Then user is on the Email Configuration page
    And user updates email configuration details
    And user clicks on update email configuration button
    
    When user navigates to Payment Gateway page
    Then user is on the Payment Gateway page
    
    When user navigates to Hotel Logo page
    Then user is on the Hotel Logo page
    And user uploads hotel logo
    And user clicks on submit hotel logo button
    
    When user navigates to Channel Manager page
    Then user is on the Channel Manager page
    And user connects the channel manager
    Then user clicks on reveal secret code
    And user disconnects the channel manager
    
    When user navigates to Bookings page
    Then user is on the Bookings page
    And user selects from date and to date
    When user selects booking status as confirmed
    And user clicks on WhatsApp connect to contact customer
    When user selects booking status as cancelled
    And user clicks on WhatsApp connect to contact customer
    When user selects booking filter as check-in
    And user selects booking filter as check-out
    
    When user logs out from the BMS application
    Then user is on the login page
    
    