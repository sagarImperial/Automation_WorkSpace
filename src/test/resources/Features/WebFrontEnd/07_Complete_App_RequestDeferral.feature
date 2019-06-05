
Feature: Request application Deferral

  Background: As a student I create an account on ICL website
    Given I am on ICL gateway web page
    And I create an account for deferring my application


  Scenario: As a student I should be able to Defer my application after completion.
    And I apply for the program for deferral
    And I go to My application
    And I click on Request Deferral link
    And I select Academic Term
    And I select Reason "Military service"
    When I click on Submit
    Then I should go back to My Account page
