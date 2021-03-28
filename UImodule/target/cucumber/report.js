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
  "duration": 199141205964,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationWeather.expandHeaderOnHomePage()"
});
formatter.result({
  "duration": 3103408165,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationWeather.clickOnWeatherLink()"
});
formatter.result({
  "duration": 4826587932,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationWeather.verifyIfWeatherSectionIsOpened()"
});
formatter.result({
  "duration": 3012532636,
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
  "duration": 3005281448,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationWeather.searchLocation()"
});
formatter.result({
  "duration": 2082422714,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationWeather.checkIfLocationSelected()"
});
formatter.result({
  "duration": 2021309411,
  "status": "passed"
});
formatter.after({
  "duration": 79879561,
  "status": "passed"
});
});