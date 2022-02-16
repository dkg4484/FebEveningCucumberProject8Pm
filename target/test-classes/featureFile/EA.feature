@EA
Feature: Test EA 

@Login @EPIC01_A @US_01
Scenario: Test login
Given user launches the url
When user enters username "admin"
And user enters password "password"
And user clicks Log in button
Then user verifies the title

@EmployeeDetails @EPIC01_B @Smoke
Scenario: Test Employee Details Page
When user cliks Employee Details 
Then user verifies the headers
|Name|Salary|Grade|

@EmployeeList @EPIC01_C @Smoke
Scenario: Test Employee List Page
When user cliks Employee List
Then user verifies employee list headers
|Name|Salary|DurationWorked|Grade|Email|

@ManageUsers @EPIC01_D @Sanity
Scenario: Test Manage Users Page
When user cliks Manage users
Then user verifies Manage users headers
|UserName|Email|Roles|

 
