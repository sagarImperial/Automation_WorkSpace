Feature: Student should be able to successfully Loging and Logout from their UCAS account.


  @Monitor
  Scenario: Student Login
    Given I am on UCAS Site
    And I enter my username
    And I enter my password
    When I click on Login button
    Then I should get successfully message ""


  Scenario: Student Logout
    Given I am logged in on UCAC site
    When I click on Logout button
    Then I should see "Register and log in" text




