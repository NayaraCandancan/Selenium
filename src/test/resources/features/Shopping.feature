# language: en

Feature: Shopping
  As a Swag Labs user
  I want to access shopping list
  To buy goods online

  Scenario: Make a successful purchase
    Given I access the Swag Lab website and I make sucessful Login
    When  I add an item to the cart
    And   Enter my personal information to make the purchase
    And   I click on the finish button
    Then  I make a purchase successfully