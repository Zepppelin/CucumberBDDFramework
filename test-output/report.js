$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/z00467ka/eclipse-workspace/FreeCrmBDDFramework/src/main/java/Features/dealsmap.feature");
formatter.feature({
  "line": 1,
  "name": "Deals data creation",
  "description": "",
  "id": "deals-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Free Crm create a new deal scenario",
  "description": "",
  "id": "deals-data-creation;free-crm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Title of login page is Free Crm",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "AjeetKr",
        "Test12345!"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user moves to new deals page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enters deals details",
  "rows": [
    {
      "cells": [
        "title",
        "amount",
        "probablity",
        "commision"
      ],
      "line": 12
    },
    {
      "cells": [
        "test deal1",
        "1000",
        "50",
        "10"
      ],
      "line": 13
    },
    {
      "cells": [
        "test deal2",
        "2000",
        "60",
        "20"
      ],
      "line": 14
    },
    {
      "cells": [
        "test deal3",
        "3000",
        "70",
        "30"
      ],
      "line": 15
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealsStepsWithMapDefinations.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 9150827900,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepsWithMapDefinations.title_of_login_page_is_Free_Crm()"
});
formatter.result({
  "duration": 13179900,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepsWithMapDefinations.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 75805000,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepsWithMapDefinations.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 5022780700,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepsWithMapDefinations.user_moves_to_new_deals_page()"
});
formatter.result({
  "duration": 7238147900,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepsWithMapDefinations.user_enters_deals_details(DataTable)"
});
formatter.result({
  "duration": 29922492499,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepsWithMapDefinations.close_the_browser()"
});
formatter.result({
  "duration": 577335900,
  "status": "passed"
});
});