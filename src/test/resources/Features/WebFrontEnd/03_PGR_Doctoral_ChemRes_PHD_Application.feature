#@Monitor
Feature: Apply for programme


  Background: As a student I create an account on ICL website
    Given I am on ICL gateway web page
    And I create an account for Doctoral Chemistry Research PHD Programme

#  @Monitor
  Scenario: As a student I should be able to apply for Postgraduate Doctoral Chemistry Research PHD.
    And I apply for the Chemistry Research PHD Programme
    And I upload my PHD supporting documents
    When I submit the reference information
    Then I should go back to My Account page

