@All
Feature: Test Amzon Application

  Background: 
    Given Open Amazon application

  @homepage @SmokeTest
  Scenario: Test home page title
    When User get the home page title
    Then title should match with homepage title

  @sellpage @SmokeTest @ignore
  Scenario: Test Sell page title
    When User open Sell page
    And get the title for Sell page
    Then title should match with Sell page title

  @mobilepage @Regression
  Scenario: Test Mobiles page title
    When User open Mobiles page
    And get the title for Mobiles page
    Then title should match with Mobiles page title

  @fashionpage @Regression @ignore
  Scenario: Test Fashion page title
    When User open Fashion page
    And get the title for Fashion page
    Then title should match with Fashion page title
