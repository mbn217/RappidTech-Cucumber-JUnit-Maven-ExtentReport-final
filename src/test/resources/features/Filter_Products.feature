Feature: Filter Products
  As a User I want to see a default filter option for products
  in the main page

  Scenario: Checking Default Filtering Option is Name(A to Z)
    Given User is navigated successfully to Sauce Demo Main page
    Then User should be able to see the Default filtering option displayed
    Then User should be able to see the Default filtering option2 displayed
      | filtering option2 | value |
      | Name (A to Z)     | true  |