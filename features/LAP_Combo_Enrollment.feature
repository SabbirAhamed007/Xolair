
Feature: Test combo patient enrollment feature
  
@tag7
  Scenario: Test LAP combu enrollment scenario
    Given I open xolair sites for LAP combu
    And clicks on enrollment button for combo
    And select the LAP as a enroller
    And select LAP not enrolled a patient before
    When LAP apply for combo
    And Select eligibility questions for combo
    And enter patient info for combo
    And enter the insurance information for combo
    Then I fill in prescriber info for combo
    And I fill the site of care information for combo
    And I confirm informations
    And Clicks on confirm buttons
    And close Xolair browser for combo enrollment
