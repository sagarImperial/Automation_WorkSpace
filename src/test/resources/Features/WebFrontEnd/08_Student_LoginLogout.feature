
Feature: Login and Logout as a Student

  Scenario: Login Logout as a Student
    Given I am on ICL gateway web page
    And I enter my username
    And I enter my password
    And I click on Log in button
    And I should get "MY ACCOUNT"
    When I click on Logout
    Then I should get "LOG IN" option

