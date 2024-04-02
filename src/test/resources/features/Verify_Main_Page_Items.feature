Feature: Check Item in the Main Page
  User should be able to see the items in the main page

  @integration
  Scenario: User is able to see the list of items in the main page
    Given User is navigated successfully to Sauce Demo Main page
    Then User is able to see the list of Labels
      | Sauce Labs Backpack               |
      | Sauce Labs Bike Light             |
      | Sauce Labs Bolt T-Shirt           |
      | Sauce Labs Fleece Jacket          |
      | Sauce Labs Onesie                 |
      | Test.allTheThings() T-Shirt (Red) |

