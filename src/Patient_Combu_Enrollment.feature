Feature: Test combu enrollment of your feature

  @tag3
  Scenario: Test Patient combu enrollment scenario
    Given I open the xolair sites
    And click on the enrollment button
    And select the patients
    And select the patients not enrolled before
    When I apply for combu
    And Select the eligibilities question
    And enter the patients info
    And enter the insurances info
    Then I fill the in the prescriber info
    And I fill in the sites of cares information
    And I confirm information
    And Click confirm the button
    And close browsers
