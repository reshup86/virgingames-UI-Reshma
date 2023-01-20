$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("freegames.feature");
formatter.feature({
  "line": 2,
  "name": "Free Games Test",
  "description": "As a user I want to click on free games link on homepage of Virgin games website",
  "id": "free-games-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 4367852900,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "I can accept cookies",
  "description": "",
  "id": "free-games-test;i-can-accept-cookies",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I click on url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I accepted cookies",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I am on homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I click on free games link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should navigate to free games page successfully",
  "keyword": "And "
});
formatter.match({
  "location": "FreeGamesSteps.iClickOnUrl()"
});
formatter.result({
  "duration": 96311800,
  "status": "passed"
});
formatter.match({
  "location": "FreeGamesSteps.iAcceptedCookies()"
});
formatter.result({
  "duration": 101607500,
  "status": "passed"
});
formatter.match({
  "location": "FreeGamesSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 20500,
  "status": "passed"
});
formatter.match({
  "location": "FreeGamesSteps.iClickOnFreeGamesLink()"
});
formatter.result({
  "duration": 91446900,
  "status": "passed"
});
formatter.match({
  "location": "FreeGamesSteps.iShouldNavigateToFreeGamesPageSuccessfully()"
});
formatter.result({
  "duration": 206057300,
  "status": "passed"
});
formatter.after({
  "duration": 122900,
  "status": "passed"
});
});