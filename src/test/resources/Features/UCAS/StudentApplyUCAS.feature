Feature: Student Applying through UCAS

  Scenario: UCAS apply

    Given I am already registered in UCAS
    When  I am logged in through the credentials
    Then I should be able to login to the UCAS site
    And  I apply for the course through UCAS successfully