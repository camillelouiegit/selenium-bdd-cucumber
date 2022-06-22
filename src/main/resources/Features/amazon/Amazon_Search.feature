Feature: Amazon Search

  Background:
    Given user navigates to Amazon India

  @SearchAboutThisItem
  Scenario: Verify About this item is displayed
  Description: User can search and sort for a specific brand of television

    When user search a specific television brand
    And user sorts the list to Price High to Low
    And user selects the second highest priced item
    Then user successfully verified About this item is displayed
