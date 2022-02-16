@Sample
Feature: Simple datadriven session

#How to create the common reusable pre and post steps in Gherkin thereby it should be

#applied with different scenarios in Feature file? 


Scenario: Test1  #==> Number of rows used in Examples

Given I launch the url "https://www.facebook.com"
When I send the "twUn" and "twPwd"
And I click the login button
Then I do the assertion for the title

#Examples:
#|Username|
#|oneUn|
#|twoUn|
#|thirdUn|
#|fourthUn|

#Examples:
#|Password|
#|1|
#|2|
#|3|
#|4|

Scenario: Test2 

Given I launch the url "https://www.facebook.com"
When I send the "twoUn" and "twoPwd"
And I click the login button
Then I do the assertion for the title

Scenario: Test3

Given I launch the url "https://www.facebook.com"
When I send the "thirdUn" and "thirdPwd"
And I click the login button
Then I do the assertion for the title

Scenario: Test4 

Given I launch the url "https://www.facebook.com"
When I send the "fourthUn" and "fourthpwd"
And I click the login button
Then I do the assertion for the title

