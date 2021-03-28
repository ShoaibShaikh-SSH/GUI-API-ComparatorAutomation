Feature: Weather information for given location

 Feature
  Background:
    Given User is one NDTV home page
    When User expands header section
    And User clicks on weather
    Then Weather section is opened

  @RegressionTest
  Scenario: Location Selection
    Given User is one NDTV weather section
    When User types in the location
    Then User checks the location to Pin it

#  @RegressionTest
#  Scenario: Selected location information
#    Given User has selected location on weather section
#    When User clicks on the location
#    Then User sees the weather information for that location
#    And User puts that information as Weather object






