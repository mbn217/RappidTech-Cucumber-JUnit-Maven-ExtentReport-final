package com.rappidtech.stepdefinitions;

import com.rappidtech.pages.CartPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class VerifyItemsInCart {
    CartPage cartPage = new CartPage();
    @Then("user should be able to verify price is equal to {string}")
    public void user_should_be_able_to_verify_price_is_matching(String expectedPrice) {
        Assert.assertEquals(cartPage.getBackPackPriceLabel() , expectedPrice);
    }
    @Then("user should be able to verify that description of item is equal to {string}")
    public void user_should_be_able_to_verify_that_description_of_item_is_matching(String expectedDescription) {
        Assert.assertEquals(cartPage.getBackPackDescriptionLabel(), expectedDescription);
    }


}
