Feature: User profile management

  Scenario: Verify user can edit and save profile details successfully
    Given user logs into the BMS application
    When user navigates to My Profile page
    And user clicks on Edit Profile
    And user updates profile details
    And user clicks on Save Changes
    Then user navigates back from the profile page