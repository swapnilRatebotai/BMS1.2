Feature: Update Email configuration

  Scenario: Verify user can update email configuration successfully
    Given user logs into the BMS application
    And user selects property from the property list

    When user navigates to Email Configuration page
    And user updates email configuration details
    And user clicks on update email configuration button

    And user logs out from the BMS application
