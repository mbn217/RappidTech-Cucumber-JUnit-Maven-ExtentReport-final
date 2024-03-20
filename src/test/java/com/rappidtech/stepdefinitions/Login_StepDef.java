package com.rappidtech.stepdefinitions;

import com.rappidtech.pages.LoginPage;
import com.rappidtech.pages.MainPage;
import com.rappidtech.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class Login_StepDef {
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Given("User is navigated successfully to Sauce Demo Login page")
    public void user_is_navigated_successfully_to_sauce_demo_login_page() {
        Driver.getDriver().get("https://www.saucedemo.com/");
    }

    @When("User enters valid user name {string} and valid password {string}")
    public void user_enters_valid_user_name_and_valid_password(String userName, String password) {
        loginPage.enterUserName(userName);
        loginPage.enterPassword(password);
        loginPage.clickOnSubmitButton();
    }

    @Then("user should be able to see the main page logo")
    public void user_should_be_able_to_see_the_main_page_logo() {
        Assert.assertTrue(mainPage.isMainLogoLabelDisplayed());
    }

    @And("user should be able to verify the list of links")
    public void user_should_be_able_to_verify_the_list_of_links(DataTable dataTable) {
        //Get the list of expected links from the feature file
        List<String> expectedLinks = dataTable.asList();
        List<String> actualLinks = new ArrayList<>();
        actualLinks.add(mainPage.getTwitterLink());
        actualLinks.add(mainPage.getFacebookLink());
        actualLinks.add(mainPage.getLinkedInLink());

        Assert.assertEquals(expectedLinks, actualLinks);

    }

    @When("User enters invalid user name {string} and invalid password {string}")
    public void user_enters_invalid_user_name_and_invalid_password(String userName, String password) {
        loginPage.enterUserName(userName);
        loginPage.enterPassword(password);
        loginPage.clickOnSubmitButton();
    }

    @Then("user should verify the errors message {string} is displayed")
    public void user_should_verify_the_errors_message_is_displayed(String expectedLockedOutErrorMessage) {
        Assert.assertEquals(loginPage.getLockedOutErrorMessage() , expectedLockedOutErrorMessage);
    }



}
