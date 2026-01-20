Feature: Bookings Page Workflow

  Scenario: Verify bookings can be filtered by status and WhatsApp connection works
    Given user logs into the BMS application
    And user selects property from the property list

    When user navigates to Bookings page
    And user selects from date and to date

    When user selects booking status as confirmed
    And user clicks on WhatsApp connect to contact customer

    When user selects booking status as cancelled
    And user clicks on WhatsApp connect to contact customer
    
    When user selects booking filter as check-in
    And user selects booking filter as check-out

    Then user logs out from the BMS application