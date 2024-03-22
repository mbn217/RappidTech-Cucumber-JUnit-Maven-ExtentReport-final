package com.rappidtech.stepdefinitions;

import com.rappidtech.pages.CheckoutOverViewPage;
import com.rappidtech.pages.CheckoutPage;
import com.rappidtech.pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VerifyCheckoutOverviewPage {
    MainPage mainPage = new MainPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    CheckoutOverViewPage checkoutOverViewPage = new CheckoutOverViewPage();

    @When("user click on add to cart for the item Sauce Labs Bike Light")
    public void user_click_on_add_to_cart_for_the_item_sauce_labs_bike_light() {
        mainPage.clickOnAddToCartForBikeLightButton();
    }
    @And("user enters first Name {string}")
    public void user_enters_first_name(String firstName) {
        checkoutPage.enterFirstName(firstName);
    }
    @And("user enters last Name {string}")
    public void user_enters_last_name(String lastName) {
        checkoutPage.enterLastName(lastName);
    }
    @And("user enters zip code {string}")
    public void user_enters_zip_code(String zipCode) {
        checkoutPage.enterZipCode(zipCode);
    }
    @And("user clicks on the continue button in checkout Page")
    public void user_clicks_on_the_continue_button_in_checkout_page() {
        checkoutPage.clickOnContinueButton();
    }
    @Then("user should be able to verify that Payment Information Label is Displayed")
    public void user_should_be_able_to_verify_that_payment_information_label_is_displayed() {
        Assert.assertTrue(checkoutOverViewPage.isPaymentInformationLabelDisplayed());
    }
    @And("user should be able to verify that Shipping Information Label is Displayed")
    public void user_should_be_able_to_verify_that_shipping_information_label_is_displayed() {
        Assert.assertTrue(checkoutOverViewPage.isShippingInformationLabelDisplayed());
    }
    @And("user should be able to verify that Total: {string} Label is Displayed")
    public void user_should_be_able_to_verify_that_total_$_label_is_displayed(String expectedTotalPrice) {
        Assert.assertEquals(checkoutOverViewPage.getTotalPrice(), expectedTotalPrice);
    }

}
