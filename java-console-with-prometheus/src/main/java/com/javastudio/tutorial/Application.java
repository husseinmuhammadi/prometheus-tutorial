package com.javastudio.tutorial;

import com.javastudio.tutorial.job.JobRunner;
import com.javastudio.tutorial.metrics.Metrics;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;
import java.util.Random;

public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        LOGGER.info("Application started!");
        new Application().run();
    }

    private void run() {
        PrometheusEndpoint.init();
        JobRunner.INSTANCE.start();
    }
}
