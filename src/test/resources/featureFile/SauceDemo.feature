Feature: Test Sauce-Ecommerce Demo Feature

@HighestPricingProduct
Scenario: Test highest price product

Given the user launches the particular url "https://www.saucedemo.com/"
When the user sends username "standard_user" and password "secret_sauce"
And the user clicks the login button
Then the user should verifies the url of the webpage "https://www.saucedemo.com/inventory.html"
When the user finding the highest pricing product
Then the user should validate this prodcut by checking the remove button

@LowestPricingProduct
Scenario: Test lowest price product

#Given the user launches the particular url "https://www.saucedemo.com/"
#When the user sends username "standard_user" and password "secret_sauce"
#And the user clicks the login button
#Then the user should verifies the url of the webpage "https://www.saucedemo.com/inventory.html"
When the user finding the lowest pricing product
Then the user should validate this prodcut by checking the remove button

#Scenario: Test highest pricing product
#
