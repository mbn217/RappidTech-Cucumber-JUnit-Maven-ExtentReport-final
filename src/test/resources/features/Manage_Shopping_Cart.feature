Feature: Manage Shopping Cart

  Background:
    Given User is navigated successfully to Sauce Demo Main page
    When User Clicks on Add to cart for the Item "Sauce Labs Backpack"


  Scenario: Adding an Item to the Cart
    Then User should verify that the Cart icon updated with One Item

  Scenario: Removing an Item from the Cart
    And User Click on Remove button
    Then User should verify that the cart total items number changed
