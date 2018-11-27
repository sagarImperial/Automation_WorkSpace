@Monitor
Feature: Create a new account and apply for programme Advance Chemical Engineering


  Scenario: As a Student I should be able to create account and apply for  Advance Chemical Engineering on ICL WFE
    Given I am on ICL gateway web page
    And I create an account
    And I click Create a New Application
    And I select Postgraduate Taught
    And I click on Continue this application
    And I complete Proposed Studies and Personal Information
    And I complete Academic Experience tab details
    And I complete Additional Qualifications tab details
    And I complete Additional Information tab details
    And I complete Confidential Information tab details
    And I complete Marketing Information tab details
    And I complete Submission tab details
    And I upload my supporting documents
    When I submit my reference information
    Then I should go back to My Account page







