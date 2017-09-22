package com.s3group.Utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyProperties {

    private static Logger log = LoggerFactory.getLogger(MyProperties.class);
    private static Properties properties = loadProperties();

    public static String getBrowser(){
        return properties.getProperty("BROWSER");
    }

    public static String getBaseURL(){
        return properties.getProperty("ENV");
    }


    private static Properties loadProperties() {
        String file = "testConfiguration.properties";
        Properties properties = new Properties();
        try (InputStream inputStream = MyProperties.class.getClassLoader().getResourceAsStream(file)) {
            properties.load(inputStream);
            log.info("Trying to load test properties from :{} ", file);
        } catch (IOException e) {
            e.printStackTrace();
            log.info("Error when loading properties from : {}", file);
        }

        String driverType = properties.getProperty("BROWSER");
        log.info("Set driver to : {} ", driverType);
        log.info("Set baseURL to : {} ", properties.getProperty("ENV"));
        return properties;
    }
}