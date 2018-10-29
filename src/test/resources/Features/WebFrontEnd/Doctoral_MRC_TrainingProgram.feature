Feature: Apply for programme MRC Training program

  Background: As a student I create an account on ICL website
    Given I am on ICL gateway web page
    And I create an account for Doctoral MRC Training Programme

  Scenario: As a student I should be able to Defer my application after completion.
    And I apply for the MRC Doctoral Training Program
    And I upload my MRC Doctoral Training Program supporting documents
    When I submit my reference information for MRC Doctoral Training Program
    Then I should go back to My Account page with MRC Doctoral Training Program

