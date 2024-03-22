package com.rappidtech.pages;

import com.rappidtech.utilities.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverViewPage {

    private static final Logger logger = LogManager.getLogger(CheckoutOverViewPage.class);
    WebDriver driver ;

    /**
     * Constructor to initialize the webdriver and elements on the page
     */
    public CheckoutOverViewPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[.='Payment Information']")
    WebElement paymentInformationLabel;

    @FindBy(xpath = "//div[.='Shipping Information']")
    WebElement shippingInformationLabel;

    @FindBy(xpath = "//div[contains(text(),'Total:')]")
    WebElement totalPriceLabel;


    //+++++++++++++++++++++++++++++++++++++++++++++ Method / Functions +++++++++++++++++++++++++++++++++++++++++++++++


    public boolean isPaymentInformationLabelDisplayed(){
        logger.info(" Checking if the payment information label is displayed");
        return paymentInformationLabel.isDisplayed();
    }
    public boolean isShippingInformationLabelDisplayed(){
        logger.info(" Checking if the shipping information label is displayed");
        return shippingInformationLabel.isDisplayed();
    }

    public String getTotalPrice(){
        logger.info("Getting the total price of the items from the overview pages");
        return totalPriceLabel.getText().split(" ")[1]; //Total: $43.18
    }









}
