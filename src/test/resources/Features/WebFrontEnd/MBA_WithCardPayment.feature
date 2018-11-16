Feature: As a student apply for Management MBA programme.
  Also, as a registry officer make an decision as "Offer"


  Scenario: As a student I should be able to apply for Management MBA programme
    Given I am on ICL gateway web page
    And I create an account for Management MBA
    And I continue with the same application
    And I complete Proposed Studies and Personal Information tab
    And I complete Academic Experience tab
    And I complete Additional Qualifications tab
    And I complete Additional Information tab
    And I complete Confidential Information tab
    And I complete Marketing Information tab
    And I submit my application
    When I make MBA application fees
    Then I should get "Thank you for your payment. Your application has been submitted! Please upload your supporting documents to complete your application. You can do this through the My Application page > Track Application view." message
    And I return to check my application status
    And I upload my MBA supporting documents
    When I submit my reference information
    Then I should go back to My Account page
    And I upload my MBA supporting documents
    When I submit my reference information for the MBA application
    And go back to my Application
    Then I should get my "Application Number"


#  Scenario: As a Registry Officer I make decision to the application as Offer
#    Given I am logged in as CRM Super User
