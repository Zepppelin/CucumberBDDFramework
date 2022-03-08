
Feature: Free Crm Login Feature
Scenario Outline: Free Crm Login Test Scenario

Given User is already on login page
When Title of login page is Free Crm
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user on home page
Then close the browser

Examples:

| username | password |
| AjeetKr | Test12345! |
| tom | Test456 |