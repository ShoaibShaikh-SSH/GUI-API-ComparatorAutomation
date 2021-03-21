$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Weather.feature");
formatter.feature({
  "line": 1,
  "name": "Weather information for given location",
  "description": "\r\nFeature",
  "id": "weather-information-for-given-location",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Demo scenario",
  "description": "",
  "id": "weather-information-for-given-location;demo-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on Screen A",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User clicks on link x",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User navigates to screen B",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinationWeather.performGiven()"
});
formatter.result({
  "duration": 68316146,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationWeather.performWhen()"
});
formatter.result({
  "duration": 42137,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinationWeather.performThen()"
});
formatter.result({
  "duration": 33942,
  "status": "passed"
});
formatter.after({
  "duration": 70491,
  "status": "passed"
});
});