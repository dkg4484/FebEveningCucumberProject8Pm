@EA2
Feature: Test EA 

Background:
Given user launches the url
When user enters username "admin"
And user enters password "password"
And user clicks Log in button
Then user verifies the title

@EmployeeDetails @EPIC01_B @Smoke @Retest @Regression
Scenario: Test Employee Details Page
When user cliks Employee Details 
Then user verifies the headers
|Name|Salary|Grade|

@EmployeeList @EPIC01_C @Smoke @US_01
Scenario: Test Employee List Page
When user cliks Employee List
Then user verifies employee list headers
|Name|Salary|DurationWorked|Grade|Email|


Scenario: Test Manage Users Page
When user cliks Manage users
Then user verifies Manage users headers
|UserName|Email|Roles|

 
