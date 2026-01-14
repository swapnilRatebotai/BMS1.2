Feature: Update Policies 

  Scenario: Verify user can manage cancellation and payment policies successfully
    Given user logs into the BMS application
    And user selects property from the property list

    When user navigates to Cancellation Policy page
    And user creates a simple cancellation policy
    And user deletes simple cancellation policy

    Then user creates a custom cancellation policy
    And user deletes custom cancellation policy

    When user navigates to Payment Policy page
 #   And user creates payment policy
 #   Then user deletes payment policy

    And user logs out from the BMS application