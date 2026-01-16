Feature: Update Discounts

  Scenario: Verify user can create and delete discount successfully
    Given user logs into the BMS application
    And user selects property from the property list

    When user navigates to Discounts page
    And user creates a discount

    Then user deletes the discount
    And user logs out from the BMS application
