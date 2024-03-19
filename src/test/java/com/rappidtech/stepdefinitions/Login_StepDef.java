package com.rappidtech.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDef {
    @Given("User is navigated successfully to Sauce Demo Login page")
    public void user_is_navigated_successfully_to_sauce_demo_login_page() {

    }

    @When("User enters valid user name {string} and valid password {string}")
    public void user_enters_valid_user_name_and_valid_password(String string, String string2) {

    }

    @Then("user should be able to see the main page logo")
    public void user_should_be_able_to_see_the_main_page_logo() {

    }

    @And("user should be able to verify the list of links")
    public void user_should_be_able_to_verify_the_list_of_links(DataTable dataTable) {

    }

    @When("User enters invalid user name {string} and invalid password {string}")
    public void user_enters_invalid_user_name_and_invalid_password(String string, String string2) {

    }

    @Then("user should verify the errors message {string} is displayed")
    public void user_should_verify_the_errors_message_is_displayed(String string) {

    }



}
