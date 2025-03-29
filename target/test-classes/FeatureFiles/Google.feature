Feature: Test Google application

  Background: 
    Given Open google application

  Scenario: Test thet title of Google application
    #Given Open google application
    When I get the current application title
    Then title should match with Google

  Scenario: Test Google search Feature with Valid keyword
    #Given Open google application
    When I enter valid keyword in Google search
    Then I should get appropriate options
