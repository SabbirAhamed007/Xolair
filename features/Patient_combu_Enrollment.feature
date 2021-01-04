Feature: Test combu enrollment feature

  @tag4
  Scenario: Test Patients combu enrollment scenario
    Given I open the xolair sites
    And click the enrollment button
    And select the patients
    And select the patients not enrolled before
    When I apply for combu
    And Select the eligibilities question
    And enter the patients info
    And enter the insurances info
    Then I fill in the prescribers information
    And I fill the site of cares information
    And I confirm information
    And Clicks confirm button
    And close browsers
