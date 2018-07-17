$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Pavan/workspace/ToolsqaContactUsDemo/src/main/java/com/toolsqa/features/toolsqaContactUs.feature");
formatter.feature({
  "line": 1,
  "name": "ToolsQA Contact Us Feature",
  "description": "",
  "id": "toolsqa-contact-us-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Enter the data in Contact Us Form",
  "description": "",
  "id": "toolsqa-contact-us-feature;enter-the-data-in-contact-us-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "validate Toolsqa home page title",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on About link",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate Contact Us page title",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enters the details in Contact Us Page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ToolsQaContactUsPageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 12658228024,
  "status": "passed"
});
formatter.match({
  "location": "ToolsQaContactUsPageSteps.validate_Toolsqa_home_page_title()"
});
formatter.result({
  "duration": 372903831,
  "status": "passed"
});
formatter.match({
  "location": "ToolsQaContactUsPageSteps.user_clicks_on_About_link()"
});
formatter.result({
  "duration": 5475231383,
  "status": "passed"
});
formatter.match({
  "location": "ToolsQaContactUsPageSteps.validate_Contact_Us_page_title()"
});
formatter.result({
  "duration": 5011858679,
  "status": "passed"
});
formatter.match({
  "location": "ToolsQaContactUsPageSteps.user_enters_the_details_in_Contact_Us_Page()"
});
formatter.result({
  "duration": 2813663550,
  "status": "passed"
});
formatter.match({
  "location": "ToolsQaContactUsPageSteps.close_the_browser()"
});
formatter.result({
  "duration": 951421907,
  "status": "passed"
});
});