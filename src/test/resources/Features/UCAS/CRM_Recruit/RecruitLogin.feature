Feature: User should be able to login to CRM Recruit and logout from CRM Recruit


#  Scenario: IC Admissions Administrator Login
#  Scenario: IC System Super User Login
#  Scenario: IC Admissions Officer Login
#  Scenario: IC Department Decision Recorder Login
#  Scenario: IC Department Decision Recorder Login
#  Scenario: IC Department Reviewer Login
#  Scenario: IC Special Case approver Login


  Scenario: IC Admissions Administrator Login
    Given I am on ICL CRM Recruit login page
    And I enter my recruit username
    And I enter my recruit password
    When I click on Sign in button
    Then I should be able to Sign Out