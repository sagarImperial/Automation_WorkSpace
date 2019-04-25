@Monitor
Feature: Apply for short course and make a decision.

  @Monitor
  Scenario: Create an account and apply for  short course Global innovation Design (Occasional)
    Given I am on ICL gateway web page
    And I Create account
    And I continue with my application
    And I complete my Proposed Studies and Personal Information tab
    And I complete my Additional Information Tab
    And I complete my English Language Tab
    And I complete my Confidential Information Tab
    And I submit my application
    When I upload my all the required supporting document
    Then I should get status as "Document submission and checks" on my accounts page

#
#    Scenario: Make an offer to the short course application
#      Given I am logged into CRM Recruit as Super User
#      And I search for application
#      And I Mark it as Complete
#      And I go to application review tab
#      And I change to registry assessment
#      And I change the fees
#      And I change the Academic Eligibility
#      English Assessment
#      Send to Department ticket
#      Application folder department ready for review




