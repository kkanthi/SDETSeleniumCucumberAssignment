$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TestCase_17_OrangeHRM.feature");
formatter.feature({
  "line": 1,
  "name": "Validate OrangeHRP Page",
  "description": "",
  "id": "validate-orangehrp-page",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "I am logged into Orange Application.",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "When I am in OrangeHRP Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Login to Application",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRPStep.when_I_am_in_OrangeHRP_Application()"
});
formatter.result({
  "duration": 7027997343,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRPStep.login_to_Application()"
});
formatter.result({
  "duration": 2531873674,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Validating text – Job Title",
  "description": "",
  "id": "validate-orangehrp-page;validating-text-–-job-title",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I click on Admin Link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Click on Job",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "validate text – Job Title",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "OrangeHRPStep.i_click_on_Admin_Link()"
});
formatter.result({
  "duration": 2923355343,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRPStep.click_on_Job()"
});
formatter.result({
  "duration": 356937194,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRPStep.validate_text_Job_Title()"
});
formatter.result({
  "duration": 319202651,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRPStep.close_the_browser()"
});
formatter.result({
  "duration": 427073832,
  "status": "passed"
});
});