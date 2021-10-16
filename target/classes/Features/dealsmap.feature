Feature: Deals data creation
Scenario: Free Crm create a new deal scenario

Given User is already on login page
When Title of login page is Free Crm
Then user enters username and password
| username | password |
| AjeetKr | Test12345! |
Then user clicks on login button
Then user moves to new deals page
Then user enters deals details
| title | amount | probablity | commision |
| test deal1 | 1000 | 50 | 10 |
| test deal2 | 2000 | 60 | 20 |
| test deal3 | 3000 | 70 | 30 |
Then close the browser