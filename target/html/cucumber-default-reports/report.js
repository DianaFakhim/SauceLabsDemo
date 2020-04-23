$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sprint1"
    }
  ]
});
formatter.scenario({
  "name": "Verify if a user will be able to login with a valid username and valid password.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint1"
    },
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User enter valid username",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_enter_valid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter valid password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_enter_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify user logged in successfully",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.verify_user_logged_in_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify if a user cannot login with a invalid credentials.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "User enter username \"\u003cusername\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User enter passwords \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User click on Login button",
  "keyword": "And "
});
formatter.step({
  "name": "I verify error message  \"\u003cerror message\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "error message"
      ]
    },
    {
      "cells": [
        "standart_us",
        "secret_sauce",
        "Epic sadface: Username and password do not match any user in this service"
      ]
    },
    {
      "cells": [
        "standard_user",
        "secret_sa",
        "Epic sadface: Username and password do not match any user in this service"
      ]
    },
    {
      "cells": [
        "",
        "",
        "Epic sadface: Username is required"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify if a user cannot login with a invalid credentials.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sprint1"
    },
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User enter username \"standart_us\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_enter_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter passwords \"secret_sauce\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_enter_passwords(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify error message  \"Epic sadface: Username and password do not match any user in this service\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_verify_error_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify if a user cannot login with a invalid credentials.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sprint1"
    },
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User enter username \"standard_user\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_enter_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter passwords \"secret_sa\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_enter_passwords(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify error message  \"Epic sadface: Username and password do not match any user in this service\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_verify_error_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify if a user cannot login with a invalid credentials.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sprint1"
    },
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User enter username \"\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_enter_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter passwords \"\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_enter_passwords(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify error message  \"Epic sadface: Username is required\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_verify_error_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "status": "passed"
});
});