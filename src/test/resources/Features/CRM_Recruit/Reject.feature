Feature: Reject

  Scenario: Reject - Registry Assessment Happypath

   # Given I logged in as IC Registry user
    And   I search for record which matches with the program criteria
   # And   I complete all required fields
    When  I select Proceed meets department requirements from drop down
    And   I select English Assessment as "English language required"
    And   I click on sent to department check box
    And   I save the record
    Then  my record should be saved


  Scenario: Reject - Department Assesssment Happypath

    When I logged in as IC Department User
    And  I search for the record which ready for review
    And  I select Department Decision as reject
    And  I provide the reason for rejection
    And  I click on Decision to registry
    And  I save the record
    Then I should be able to see Application folder status should be - Registry decision made


