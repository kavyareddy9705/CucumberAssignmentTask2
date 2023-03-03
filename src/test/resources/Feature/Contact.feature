Feature: contact module
  Scenario: Verify Home page
    Given user on Home page
    When click on the contact
    Then fill the form
    And verify form is submitted successfully