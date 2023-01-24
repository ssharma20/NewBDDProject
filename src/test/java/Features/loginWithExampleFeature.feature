Feature: Login function.

  Scenario Outline: Login with different set of data
    Given the user is at the login page of the application
    When the user enters "<username>" and "<password>"
    Then the user is present with the landing page
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | Locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
