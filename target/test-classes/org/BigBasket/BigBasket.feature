Feature: Order Groceries

Background: 
Given Launch the URL

Scenario: Searching stationary Items
Given user searching for  books
When user select the product
|colour books|comics|
Then user is able to add the product in cart

Scenario: Searching Baby products
Given User searching Baby products "Baby Products"

When User searching Baby shampoo
|Brand|Himalaya shampoo|
|Brand1|Johnson shampoo|

And Searching Baby Powder

|Brand2|Himalaya Baby Powder|

|Brand3|Johnson Baby Powder|

And Searching Baby Soap
|Johnson Baby soap|

Then Added Items to cart


