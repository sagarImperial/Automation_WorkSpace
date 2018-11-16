Feature: CRM Login and Logout

  Scenario: IC Admissions Administrator Login and Logout

    Given I am on ICL CRM Recruit login page
    And   I enter my recruit username
    And   I enter my recruit password
    When  I click on Sign in button
    Then  I should be able to Sign Out