package com.rappidtech.stepdefinitions;

import com.rappidtech.pages.LoginPage;
import com.rappidtech.pages.MainPage;
import com.rappidtech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class VerifyMainPageItems {
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    @Given("User is navigated successfully to Sauce Demo Main page")
    public void user_is_navigated_successfully_to_sauce_demo_main_page() {
        Driver.getDriver().get("https://www.saucedemo.com/");
        loginPage.loginUsingValidCredentials();
    }
    @Then("User is able to see the list of Labels")
    public void user_is_able_to_see_the_list_of_labels(List<String> expectedLabels) {
        Assert.assertEquals(expectedLabels, mainPage.getListOfInventoryItems());
    }
}
