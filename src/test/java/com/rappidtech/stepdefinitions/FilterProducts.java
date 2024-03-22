package com.rappidtech.stepdefinitions;

import com.rappidtech.pages.MainPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class FilterProducts {
    MainPage mainPage = new MainPage();
    @Then("User should be able to see the Default filtering option displayed")
    public void user_should_be_able_to_see_the_default_filtering_option_displayed() {
        Assert.assertTrue(mainPage.checkDefaultFilterSelection("Name (A to Z)"));
    }

    @Then("User should be able to see the Default filtering option2 displayed")
    public void user_should_be_able_to_see_the_default_filtering_option2_displayed(List<Map<String,String>> filterOptions) {
        System.out.println(filterOptions);
        System.out.println(filterOptions.get(0).get("value"));
        Assert.assertEquals(Boolean.valueOf(filterOptions.get(0).get("value")),mainPage.checkDefaultFilterSelection("Name (A to Z)"));

    }


}
