Feature: Validate the list of users
  As a user I need to validate that we have the list of users displayed on the login page

  @integration @regression @smoke
  Scenario: User is able to validate the list of users
    Given User is navigated successfully to Sauce Demo Login page
    Then user is able to verify that the list of users is displayed
      | standard_user           |
      | locked_out_user         |
      | problem_user            |
      | performance_glitch_user |
      | error_user              |
      | visual_user             |

