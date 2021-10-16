Feature: Free Crm contacts Feature
Scenario Outline: Free Crm contacts Test Scenario

Given User is already on login page
When Title of login page is Free Crm
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user moves to new contacts page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then close the browser

Examples:

| username | password | firstname | lastname | position |
| AjeetKr | Test12345! | aj | kr | Manager |
| AjeetKr | Test12345! | avinash | Singh | Director |

