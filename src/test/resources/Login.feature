Feature: LoginToApplication.

  Scenario: Verify Login Functionality.
    Given Login to sabor application
    Then User need to provide user and pass
    And User should check first page
    Then User should check SOGEA avaialability