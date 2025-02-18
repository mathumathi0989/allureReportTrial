#Author: Mathumathi
Feature: Sample Test Feature

  Scenario: Verify Google Homepage
    Given I navigate to "https://www.google.com"
    Then The page title should be "Google"
    