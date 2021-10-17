Feature: Free Crm app test

Scenario: Free Crm create deal test
Given user is on deal page
When user fills the deals form
Then deal is created

Scenario: Free crm create contact test
Given user is on contact page
When users fills the contact form
Then contact is created

Scenario Outline: Free crm create mail test
Given user is on mail page
When user fills the mail form
Then mail is created

Examples:
| mail 1 |
| mail 2 |
| mail 3 |