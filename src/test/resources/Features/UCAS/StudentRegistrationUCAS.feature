Feature: Registration UCAS

@Monitor @Smoke
  Scenario: Registration of the applicant UCAS Home Page

    Given I am on UCAS page
    When  I click on Registraion button
    Then  I should able to land on Registration Welcome Page

@Monitor @Regression
 Scenario: Registration process

    Given I am an Registration Welcome Page
    When  I complete registration process
    Then  I successfully finish the registration of UCAS

