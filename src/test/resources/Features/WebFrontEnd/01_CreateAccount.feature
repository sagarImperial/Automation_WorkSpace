Feature: Create Account a Student

  @Monitor
  Scenario: Create New account on ICL Gateway
    Given I am on ICL gateway web page
    And I click on Create account
    And I accept the privacy policy
    And I enter all required fields
    When I click "Create Account" button
    Then I should get "My Account" page


  Scenario: Email Already existing - Create new account
    Given I am on ICL gateway web page
    And I click on Create account
    And I accept the privacy policy
    And I enter all required fields
    When I click "Create Account" button
    Then I should get "You appear to have created an account before." Message page
