$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/z00467ka/eclipse-workspace/FreeCrmBDDFramework/src/main/java/Features/tagging.feature");
formatter.feature({
  "line": 1,
  "name": "Free Crm application testing",
  "description": "",
  "id": "free-crm-application-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "login with incorrect username and correct password",
  "description": "",
  "id": "free-crm-application-testing;login-with-incorrect-username-and-correct-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "This is a invalid login test",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingStepDefination.this_is_a_invalid_login_test()"
});
formatter.result({
  "duration": 68484600,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Create a tasks",
  "description": "",
  "id": "free-crm-application-testing;create-a-tasks",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "TThis is a tasks test case",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingStepDefination.tthis_is_a_tasks_test_case()"
});
formatter.result({
  "duration": 19500,
  "status": "passed"
});
});