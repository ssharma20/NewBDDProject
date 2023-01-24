Feature: To test login functionality

  Scenario: Login with valid credentials
    Given User is on login page
    When User enters following credentials
      | user1 | password |
      | user2 | password2 |
    And Clicks on login button
    Then User should be presented with landing page

