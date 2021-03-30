Feature: Weather information for given location

 Feature
  Background:
    Given User is one NDTV home page
    When User expands header section
    And User clicks on weather
    Then User is one NDTV weather section

  @RegressionTest
  Scenario: Selected location information
    Given User has selected location on weather section
    When User clicks on the location
    Then User sees the weather information for that location


