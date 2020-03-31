$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Dashboard.feature");
formatter.feature({
  "line": 2,
  "name": "Dashboard",
  "description": "",
  "id": "dashboard",
  "keyword": "Feature"
});
formatter.before({
  "duration": 182361833,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Verify PDWS dashboard filter",
  "description": "",
  "id": "dashboard;verify-pdws-dashboard-filter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Open Application and Enter urls",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Login page is loaded Enter",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Enter",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on applications",
  "keyword": "Then "
});
formatter.match({
  "location": "Dashboard.open_Application_and_Enter_url()"
});
formatter.result({
  "duration": 2574120680,
  "status": "passed"
});
formatter.match({
  "location": "Dashboard.login_page_is_loaded_Enter_auto_tester_in_step()"
});
formatter.result({
  "duration": 5300731924,
  "status": "passed"
});
formatter.match({
  "location": "Dashboard.enter_Auto()"
});
formatter.result({
  "duration": 100885288,
  "status": "passed"
});
formatter.match({
  "location": "Dashboard.application()"
});
formatter.result({
  "duration": 16501640369,
  "status": "passed"
});
formatter.after({
  "duration": 317108444,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login To PDWS",
  "description": "",
  "id": "login-to-pdws",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2053514,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Authenication",
  "description": "",
  "id": "login-to-pdws;authenication",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Open Application and Enter url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "enter username",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "enter password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "verify sucess",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.open_Application_and_Enter_url()"
});
formatter.result({
  "duration": 538997473,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.enter_username()"
});
formatter.result({
  "duration": 5173644046,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.enter_password()"
});
formatter.result({
  "duration": 234733141,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.verify_Msg()"
});
formatter.result({
  "duration": 5240026829,
  "status": "passed"
});
formatter.after({
  "duration": 60883113,
  "status": "passed"
});
});