package com.javastudio.tutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {

    private static Properties properties = new Properties();

    private static Logger logger = LoggerFactory.getLogger(Configuration.class);

    static {
        try (InputStream in = Configuration.class.getClassLoader().getResourceAsStream("application.properties")) {
            properties.load(in);
        } catch (IOException e) {
            logger.warn("Error loading application configuration!", e);
        }
    }

    public static String getProperty(String key) {
        return String.valueOf(properties.get(key));
    }
}
