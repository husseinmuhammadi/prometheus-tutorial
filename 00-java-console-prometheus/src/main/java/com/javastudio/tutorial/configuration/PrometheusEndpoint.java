package com.javastudio.tutorial.configuration;

import io.prometheus.client.exporter.HTTPServer;
import io.prometheus.client.hotspot.DefaultExports;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class PrometheusEndpoint {
    private static final Logger LOGGER = LoggerFactory.getLogger(PrometheusEndpoint.class);

    public static final int PORT = 8000;

    public static void init() {
        new Thread(() -> {
            try {
                DefaultExports.initialize();
                LOGGER.info("Initialize prometheus on port {}", PORT);
                HTTPServer server = new HTTPServer(PORT);
            } catch (IOException e) {
                LOGGER.warn(e.getMessage(), e);
            }
        }).start();
    }
}
