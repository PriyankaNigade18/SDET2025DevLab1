Feature: Test Login of SwagLab application

  Background: 
    Given SwagLab home page is open

  Scenario: Test for the title of application
    When user get the title of application
    Then title should match with "Swag Labs"

  Scenario: Test for valid authentication
    When User enter valid username and password
    And click on login button
    Then User should able to login and navigated to Inventory page
