$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/indir/eclipse-workspace/Training/Project_NewCucumber/src/test/resources/org/Facebook/Facebook.feature");
formatter.feature({
  "name": "facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "creating new FB Account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "creating new account",
  "keyword": "When "
});
formatter.step({
  "name": "entering personal details \"\u003cfname\u003e\" \"\u003clname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "entering \"\u003cmobile\u003e\" \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "selecting DOB \"\u003cdate\u003e\" \"\u003cmonth\u003e\" \"\u003cyear\u003e\" \"\u003cgender\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "create Account",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "fname",
        "lname",
        "mobile",
        "password",
        "date",
        "month",
        "year",
        "gender"
      ]
    },
    {
      "cells": [
        "Abinav",
        "Narayana",
        "9043498719",
        "012345@67",
        "10",
        "2",
        "1999",
        "Female"
      ]
    },
    {
      "cells": [
        "Nethra",
        "Ram",
        "9043397110",
        "98765432@1",
        "25",
        "12",
        "1995",
        "Male"
      ]
    }
  ]
});
formatter.background({
  "name": "common function",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded0.png");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "launch the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "FacebookStepDefinition.launch_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "creating new FB Account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "creating new account",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookStepDefinition.creating_new_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "entering personal details \"Abinav\" \"Narayana\"",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookStepDefinition.entering_personal_details(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "entering \"9043498719\" \"012345@67\"",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookStepDefinition.entering(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecting DOB \"10\" \"2\" \"1999\" \"Female\"",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookStepDefinition.selecting_DOB(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "create Account",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookStepDefinition.create_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "common function",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded2.png");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "launch the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "FacebookStepDefinition.launch_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "creating new FB Account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "creating new account",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookStepDefinition.creating_new_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "entering personal details \"Nethra\" \"Ram\"",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookStepDefinition.entering_personal_details(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "entering \"9043397110\" \"98765432@1\"",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookStepDefinition.entering(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecting DOB \"25\" \"12\" \"1995\" \"Male\"",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookStepDefinition.selecting_DOB(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "create Account",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookStepDefinition.create_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "status": "passed"
});
});