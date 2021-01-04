Feature: Test LAP injection enrollment feature

  @tag6
  Scenario: Test LAP injection enrollment scenario
    Given I open xolair sites for LAP injection
    And click the enrollment buttons
    And select the LAP for enrollment
    And selects LAP not enrolled before
    When LAP apply for injection
    And Selects eligibilities question
    And enter patient info for injection
    And select the insurance information
    Then I fillup in prescriber info
    And I fillup the site of care information
    And I confirm the informations
    And Clicks on the confirm button
    And close Xolair browsers
