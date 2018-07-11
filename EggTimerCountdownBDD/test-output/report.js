$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Pavan/workspace/EggTimerCountdownBDD/src/main/java/Features/countdownTimer.feature");
formatter.feature({
  "line": 1,
  "name": "Countdown Timer Feature",
  "description": "",
  "id": "countdown-timer-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Without examples keyword"
    }
  ],
  "line": 4,
  "name": "Test Countdown Timer Scenario",
  "description": "",
  "id": "countdown-timer-feature;test-countdown-timer-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user is already on Countdown Timer Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of login page is E.gg Timer",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters \"25 seconds\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on Go button",
  "keyword": "Then "
});
formatter.match({
  "location": "countDownTimerStepDefinitions.user_is_already_on_Countdown_Timer_Page()"
});
formatter.result({
  "duration": 13982330527,
  "status": "passed"
});
formatter.match({
  "location": "countDownTimerStepDefinitions.title_of_login_page_is_E_gg_Timer()"
});
formatter.result({
  "duration": 19317823,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "25 seconds",
      "offset": 13
    }
  ],
  "location": "countDownTimerStepDefinitions.user_enters(String)"
});
formatter.result({
  "duration": 302911042,
  "status": "passed"
});
formatter.match({
  "location": "countDownTimerStepDefinitions.user_clicks_on_Go_button()"
});
formatter.result({
  "duration": 29553676329,
  "status": "passed"
});
});