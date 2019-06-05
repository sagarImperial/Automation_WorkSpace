
Feature: Withdraw from the application

  Background: As a student I create an account on ICL website
    Given I am on ICL gateway web page
    And I create an account for withdrawals


  Scenario: As a student I should be able to Withdraw my application after completion.
    And I apply for the program
    And I go to My application
    And I click on Withdraw link
    And I select reason "I no longer wish to attend any university"
    When I click on Withdraw button
    And I click ok to withdraw alert message
    Then the status should be  "Withdrawn" for the given application
