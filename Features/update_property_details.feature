Feature: Update Property details
    
    Scenario: Verify user can update property basic info, contacts, location and logout
    Given user logs into the BMS application
    And user selects property from the property list

    When user navigates to Basic Info page
#    And user updates property details
 #   And user clicks on save property details button

    When user navigates to Contacts page
#    And user updates contact details
#    And user clicks on update contact button

    When user navigates to Location page
    And user updates location details
    And user clicks on update location button

    And user logs out from the BMS application