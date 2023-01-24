Feature: To test login functionality

  Scenario:
    Given User is on login page
    When User enters correct login as "abc@gmail.com" and password as "password123"
    And Clicks on login button
    Then User should be presented with landing page