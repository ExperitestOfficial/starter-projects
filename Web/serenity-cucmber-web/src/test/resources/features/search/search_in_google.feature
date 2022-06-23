Feature: Search in google

  Scenario: Experitest google search
    Given We are on google page
    When We search for "Experitest"
    Then We should see "digital.ai"
