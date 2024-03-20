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

    @Then("user should verify that below labels are displayed")
    public void user_should_verify_that_below_labels_are_displayed(List<String> buttons) {

            Assert.assertTrue(cartPage.isCheckoutButtonDisplayed());
            Assert.assertTrue(cartPage.isContinueButtonDisplayed());

    }



}
