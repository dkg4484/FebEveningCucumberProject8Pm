Feature: Testing Cart feature

Scenario: Test positive use case of Amazon Cart Scenario

# Given --> Pre Condition (Set up / Delete Cokkies / Released Closed DB)
# And
# When --> Bussiness code (Action)
# And --> Multiple Actions 
# Then --> Validation Point (Assertion / Verfication / Post condition)
# And

#Gherkin Keywords / Language -> DSL (Domain Specific Language)

# English formatted scenarios

Given As a customer we launches the amazon "PROD" url "https://www.amazon.in"
When As a customer we browser the product from the store
And As a customer we click the add to cart button
Then As a user we done the checkout of 100 ruppes



