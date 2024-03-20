package com.rappidtech.stepdefinitions;

import com.rappidtech.pages.CartPage;
import com.rappidtech.pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class VerifyCartItems {
        MainPage mainPage = new MainPage();
        CartPage cartPage = new CartPage();
    @And("user clicks on the Shopping cart Icon")
    public void user_clicks_on_the_shopping_cart_icon() {
        mainPage.clickOnShoppingCartLinkIcon();
    }

    @Then("user should verify that continue shopping button is displayed")
    public void user_should_verify_that_continue_shopping_button_is_displayed() {
        Assert.assertTrue(cartPage.isCheckoutButtonDisplayed());
    }
    @And("user should verify that Checkout button is displayed")
    public void user_should_verify_that_checkout_button_is_displayed() {
        Assert.assertTrue(cartPage.isContinueButtonDisplayed());
    }



}
