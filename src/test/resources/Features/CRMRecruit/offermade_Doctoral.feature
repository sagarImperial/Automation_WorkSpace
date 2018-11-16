Feature:  Offermade for Doctoral (PGRM)

  Scenario: Offermade

    Given I logged in as IC Registry user in CRM to make an offer for PGR applicant
    And   I search for record which meets with the program criteria for PGR applicant
    And   I complete all required fields for a PGR applicant as a Registry User
    When  I select Proceed meets department requirements from drop down for to proceed to offermade for PGR applicant
    And   I select English Assessment as "English language required" as a mandatory for to proceed to offermade
    And   I click on sent to department tick check box for a PGR applicant
    And   I save the record in Registry Assessment fro a PGR program
    Then  I the record should be saved in Registry for a PGR applicant
