package com.javastudio.tutorial;

import com.javastudio.tutorial.configuration.PrometheusEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Application {
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        new Application().run();
    }

    private void run() {
        LOGGER.info("Application started!");
        PrometheusEndpoint.init();

        Rate rate = new Rate(Math.PI);

        Thread thread1 = new RequestHandler(rate);
        Thread thread2 = new RateControl(rate);
        thread1.setDaemon(true);
        thread2.setDaemon(true);
        thread1.start();
        thread2.start();
    }
}
