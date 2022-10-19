Feature: Search by keyword

  Scenario: Searching for a term
    Given Gherard is on the Google home page
    When he searches for "gherardtest github"
    Then all the result titles should contain the word "gherardtest github"