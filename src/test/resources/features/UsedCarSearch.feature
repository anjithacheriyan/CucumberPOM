@Used-Car-Search
Feature: Acceptance test to validate if the used car search page is working fine
  Validating if the used car search page is working fine by peforming acceptance testing.

  @Search-Used-Cars-positive
  Scenario: To validate used car search page
    Given I am on the home page "https://www.carsguide.com.au/"
    When I move to menu
      | buy + sell      |
      | reviews         |
      | news            |
      | advice          |
      | pricing + specs |
      | guides          |
    And I click on "Used" link for used cars page
    And I select Any Make as "Audi" from used cars page
    And I select Any Model from used cars page as
    	| A1							|
    	| A2							|
    	| A3							|
    	| A4							|
    And I select Any Location from used cars page as "ACT - All"
    And I select Price(max) from used cars page as "$2,000"
    And I click on from used cars page "Find My Next Car"
    Then I see a list of searched cars
    And the page title should be "Used Audi A4 Under 2000 for Sale ACT | carsguide"
