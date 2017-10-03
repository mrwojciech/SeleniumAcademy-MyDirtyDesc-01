package com.s3group.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyDriver {

    private static WebDriver driver;
    private static Logger log = LoggerFactory.getLogger(MyDriver.class);

    private MyDriver() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = instantiate();
        }
        log.info("Getting the driver");
        return driver;
    }

    private static WebDriver instantiate() {
        String driverType = MyProperties.getBrowser();
        switch (driverType) {

            case "firefox":
                System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
                driver = new FirefoxDriver();
                log.info("Selecting Firefox driver");
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
                log.info("Selecting chrome driver");
                break;
            default:
                driver = new FirefoxDriver();
                log.info("Selecting firefox driver by default");
        }
        log.info("Initiating the driver");
        driver.manage().window().maximize();
        log.info("Maximizing browser window");
        return driver;
    }
}