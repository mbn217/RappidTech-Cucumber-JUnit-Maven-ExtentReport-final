Feature: Verify Item in Cart

  Scenario: Verify One item is added into the Cart Page
    Given User is navigated successfully to Sauce Demo Main page
    When User Clicks on Add to cart for the Item "Sauce Labs Backpack"
    And user clicks on the Shopping cart Icon
    Then user should be able to verify price is equal to "$29.99"
    And user should be able to verify that description of item is equal to "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection."