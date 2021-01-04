Feature: Test  drug enrollment feature

  @tag1
  Scenario: Test patient drug enrollment scenario
    Given I open xolair site
    And click on enrollment button
    And select patient
    And select patient not enrolled before
    When I apply for drug
    And Select eligibility question
    And enter patient info
    And enter insurance info
    Then I fill in the prescribers info
    And I fill in the site of care information
    And I confirm the info
    And Click on confirm button
    And close browser
