Feature: Test Orangehrm application

  Scenario Outline: Test Hrm login for Data driven test
    Given Open Orangehrm application
    When user enter "<username>" and "<password>"
    When user click on hrm login button
    Then as per valid credentials user should be able to navigate to dashboard page

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | shweta   | test123  |
      | Admin    | admin123 |
      | john     | test123  |
