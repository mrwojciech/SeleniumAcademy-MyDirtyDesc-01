package com.s3group.Utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;

import java.io.IOException;
import java.io.InputStream;

public class Properties {

    private static final int TESTNG_FAILURE_STATUS = 2;

    private static Logger log = LoggerFactory.getLogger(Properties.class);
    private static java.util.Properties properties = loadProperties();

    public static String getBrowser() {
        return properties.getProperty("BROWSER");
    }

    public static String getBaseURL() {
        return properties.getProperty("ENV");
    }


    private static java.util.Properties loadProperties() {
        String file = "testConfiguration.properties";
        java.util.Properties properties = new java.util.Properties();
        try (InputStream inputStream = Properties.class.getClassLoader().getResourceAsStream(file)) {
            properties.load(inputStream);
            log.info("Trying to load test properties from :{} ", file);
        } catch (IOException e) {
            e.printStackTrace();
            log.info("Error when loading properties from : {}", file);
            ITestResult testResult = null;
            testResult.setStatus(TESTNG_FAILURE_STATUS);
        }

        String driverType = properties.getProperty("BROWSER");
        log.info("Set driver to : {} ", driverType);
        log.info("Set baseURL to : {} ", properties.getProperty("ENV"));
        return properties;
    }
}