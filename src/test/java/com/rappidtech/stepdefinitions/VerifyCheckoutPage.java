package com.rappidtech.stepdefinitions;

import com.rappidtech.pages.CartPage;
import com.rappidtech.pages.CheckoutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class VerifyCheckoutPage {
    CheckoutPage checkoutPage = new CheckoutPage();
    CartPage cartPage = new CartPage();

    @Given("user clicks on checkout button")
    public void user_clicks_on_checkout_button() {
        cartPage.clickOnCheckoutButton();
    }
    @Then("user should be able to verify that below label are displayed")
    public void user_should_be_able_to_verify_that_below_label_are_displayed(List<Map<String,String>> listOfLabels) {
        System.out.println(listOfLabels);

        for(int i = 0; i < listOfLabels.size(); i++){
            System.out.println(" ========   "+listOfLabels.get(i).get("isDisplayed"));
            if(listOfLabels.get(i).get("Labels").equals("checkout: Your Information")){
                Assert.assertEquals(checkoutPage.isCheckoutMainLabelDisplayed(), Boolean.valueOf(listOfLabels.get(i).get("isDisplayed")));
            } else if (listOfLabels.get(i).get("Labels").equals("First Name")) {
                Assert.assertEquals(checkoutPage.isFirstNameInputBoxDisplayed(), Boolean.valueOf(listOfLabels.get(i).get("isDisplayed")));
            }else if (listOfLabels.get(i).get("Labels").equals("Last Name")) {
                Assert.assertEquals(checkoutPage.isLastNameInputBoxDisplayed(), Boolean.valueOf(listOfLabels.get(i).get("isDisplayed")));
            }else if (listOfLabels.get(i).get("Labels").equals("Cancel")) {
                Assert.assertEquals(checkoutPage.isCancelButtonDisplayed(), Boolean.valueOf(listOfLabels.get(i).get("isDisplayed")));
            }else if (listOfLabels.get(i).get("Labels").equals("continue")) {
                Assert.assertEquals(checkoutPage.isContinueButtonDisplayed(), Boolean.valueOf(listOfLabels.get(i).get("isDisplayed")));
            }
        }


//        Assert.assertEquals(checkoutPage.isCheckoutMainLabelDisplayed(), Boolean.valueOf(listOfLabels.get(0).get("isDisplayed")));
//        Assert.assertEquals(checkoutPage.isFirstNameInputBoxDisplayed(), Boolean.valueOf(listOfLabels.get(1).get("isDisplayed")));
//        Assert.assertEquals(checkoutPage.isLastNameInputBoxDisplayed(), Boolean.valueOf(listOfLabels.get(2).get("isDisplayed")));
//        Assert.assertEquals(checkoutPage.isCancelButtonDisplayed(), Boolean.valueOf(listOfLabels.get(3).get("isDisplayed")));
//        Assert.assertEquals(checkoutPage.isContinueButtonDisplayed(), Boolean.valueOf(listOfLabels.get(4).get("isDisplayed")));

    }

}
