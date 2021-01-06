package com.javastudio.tutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class Application {
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        LOGGER.info("Hello world!");

        new Thread(() -> {
            while (true) {
                try {
                    int next = new Random().nextInt(10);
                    if (next == 7)
                        throw new RuntimeException("The random number could not be 7");

                    LOGGER.info("{}", next);
                    Thread.sleep(next * 10);
                } catch (Exception e) {
                    LOGGER.error(e.getMessage(), e);
                    Metrics.EXCEPTION_COUNTER.inc();
                }
            }
        }).start();

        PrometheusEndpoint.init();
    }
}
