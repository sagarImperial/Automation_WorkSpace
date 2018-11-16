Feature: Create Account a Student

  @Monitor
  Scenario: As a student I should be able to create account on ICL gateway
    Given I am on ICL gateway web page
    And I click on Create account
    And I accept the privacy policy
    And I enter all required fields
    When I click "Create Account" button
    Then I should get "My Account" page

  @Monitor
  Scenario: Student creating account with already used email address.
    Given I am on ICL gateway web page
    And I click on Create account
    And I accept the privacy policy
    And I enter all required fields
    When I click "Create Account" button
    Then I should get "You appear to have created an account before." Message page
