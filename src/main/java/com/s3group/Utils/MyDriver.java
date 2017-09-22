package com.s3group.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyDriver {

    private static WebDriver driver = null;
    private static Logger log = LoggerFactory.getLogger(MyDriver.class);

    private MyDriver() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = instantiate();
            log.info("Initiating the com.s3group.PageObject.CareersPage object");
            log.info("Initiating PageFactory for object com.s3group.PageObject.CareersPage.");
        }
        return driver;
    }

    private static WebDriver instantiate() {
        String driverType = MyProperties.getBrowser();
        switch (driverType) {

            case "firefox":
                System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            default:
                driver = new FirefoxDriver();
        }
        return driver;
    }
}