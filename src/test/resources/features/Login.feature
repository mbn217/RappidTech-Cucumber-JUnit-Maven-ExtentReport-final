@smoke
Feature: Login to Sauce Demo

  As a user I want to verify if the user is able to login or not

  Background:
    Given User is navigated successfully to Sauce Demo Login page


  Scenario: User is able to login with Valid UserName and Password
    When User enters valid user name "standard_user" and valid password "secret_sauce"
    Then user should be able to see the main page logo
    And user should be able to verify the list of links
      | https://twitter.com/saucelabs                |
      | https://www.facebook.com/saucelabs           |
      | https://www.linkedin.com/company/sauce-labs/ |


  Scenario: User is not able to login with inValid UserName and Password
    When User enters invalid user name "locked_out_user" and invalid password "secret_sauce"
    Then user should verify the errors message "Epic sadface: Sorry, this user has been locked out." is displayed


