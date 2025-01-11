# language: en

  Feature: Login
    As a Swag Labs user
    I want to access the website
    To manage my purchases

    Scenario: Access successful
      Given I access the Swag Lab website
      When  I login with valid credentials
      Then  I should be able to see the products list

    Scenario:  Validate if clicking the button without entering the fields is not allowing login
      Given I access the Swag Lab website
      When  I click on the login button
      Then  It displays an error message

    Scenario: Validate blocked user error
      Given I access the Swag Lab website
      When  I enter a blocked credential
      Then  It displays an error message