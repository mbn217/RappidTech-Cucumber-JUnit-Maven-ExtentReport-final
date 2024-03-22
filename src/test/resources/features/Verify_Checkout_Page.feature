Feature: Verify Checkout Page

  Scenario: Verify The label in the checkout page
    Given User is navigated successfully to Sauce Demo Main page
    And user clicks on the Shopping cart Icon
    And user clicks on checkout button
    Then user should be able to verify that below label are displayed
      | Labels                     | isDisplayed |
      | checkout: Your Information | true        |
      | First Name                 | true        |
      | Last Name                  | true        |
      | Cancel                     | true        |
      | continue                   | true        |