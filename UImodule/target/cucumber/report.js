$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Weather.feature");
formatter.feature({
  "line": 1,
  "name": "Weather information for given location",
  "description": "\r\nFeature",
  "id": "weather-information-for-given-location",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is one NDTV home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User expands header section",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User clicks on weather",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Weather section is opened",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinationWeather.verifyIfUserIsOnHomePage()"
});
formatter.result({
  "duration": 67922251396,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationWeather.expandHeaderOnHomePage()"
});
formatter.result({
  "duration": 3109756318,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationWeather.clickOnWeatherLink()"
});
formatter.result({
  "duration": 9591242520,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationWeather.verifyIfWeatherSectionIsOpened()"
});
formatter.result({
  "duration": 3008500981,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Location Selection",
  "description": "",
  "id": "weather-information-for-given-location;location-selection",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User is one NDTV weather section",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User types in the location",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User checks the location to Pin it",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinationWeather.verifyCurrentPage()"
});
formatter.result({
  "duration": 3007181607,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationWeather.searchLocation()"
});
formatter.result({
  "duration": 2085544441,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationWeather.checkIfLocationSelected()"
});
formatter.result({
  "duration": 2025232709,
  "status": "passed"
});
formatter.after({
  "duration": 122914313,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is one NDTV home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User expands header section",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User clicks on weather",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Weather section is opened",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinationWeather.verifyIfUserIsOnHomePage()"
});
formatter.result({
  "duration": 38776489038,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationWeather.expandHeaderOnHomePage()"
});
formatter.result({
  "duration": 3107861245,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationWeather.clickOnWeatherLink()"
});
formatter.result({
  "duration": 5004862160,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationWeather.verifyIfWeatherSectionIsOpened()"
});
formatter.result({
  "duration": 3011370409,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Selected location information",
  "description": "",
  "id": "weather-information-for-given-location;selected-location-information",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "User has selected location on weather section",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "User clicks on the location",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User sees the weather information for that location",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinationWeather.verifyIfLocationSelected()"
});
formatter.result({
  "duration": 2021129087,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationWeather.ClickOnLocationOnMap()"
});
formatter.result({
  "duration": 2062126778,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationWeather.GetInformationOfLocationOnMap()"
});
formatter.result({
  "duration": 2099451126,
  "status": "passed"
});
formatter.after({
  "duration": 81552441,
  "status": "passed"
});
});