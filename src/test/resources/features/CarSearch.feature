@Search-Cars
Feature: Acceptance test to validate if the car search page is working fine
  Validating if the car search page is working fine by peforming acceptance testing.

  @Search-Cars-positive
  Scenario: To validate car search page
    Given I am on the home page "https://www.carsguide.com.au/"
    When I move to menu
      | buy + sell      |
      | reviews         |
      | news            |
      | advice          |
      | pricing + specs |
      | guides          |
    And I click on "search Cars" link
    And I select Any Make as "BMW"
    And I select Any Model as "1 Series"
    And I select Any Location as "NSW - All"
    And I select Price(max) as "$10,000"
    And I click on "Find My Next Car" button
    Then I see a list of searched cars
    And the page title should be "Bmw 1 Series Under 10000 for Sale NSW | carsguide"
