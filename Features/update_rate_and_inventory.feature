Feature: Update Rate and Inventory

  Scenario: Verify user can manage inventory and rates
    Given user logs into the BMS application
    And user selects property from the property list

    When user navigates to Rate and Inventory page
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

    And user logs out from the BMS application