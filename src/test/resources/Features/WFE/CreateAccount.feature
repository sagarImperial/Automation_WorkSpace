Feature: Create Account a Student

   Scenario: As a student I should be able to create account on ICL gateway
    Given I am on ICL gateway web page
    And I click on Create account
    And I accept the privacy policy
    And I enter all required fields
    When I click "Create Account" button
    Then I should get "My Account" page

#    Then I should get "Your account is pending activation. You will receive an e-mail soon containing instructions on how to activate your account.
#                       If you do not receive an e-mail, you can use the link below to have the activation link resent to your e-mail address." Message


#  Scenario: Student creating account with already used email address.
#    Given I am on ICL gateway web page
#    And I click on Create account
#    And I accept the privacy policy
#    And I enter all required fields
#    When I click "Create Account" button
#    Then I should get "You appear to have created an account before." Message page

