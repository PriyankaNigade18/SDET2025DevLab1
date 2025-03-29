Feature: Test SwagLab login app

  Scenario: Test login with valid credentials
    Given Open Swaglab application
    When User enter valid "standard_user" and valid "secret_sauce"
    And User click on swaglab Login button
    Then User should navigate to Inventory page
