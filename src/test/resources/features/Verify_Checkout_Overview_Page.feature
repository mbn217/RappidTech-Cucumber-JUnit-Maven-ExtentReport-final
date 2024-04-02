Feature: Verify Checkout Overview

  @regression
  Scenario: Verify That the Item is added in the checkout overview page
    Given User is navigated successfully to Sauce Demo Main page
    When User Clicks on Add to cart for the Item "Sauce Labs Backpack"
    And user click on add to cart for the item Sauce Labs Bike Light
    And user clicks on the Shopping cart Icon
    And user clicks on checkout button
    And user enters first Name "test123"
    And user enters last Name "test last name 123"
    And user enters zip code "20666"
    And user clicks on the continue button in checkout Page
    Then user should be able to verify that Payment Information Label is Displayed
    And user should be able to verify that Shipping Information Label is Displayed
    And user should be able to verify that Total: "$43.18" Label is Displayed
