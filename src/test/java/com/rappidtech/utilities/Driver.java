package com.rappidtech.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * Driver class that will take care of the logic for the WebDriver and getting instances of the driver back
 */
public class Driver {
    private static final Logger logger = LogManager.getLogger(Driver.class);

    public static WebDriver driver;

    /**
     * This will return an instance of the driver , it will check if the driver is null , if not then it will return same instance
     * if its null then it will fo inside the condition and create a new instance of the webdriver for you
     * @return it return an instance of the webdriver
     */
    public static WebDriver getDriver() {
        //We will get the browser type from the configuration.properties file
        String browser = ConfigurationReader.getProperty("browserType");
        logger.info("Getting a driver instance");
        if(driver == null){
            //Create webdriver based on the value of the browser
            switch (browser.toLowerCase()){
                case "firefox":
                    logger.info("Starting a firefox browser");
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    logger.info("Starting a Edge browser");
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "headless-chrome":
                    logger.info("Starting a Chrome headless browser");
                    //WebDriverManager.chromedriver().setup();
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--headless=new");
                    driver = new ChromeDriver(chromeOptions);
                    break;
                case "headless-firefox":
                    logger.info("Starting a firefox headless browser");
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.addArguments("-headless");
                    driver = new FirefoxDriver(firefoxOptions);
                    break;
                case "remote-grid-chrome":
                    URL url = null;
                    try {
                        url = new URL("http://localhost:4444/wd/hub");
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }
                    ChromeOptions gridOptions = new ChromeOptions();
                    driver = new RemoteWebDriver(url , gridOptions);
                    break;

                case "aws-server":
                    URL urlaws = null;
                    try {
                        urlaws = new URL("http://ec2-100-27-10-98.compute-1.amazonaws.com:4444/wd/hub");
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }
                    ChromeOptions awsgridOptions = new ChromeOptions();
                    driver = new RemoteWebDriver(urlaws , awsgridOptions);
                    break;
                default:
                    logger.info("Starting a Chrome browser");
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
            }
        }
        driver.manage().window().maximize();
        return driver;
    }

    /**
     * This method will close the driver and nullify it by setting it to null
     */
    public static void closeWebdriver(){
        logger.info("Closing the browser");
        if(driver !=null){
            driver.quit();
            driver = null; // make the driver equal to null
        }

    }




}
