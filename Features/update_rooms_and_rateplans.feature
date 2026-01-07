Feature: Rooms and rate plan management

  Scenario: Verify user can update room details and rate plan successfully
    Given user logs into the BMS application
    And user selects property from the property list

    When user navigates to Rooms page
    And user updates selected room details
    Then user clicks on update room button

    When user opens rate plans section
    And user updates rate plan details
    Then user clicks on update rate plan button

    And user logs out from the BMS application