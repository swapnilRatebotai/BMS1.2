Feature: Photos and videos management

  Scenario: Verify user can upload and delete cover and room photos successfully
    Given user logs into the BMS application
    And user selects property from the property list

    When user navigates to Photos and Videos page
    And user uploads cover photo
    Then user clicks on save photos button
    When user uploads room photo and select room
    Then user clicks on save photos button

    When user deletes uploaded room photo
    And user deletes uploaded cover photo

    Then user logs out from the BMS application
