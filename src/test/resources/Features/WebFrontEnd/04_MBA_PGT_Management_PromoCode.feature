@Monitor
Feature: As a student apply for Management MBA programme and pay application fees with Promo Code.
  Also, as a registry officer make an decision as "Offer"

@Monitor
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
    And I submit my MBA application
    And I make MBA application fees using promo code
    And I upload my MBA supporting documents
    When I submit my reference information for the MBA application
    And go back to my Application
    Then I should get "Request Programme Change" link


#  Scenario: As a Registry Officer I make decision to the application as Offer
#    Given I am logged in as CRM Super User
