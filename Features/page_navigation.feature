Feature: all page navigation

  Scenario: Verify all pages are displayed correctly
    
#   Given user login with username as "swapnil.patil@ratebotai.com" and password as "Test@2025"
	Given user logs into the BMS application
    Then user is on the My Properties page
    
    When user selects property from the property list
    Then user is on the Channel Manager page

    When user navigates to Bookings page
    Then user is on the Bookings page

    When user navigates to Basic Info page
    Then user is on the Basic Info page

    When user navigates to Contacts page
    Then user is on the Contacts page

    When user navigates to Location page
    Then user is on the Location page

    When user navigates to Rooms page
    Then user is on the Rooms page

    When user navigates to Photos and Videos page
    Then user is on the Photos and Videos page

    When user navigates to Rate and Inventory page
    Then user is on the Rate and Inventory page

    When user navigates to Cancellation Policy page
    Then user is on the Cancellation Policy page

    When user navigates to Payment Policy page
    Then user is on the Payment Policy page

    When user navigates to Discounts page
    Then user is on the Discounts page

    When user navigates to Email Configuration page
    Then user is on the Email Configuration page

    When user navigates to Payment Gateway page
    Then user is on the Payment Gateway page

    When user navigates to Hotel Logo page
    Then user is on the Hotel Logo page
    
    When user logs out from the BMS application
    Then user is on the login page
