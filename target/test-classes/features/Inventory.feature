Feature: Test Inventory page

  Background: 
    Given User is logged in to application
      | username      | password     |
      | standard_user | secret_sauce |

  Scenario: Test for total product count
    Given User is on Inventory page
    When User get product count
    Then Total products should be match with 6

  Scenario: Test for product list
    Given User is on Inventory page
    When User get the product list
    Then List should display all products

  Scenario: Test for Add product to cart
    Given User is on Inventory page
    When user add product into cart
    Then Product should be added successfully
