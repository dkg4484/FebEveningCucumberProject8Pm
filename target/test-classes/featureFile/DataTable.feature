@DataTable
Feature: Test Discover feature

Scenario: Test Account login Scenario

Given the user launches the url 
|https://www.discover.com/|
|https://www.google.com|
|https://www.gmail.com|

When the user enters username password Email and MobileNum
|Oraniumtech|Admin123|oraniumtech@gmail.com|7305343555|

And the user sending dob and gender
|DOB|17/04/1990|
|GENDER|Male|

Then the user passes different details
|Sudhakar|Admin123|sudhakar@gmail.com|7305343555|
|Rajesh|admin123|rajesh@gmail.com|8305343555|
|Nakul|Admin12|nakul@gmail.com|9305343555|

And the user giving additional details
|Name|Pwd|EmailId|MobileNumber|
|Sudhakar|Admin123|sudhakar@gmail.com|7305343555|
|Rajesh|admin123|rajesh@gmail.com|8305343555|
|Nakul|Admin12|nakul@gmail.com|9305343555|

And Test
|12|
