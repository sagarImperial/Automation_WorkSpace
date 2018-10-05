Feature: Apply for programme

  Background: As a student I create an account on ICL website
    Given I am on ICL gateway web page
    And I create an account

  Scenario: As a registered student I should be able to make an application from ICL WFE
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

#    Scenario: Make Decision as SME Input
#      Given I am on CRM
#      And I search for record
#      Then I should be able to give offer






