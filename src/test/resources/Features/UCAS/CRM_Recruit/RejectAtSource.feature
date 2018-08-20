Feature: Check


  Scenario: Check
    Given I logged in as IC Registry user
    And I search for record which does not match program criteria
    And I complete all required fields
    When I select "Reject at source" from drop down
    And I save the record
    Then I the record should be saved
    And record should be rejected