Feature: Update Hotel logo

  Scenario: Verify user can upload and submit hotel logo successfully
    Given user logs into the BMS application
    And user selects property from the property list

    When user navigates to Hotel Logo page
    And user uploads hotel logo
    And user clicks on submit hotel logo button

    Then user logs out from the BMS application
