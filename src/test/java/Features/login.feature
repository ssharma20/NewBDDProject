Feature: To test login functionality

  @SmokeTest
  Scenario:
    Given User is on login page
    When User enters correct login and password
    And Clicks on login button
    Then User should be presented with landing page