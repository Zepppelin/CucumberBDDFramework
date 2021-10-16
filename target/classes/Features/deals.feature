Feature: Free Crm deals Feature
Scenario: Free Crm deals Test Scenario

Given User is already on login page
When Title of login page is Free Crm
Then user enters username and password
| AjeetKr | Test12345! |
Then user clicks on login button
Then user moves to new deals page
Then user enters deals details
| test deal | 1000 | 50 | 10 |
Then close the browser
