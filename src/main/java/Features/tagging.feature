Feature: Free Crm application testing

@SmokeTest @RegressionTest
Scenario: login with correct username and correct password
Given This is a valid login test

@RegressionTest
Scenario: login with incorrect username and correct password
Given This is a invalid login test

@SmokeTest
Scenario: Create a contact
Given This is a contact test case

@SmokeTest @RegressionTest
Scenario: Create a deal
Given TThis is a deal test case

@RegressionTest
Scenario: Create a tasks
Given TThis is a tasks test case

@SmokeTest
Scenario: Create a case
Given TThis is a case test case

@SmokeTest @RegressionTest
Scenario: Verify left panel links
Given Clicking on left panel links

@SmokeTest
Scenario: Search a deal
Given This is a search deal test

@SmokeTest
Scenario: Search a contact
Given This is a search contact test

@SmokeTest @RegressionTest
Scenario: Search a case
Given This is a search case test

@SmokeTest @RegressionTest
Scenario: Search a task
Given This is a search task test

@SmokeTest @End2End
Scenario: Search a call
Given This is a search call test

@SmokeTest @End2End
Scenario: Search an email
Given This is a search email test

@SmokeTest @End2End
Scenario: Search a docs
Given This is a search docs test

@SmokeTest @End2End
Scenario: Search a forms
Given This is a search forms test

@SmokeTest @End2End
Scenario: Validate a report
Given This is a report test

@End2End
Scenario: Validate a report
Given This is a report test

@End2End
Scenario: Application logout
Given This is a logout test
