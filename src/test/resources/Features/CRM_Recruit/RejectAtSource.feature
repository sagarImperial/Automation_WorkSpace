Feature: Reject at Source

  Scenario: Reject At Source Happypath
    Given I logged in as IC Registry user
    And I search for record which  match program criteria
    And I complete all required fields
    When I select "Reject at source" from drop down
    And I save the record
    Then I the record should be saved
