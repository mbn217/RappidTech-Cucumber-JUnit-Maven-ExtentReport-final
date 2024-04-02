Feature: Verify Cart Items

  @regression @smoke
  Scenario: Verify labels are displayed in the Cart page
    Given User is navigated successfully to Sauce Demo Main page
    When User Clicks on Add to cart for the Item "Sauce Labs Backpack"
    And user clicks on the Shopping cart Icon
    Then user should verify that continue shopping button is displayed
    And user should verify that Checkout button is displayed
