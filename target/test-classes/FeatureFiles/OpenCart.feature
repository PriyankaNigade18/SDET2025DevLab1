Feature: Test OpenCart application

  Scenario: Test Register functionality with valid set of data
    Given Open Register page using url "https://tutorialsninja.com/demo/index.php?route=account/register"
    When user enter all required fildes
      | fname | lname  | email              | telephone | password | cpassword |
      | Jay   | Nigade | jaya2025@gmail.com | 988776665 | test123  | test123   |
    And User select yes radio button
    And User check the privacy policy checkbox
    And User Click on Continue button
    Then User registartion should be complete and receive confirmation message

  Scenario: Test Login for register user
    Given Open Login page using url "https://tutorialsninja.com/demo/index.php?route=account/login"
    When User enter valid credentials
      | jaya2025@gmail.com | test123 |
    And user click on cart Login button
    Then User should able to navigate account page
