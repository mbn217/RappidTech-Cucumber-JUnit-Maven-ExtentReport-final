package com.rappidtech.stepdefinitions;

import com.rappidtech.pages.LoginPage;
import com.rappidtech.pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ManageShoppingCart {
    MainPage mainPage = new MainPage();
    @When("User Clicks on Add to cart for the Item {string}")
    public void user_clicks_on_add_to_cart_for_the_item(String string) {
        mainPage.clickOnAddToCartForBackPackButton();
    }

    @Then("User should verify that the Cart icon updated with One Item")
    public void user_should_verify_that_the_cart_icon_updated_with_one_item() {
        Assert.assertTrue(!mainPage.checkShoppingCartBadgeIsEmpty());
    }

    @And("User Click on Remove button")
    public void user_click_on_remove_button() {
        mainPage.clickOnRemoveFromCartForBackPackButton();
    }

    @Then("User should verify that the cart total items number changed")
    public void user_should_verify_that_the_cart_total_items_number_changed() {
        Assert.assertTrue(mainPage.checkShoppingCartBadgeIsEmpty());
    }

}
