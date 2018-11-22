Feature: Apply for short course and make a decision.

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



