Feature: Update Channel manager

  Scenario: Verify user can disconnect, reconnect, and view secret code for channel manager
    Given user logs into the BMS application
    And user selects property from the property list

    When user navigates to Channel Manager page
    And user disconnects the channel manager

    And user connects the channel manager
    Then user clicks on reveal secret code

    And user logs out from the BMS application