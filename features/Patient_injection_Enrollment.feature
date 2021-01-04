Feature: Test patient injection enrollment feature

  @tag2
  Scenario: Test Patient Injection enrollment scenario
    Given I open xolair sites
    And click enrollment button
    And select patients
    And select patients not enrolled before
    When I apply for injection
    And Select eligibilities question
    And enter patients info
    And enter insurances info
    Then I fill in the prescriber info
    And I fill in the site of cares information
    And I confirm the information
    And Click confirm button
    And close the browser
