package com.rappidtech.stepdefinitions;

import com.rappidtech.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserListValidation {
        LoginPage loginPage =  new LoginPage();
    @Then("user is able to verify that the list of users is displayed")
    public void user_is_able_to_verify_that_the_list_of_users_is_displayed(List<String> expectedUsers) {

        List<String> actualUsers = Arrays.asList(loginPage.getListOfAcceptedUserNames());
        Assert.assertEquals(expectedUsers, actualUsers);

    }

}
