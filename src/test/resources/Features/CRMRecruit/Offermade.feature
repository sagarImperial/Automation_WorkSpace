Feature:  Offermade

#  @Monitor
  Scenario: Offer - Registry Assessment
    Given I logged in as IC Registry user in CRM
    And   I search for record which meets with the program criteria
    And   I complete all required fields as a Registry User
    When  I select Proceed meets department requirements from drop down for to proceed to offermade
    And   I select English Assessment as "English language required" as a mandatory
    And   I click on sent to department tick check box
    And   I save the record in Registry Assessment
    Then  I the record should be saved in Registry
