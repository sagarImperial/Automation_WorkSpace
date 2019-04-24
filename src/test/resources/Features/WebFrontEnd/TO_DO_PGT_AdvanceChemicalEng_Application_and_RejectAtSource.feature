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
#    And I submit my reference information
#    When I upload my supporting documents
    Then I should go back to My Account page


  Scenario: Make an Offer
    Given I logged in as IC Registry user in CRM
    And I search for record above
    And I navigate to the student application
    And I go to Applicant Tab
    And I click on Mark As Completed Button
    And I go to Application Review Tab
    And I change switch user as Registry User
    And I set Fee status to "Home - ELQ"
    And I set Academic Eligibility to "Reject at Source"
#    And I set English Assessment to "English Language required"
    And I tick Send to Department checkbox
    And I Save the changes
    And I change application folder user to "IC - Department Assessment"
    And I set Decision as "Offer"
    And I tick Decision Made Send to Registry checkbox
    And I enter Department Academic Condition Notes "Offered place - Brilliant Student"
    And I Save the changes
    When I change application folder user to "IC - Registry Assessment"
    Then I should get Application Folder status as "Registry - Decision Check 1"


  Scenario: Check Application Folder Status as decision is made
    Given I logged in as IC Registry user in CRM
    And I search for record above
    And I navigate to the student application
    And I go to Applicant Tab
    And I to verify decision made I go to Application Review Tab
    When I change switch user as Registry User
    Then I should get Application Folder status as "Registry - Decision Check 1"













