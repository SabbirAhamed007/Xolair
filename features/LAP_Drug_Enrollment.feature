Feature: Test LAP drug enrollment feature

  @tag5
  Scenario: Test LAP drug enrollment scenario
    Given I open xolair sites for LAP
    And clicks on enrollment button
    And select the LAP
    And select LAP not enrolled before
    When LAP apply for drug
    And Select eligibility questions
    And enter patient info for drug
    And enter the insurance information
    Then I fill in prescriber info
    And I fill the site of care information
    And I confirm info
    And Clicks on confirm button
    And close Xolair browser
